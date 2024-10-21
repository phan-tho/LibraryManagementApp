package Event;


import java.util.Scanner;

/**
 * Require user type into username and password
 * Return username and password to use in class LoginPanel
 */
public class LoginEvent {
    private final String user;
    private final String password;

    public LoginEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        user = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
