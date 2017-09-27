package modeling.Request;

/**
 * Created by jontt on 9/27/2017.
 */

public class RegisterRequest extends RequestObject {
    RegisterRequest(String userName, String password){
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
