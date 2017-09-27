package Request;

/**
 * Created by jontt on 9/27/2017.
 */

public class LoginRequest {
    LoginRequest(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
