package MVP_coms_classes;

import android.content.Context;

/**
 * Created by tyler on 9/27/2017.
 * The implemented methods the presenter can call onto the view
*/

public class LoginVOpsImpl implements MVP_Main.LoginViewOps {
    @Override
    public Context getAppContext() {
        //WILL NOT WORK AS OF RIGHT NOW
        return getAppContext();
    }

    @Override
    public Context getActivityContext() {
        //WILL NOT WORK AS OF RIGHT NOW
        return getActivityContext();
    }

    @Override
    public void LoginResult(boolean success) {

    }

    @Override
    public void RegisterResult(boolean success) {

    }
}
