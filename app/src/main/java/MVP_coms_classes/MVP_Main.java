package MVP_coms_classes;

import android.content.Context;

import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;
import modeling.ResultObject;
import modeling.User;

/**
 * Created by tyler on 9/26/2017.
 */

public interface MVP_Main {

    /**
     * Created by tyler on 9/26/2017.
     * The methods the presenter can call onto the view
     */

    interface LoginViewOps {
        // View operations permitted for the Presenter
        /**Tells the view that login succeeded
         * @param success A boolean
         * */
         void LoginResult(boolean success);
        /**Tells the view that registration succeeded
         * @param success A boolean
         * */
         void RegisterResult(boolean success);
    }

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
     * Required Presenter methods available to Model.
     */
    interface  RequiredPresenterOps{
        /**Getting the appContext*/
        Context getAppContext();
        /**getting the context of the activity*/
        Context getActivityContext();
    }

    /**
     * Created by tyler on 9/26/2017.
     * The methods offered to the view to call on the presenter
     */
    interface LoginPresentOps {
        /**The view calls this in order to send login info through the presenter down to the server
         * @param request A LoginRequest object
         * */
         LoginResult Login(LoginRequest request);
        /**The view calls this in order to register information through the presenter down to the server
         * @param request A Register Request object
         * */
         RegisterResult Register(RegisterRequest request);
    }

    interface ProvidedLoginPOps {
    }
}
