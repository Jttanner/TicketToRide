package presenters;

import android.content.Context;

import java.lang.ref.WeakReference;

import MVP_coms_classes.MVP_Main;
import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;
import modeling.ResultObject;
import servercomms.ServerProxy;

/**
 * Created by tyler on 9/26/2017.
 * The presenter for the login/register View, its function is self explanatory. It handles the logic for logging in and registering
 */

public class LoginPresenter implements MVP_Main.RequiredLoginViewOps, MVP_Main.ProvidedLoginPresentOps{
    private WeakReference<MVP_Main.RequiredLoginViewOps> myView;

    /**
     * Presenter Constructor
     * @param view  MainActivity
     */
    public LoginPresenter(MVP_Main.RequiredLoginViewOps view) {
        myView = new WeakReference<>(view);
    }

    /**
     * Called by View during the reconstruction events
     * @param view  Activity instance
     */
    @Override
    public void setView(MVP_Main.RequiredLoginViewOps view) {
        myView = new WeakReference<>(view);
    }

    //TODO need to make presenter do things to the view , for example result methods will probably just start next activity

    @Override
    public void login(LoginRequest request) {
        LoginResult result = ServerProxy.getInstance().Login(request);
        checkSuccess(result);
    }

    @Override
    public void register(RegisterRequest request) {
        RegisterResult result = ServerProxy.getInstance().Register(request);
        checkSuccess(result);
    }
    /**Checks the success of the login or registration
     * @param result The result of the login/reg
     * */
    private void checkSuccess(ResultObject result) {
        if(result.isSuccess()){
            //TODO we need to start the create game activity

        }
        else {
            //TODO we need to pop a toast to the user telling them what failed
        }
    }

    /**
     * Return the View reference.
     * Throw an exception if the View is unavailable.
     */
    private MVP_Main.RequiredLoginViewOps getView() throws NullPointerException{
        if ( myView != null )
            return myView.get();
        else
            throw new NullPointerException("View is unavailable");
    }

    @Override
    public Context getAppContext() {
        try {
            return getView().getAppContext();
        } catch (NullPointerException e) {
            return null;
        }
    }

    /**
     * @return  Activity context
     */
    @Override
    public Context getActivityContext() {
        try {
            return getView().getActivityContext();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
