package modeling;

/**
 * Created by jontt on 9/27/2017.
 */

public class UserInfo {

    public UserInfo(String userName, String password, String userID){
        this.userName = userName;
        this.password = password;
        this.userID = userID;
    }

    String userName;
    String password;
    String userID;

    public LoginResult checkUserInfo(LoginRequest request){
        if (this.userName.equals(request.getUserName()) && this.password.equals(request.getPassword())){
            return new LoginResult(true, "Login Successful.");
        } else{
            return new LoginResult(false, "Invalid Username or Password.");
        }
    }

}
