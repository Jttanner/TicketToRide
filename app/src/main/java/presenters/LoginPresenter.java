package presenters;

import android.content.Context;

import java.lang.ref.WeakReference;

import MVP_coms_classes.MVP_Main;

/**
 * Created by tyler on 9/26/2017.
 * The presenter for the Login/Register View, its function is self explanatory. It handles the logic for logging in and registering
 */

public class LoginPresenter  implements MVP_Main.RequiredPresenterOps, MVP_Main.LoginViewOps{
    private WeakReference<MVP_Main.RequiredPresenterOps> myView;

    /**
     * Presenter Constructor
     * @param view  MainActivity
     */
    public LoginPresenter(MVP_Main.RequiredPresenterOps view) {
        myView = new WeakReference<>(view);
    }

    /**
     * Return the View reference.
     * Throw an exception if the View is unavailable.
     */
    private MVP_Main.RequiredPresenterOps getView() throws NullPointerException{
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
    public void LoginResult(boolean success) {

    }

    @Override
    public void RegisterResult(boolean success) {

    }
}
