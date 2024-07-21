package Company.Helpers.Validations;

import Company.Implementation.User;
import Company.Helpers.Messages.MessagePrinter;


import java.util.Map;

public class Validator {
    public static boolean isNull(User object) {
        return object == null;
    }

    public static boolean userIsExists(Map<Integer, User> users, User user) {
        return users.containsKey(user.getId());
    }


    public static boolean userCanBeAdded(Map<Integer, User> users, User user) {

        if (Validator.isNull(user)) {
            MessagePrinter.userIsNull();
            return false;
        }

        if (Validator.userIsExists(users, user)) {
            MessagePrinter.userExists();
            return false;
        }

        if (!user.isConnected()) {
            MessagePrinter.userNotConnectedInDatabase();
            return false;
        }

        return true;
    }
}
