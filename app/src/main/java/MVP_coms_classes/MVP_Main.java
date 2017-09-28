package MVP_coms_classes;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import modeling.LoginRequest;
import modeling.RegisterRequest;
import modeling.ResultObject;

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
    interface RequiredLoginViewOps {
        // View operations permitted to Presenter
        Context getAppContext();

        Context getActivityContext();
        /**Handles the results from login in and registering
         * */
        /**
         * Handles the successful login/reg attempts
         *
         * @param intent The intent to start the Create Game activity
         */
        void loginSucceeded(Intent intent);

        /**
         * Handles failure of logging in or registering
         *
         * @param toast The Toast to be popped
         */
        void loginFailed(Toast toast);
        /**Toggles the buttons on the login screen*/
        void toggleButtons(boolean b);
    }


    /**
     * Required Presenter methods available to Model. NEEDED?
     */
    interface RequiredPresenterOps {
        /**
         * Getting the appContext
         */
        Context getAppContext();

        /**
         * getting the context of the activity
         */
        Context getActivityContext();

    }

    /**
     * Operations offered to View to communicate with Presenter.
     * Processes user interactions, sends data requests to Model, etc.
     */
    interface ProvidedLoginPresentOps {
        /**
         * The view calls this in order to send login info through the presenter down to the server
         *
         * @param request A LoginRequest object
         */
        void login(LoginRequest request);

        /**
         * The view calls this in order to register information through the presenter down to the server
         *
         * @param request A register Request object
         */
        void register(RegisterRequest request);

        void setView(RequiredLoginViewOps view);

        void hasPassword(boolean b);

        void hasUserName(boolean b);
    }

}
