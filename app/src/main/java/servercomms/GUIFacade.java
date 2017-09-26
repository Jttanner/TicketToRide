package servercomms;

import modeling.LoginResult;
import modeling.RegisterResult;
import modeling.User;

/**
 * Created by tyler on 9/26/2017.
 */
public class GUIFacade {
    private static GUIFacade ourInstance = new GUIFacade();

    public static GUIFacade getInstance() {
        return ourInstance;
    }

    private GUIFacade() {
    }

    public LoginResult Login(User u){
        return null;
    }
    public RegisterResult Register(User u){
        return null;
    }
}
