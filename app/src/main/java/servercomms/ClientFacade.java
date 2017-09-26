package servercomms;

import java.util.List;

import modeling.Game;

/**
 * Created by tyler on 9/26/2017.
 */
public class ClientFacade {
    private static ClientFacade ourInstance = new ClientFacade();

    public static ClientFacade getInstance() {
        return ourInstance;
    }

    private ClientFacade() {
    }

    public void updateGameList(List<Game> games){

    }
}
