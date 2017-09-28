/*
package presenters;

import android.content.Context;

import java.lang.ref.WeakReference;

import MVP_coms_classes.MVP_Main;

*/
/**
 * Created by tyler on 9/28/2017.
 * The presenter superclass, holds methods and implemenations which are common to all presenters
 * AS OF RIGHT NOW THIS IS NOT USED
 *//*


public class Presenter implements MVP_Main.RequiredPresenterOps {
    protected WeakReference<MVP_Main.RequiredLoginViewOps> myView;

    public Presenter(WeakReference<MVP_Main.RequiredLoginViewOps> myView) {
        this.myView = myView;
    }

    */
/**
     * Return the View reference.
     * Throw an exception if the View is unavailable.
     *//*

    private MVP_Main.RequiredLoginViewOps getView() throws NullPointerException{
        if ( myView != null )
            return myView.get();
        else
            throw new NullPointerException("View is unavailable");
    }

    */
/**
     * @return  Application context
     *//*

    @Override
    public Context getAppContext() {
        try {
            return getView().getAppContext();
        } catch (NullPointerException e) {
            return null;
        }
    }

    */
/**
     * @return  Activity context
     *//*

    @Override
    public Context getActivityContext() {
        try {
            return getView().getActivityContext();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
*/
