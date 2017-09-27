package presenters;

import MVP_coms_classes.LoginVOpsImpl;
import MVP_coms_classes.MVP_Main;

/**
 * Created by tyler on 9/26/2017.
 * The presenter for the Login/Register View, its function is self explanatory. It handles the logic for logging in and registering
 */

class LoginPresenter  {
    private MVP_Main.LoginViewOps viewInterface = new LoginVOpsImpl();

    public void resultOfLogin(){
        //TODO do something with results
        //viewInterface.
    }

}
