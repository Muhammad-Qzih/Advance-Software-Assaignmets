package Company.Database;

import Company.Implementation.User;
import Company.Helpers.Messages.MessagePrinter;
import Company.Helpers.Validations.Validator;

import java.util.HashMap;

import java.util.Map;

public class Database {
    private static Database instance =null;
    private final String url;

    private static Map<Integer, User> users = new HashMap<>();

    private Database(String url) {
        MessagePrinter.connectingToDataBase();
        this.url = url;
    }

    public static Map<Integer, User> getAllUsers() {
        return users;
    }

    public static Database getInstance(String url) {
        if (instance == null) {
            instance = new Database(url);
        }
        return instance;
    }

    public static void addUser(User user) {
        if (!Validator.userCanBeAdded(users, user)) {
            return;
        }

        users.put(user.getId(), user);
        MessagePrinter.userSuccessfullyAdded();
    }

    public static void connect(User user) {
        user.setConnected(true);
    }

    public static void disConnect(User user) {
        user.setConnected(false);
    }

}
