package Company.Helpers.Messages;

public class MessagePrinter {
    public static void userExists() {
        System.out.println("User is already exists!");
    }

    public static void userIsNull() {
        System.out.println("User is Null!");
    }

    public static void userSuccessfullyAdded() {
        System.out.println("User successfully added");
    }

    public static void userNotConnectedInDatabase() {
        System.out.println("User not connected!");
    }

    public static void connectingToDataBase() {
        System.out.println("Connecting To Database");
    }
}
