package modeling.Request;

/**
 * Created by jontt on 9/27/2017.
 */

public class LoginRequest extends RequestObject {

    LoginRequest(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
