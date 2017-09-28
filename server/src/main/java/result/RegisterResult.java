package result;

/**
 * Created by Hwang on 9/28/2017.
 */

public class RegisterResult {

    private String userName;
    private boolean success;
    private String message;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isSuccess() { return success; }

    public void setSuccess(boolean success) { this.success = success; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String errorMessage) {
        this.message = message;
    }
}
