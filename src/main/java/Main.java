import Event.LoginEvent;

public class Main {
    public static void main(String[] args) {
        LoginPanel loginPanel = new LoginPanel();
        while (loginPanel.login() == LoginPanel.USER_NOT_FOUND) {
            loginPanel.extractData(new LoginEvent());
            loginPanel.login();
        }

    }
}
