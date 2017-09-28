package MVP_coms_classes;

import servercomms.ServerProxy;

/**
 * Created by tyler on 9/27/2017.
 * The implemented methods offered to the view to call on the presenter
 */
public class LoginPOpsImpl implements MVP_Main.LoginPresentOps {
    @Override
    public LoginResult Login(LoginRequest loginRequest) {
        //the GUI will check the success?
        return ServerProxy.getInstance().Login(loginRequest);
    }

    @Override
    public RegisterResult Register(RegisterRequest registerRequest) {
        return ServerProxy.getInstance().Register(registerRequest);
    }
}
