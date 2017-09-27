package Result;

/**
 * Created by jontt on 9/27/2017.
 */

public class LoginResult {
    LoginResult(boolean success, String message){
        this.message = message;
        this.success = success;
    }
    private boolean success;
    private String message;
}
