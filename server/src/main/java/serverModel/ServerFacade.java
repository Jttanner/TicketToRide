package serverModel;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import modeling.Game;
import modeling.User;
import modeling.UserInfo;
import result.*;
import request.*;

/**
 * Created by jontt on 9/27/2017.
 */

public class ServerFacade {


    Map<String, User> users = new HashMap<>();
    Map<String, Game> games = new HashMap<>();

    LoginResult login(LoginRequest request){
        UserInfo check = users.get(request.getUserName()).getInfo();
        return  check.checkUserInfo(request);
    }

    RegisterResult register(RegisterRequest request){
        String userName = request.getUserName();
        String password = request.getPassword();
        String newUserID = UUID.randomUUID().toString();
        User newUser = new User(new UserInfo(userName, password, newUserID));
        if (request.getUserName() != null && request.getPassword() != null){

            users.put(userName, newUser);
            return new RegisterResult(true, userName,"Succesfully Registered.");
        } else{
            return new RegisterResult(false, userName, "Failed to Register.");
        }
    }
}
