package presenters;

import java.lang.ref.WeakReference;

import MVP_coms_classes.MVP_Main;
import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;
import servercomms.ServerProxy;

/**
 * Created by tyler on 9/26/2017.
 * The presenter for the login/register View, its function is self explanatory. It handles the logic for logging in and registering
 */

public class LoginPresenter extends Presenter implements MVP_Main.ProvidedLoginPresentOps{


    /**
     * Presenter Constructor
     * @param view  MainActivity
     */
    public LoginPresenter(MVP_Main.RequiredViewOps view) {
        this.myView = new WeakReference<>(view);
    }

    /**
     * Called by View during the reconstruction events
     * @param view  Activity instance
     */
    @Override
    public void setView(MVP_Main.RequiredViewOps view) {
        this.myView = new WeakReference<>(view);
    }




    //TODO need to make presenter do things to the view , for example result methods will probably just start next activity

    @Override
    public LoginResult login(LoginRequest request) {
        return ServerProxy.getInstance().Login(request);
    }

    @Override
    public RegisterResult register(RegisterRequest request) {
        return ServerProxy.getInstance().Register(request);
    }
}
