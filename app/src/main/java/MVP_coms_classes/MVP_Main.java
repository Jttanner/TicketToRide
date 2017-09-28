package MVP_coms_classes;

import android.content.Context;

import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;

/**
 * Created by tyler on 9/26/2017.
 * This holds our interfaces that we will use between the GUIs and interfaces
 */

public interface MVP_Main {

    /**
     * Required View methods available to Presenter.
     * A passive layer, responsible to show data
     * and receive user interactions
     */
    interface RequiredViewOps {
        // View operations permitted to Presenter
        Context getAppContext();
        Context getActivityContext();
    }


    /**
     * Required Presenter methods available to Model. NEEDED?
     */
    interface  RequiredPresenterOps{
        /**Getting the appContext*/
        Context getAppContext();
        /**getting the context of the activity*/
        Context getActivityContext();
    }

    /**
     * Operations offered to View to communicate with Presenter.
     * Processes user interactions, sends data requests to Model, etc.
     */
    interface ProvidedLoginPresentOps {
        /**The view calls this in order to send login info through the presenter down to the server
         * @param request A LoginRequest object
         * */
         LoginResult login(LoginRequest request);
        /**The view calls this in order to register information through the presenter down to the server
         * @param request A register Request object
         * */
         RegisterResult register(RegisterRequest request);

         void setView(RequiredViewOps view);
    }

}
