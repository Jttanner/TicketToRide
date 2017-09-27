package modeling;

/**
 * Created by tyler on 9/26/2017.
 */
public class RegisterResult extends ResultObject{
    public RegisterResult(boolean success) {
        super(success);
    }

    public RegisterResult(boolean success, String errorMessage) {
        super(success, errorMessage);
    }
}
