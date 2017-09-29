package request;

/**
 * Created by Hwang on 9/28/2017.
 */

public class RegisterRequest extends RequestObject {

    private String userName;
    private String password;

    public RegisterRequest(String userName, String password) {
        super(userName, password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
