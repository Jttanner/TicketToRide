package modeling;

/**
 * Created by tyler on 9/26/2017.
 */
public class LoginResult extends ResultObject{
    public LoginResult(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    boolean success;
    String message;
}
