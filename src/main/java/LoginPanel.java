import Event.LoginEvent;

public class LoginPanel extends DataBaseAccessor{
    static final int ADMIN = 1;
    static final int NORM_USER = 2;
    static final int USER_NOT_FOUND = 0;
    static final String ADMIN_PASSWORD = "baconsoi";

    String user;
    String password;

    public LoginPanel() {
        connect();
        extractData(new LoginEvent());
        login();
    }

    public void extractData(LoginEvent loginEvent) {
        user = loginEvent.getUser();
        password = loginEvent.getPassword();
    }

    /**
     * Check user and password in database.
     * @return 0 if user is admin, 1 if normal user
     */
    public int login() {

        return ADMIN;
    }
}
