package servercomms;

import java.util.List;

import modeling.Game;
import modeling.LoginResult;
import modeling.RegisterResult;
import modeling.User;

/**
 * Created by tyler on 9/26/2017.
 * This class handles all of the requests from the client to the server and vice versa. On the client side it is called by the
 * GUIFacade with input coming from the user in order to perform operations on the server. It takes results from the server and
 * passes them to the ClientFacade,which updates the model.
 */
public class ServerProxy {
    private static ServerProxy ourInstance = new ServerProxy();

    public static ServerProxy getInstance() {
        return ourInstance;
    }

    private ServerProxy() {
    }

    public LoginResult Login(User u){
        return null;
    }
    public RegisterResult Register(User u){
        return null;
    }
    /*public List<Game> getGameList(Command c){

    }*/
    /*public void Encode(Object o, ResponseBody responseBody){

    }*/
    public void joinGame(){

    }
    public void deleteGame(){

    }
}
