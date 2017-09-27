package presenters;

import android.content.Context;

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

public class LoginPresenter  implements MVP_Main.RequiredPresenterOps, MVP_Main.ProvidedLoginPresentOps{
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

    /**
     * @return  Application context
     */
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
    //TODO need to make presenter do things to the view , for example these result methods will probably just start next activity

    @Override
    public LoginResult login(LoginRequest request) {
        return ServerProxy.getInstance().Login(request);
        //return mPresenter.login(request);
    }

    @Override
    public RegisterResult register(RegisterRequest request) {
        return ServerProxy.getInstance().Register(request);
        //return mPresenter.register(request);
    }
}
