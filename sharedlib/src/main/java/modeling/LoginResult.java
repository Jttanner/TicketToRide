package modeling;

/**
 * Created by tyler on 9/26/2017.
 */
public class LoginResult extends ResultObject{
    public LoginResult(boolean success) {
        super(success);
    }

    public LoginResult(boolean success, String errorMessage) {
        super(success, errorMessage);
    }
}
