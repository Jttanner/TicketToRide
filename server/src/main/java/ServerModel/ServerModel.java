package ServerModel;

import java.util.List;

import modeling.*;

/**
 * Created by jontt on 9/27/2017.
 */

public class ServerModel {
    ServerModel(User user){
        this.user = user;
    }

    User user;

    public User getUser() {
        return user;
    }
}
