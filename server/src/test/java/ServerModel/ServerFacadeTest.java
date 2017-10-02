package ServerModel;

import java.util.HashMap;
import java.util.Map;

import modeling.Game;
import modeling.User;
import modeling.UserInfo;
import request.LoginRequest;

import static org.junit.Assert.*;

/**
 * Created by jontt on 9/29/2017.
 */
public class ServerFacadeTest {

    Map<String, Game> games = new HashMap<>();
    Map<String, User> users = new HashMap<>();

    ServerFacade facade = new ServerFacade();


    @org.junit.Before
    public void setUp() throws Exception {
        facade.users = users;
        facade.games = games;
        users.put("user", new User(new UserInfo("user", "password", "test")));
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void login() throws Exception {
        assertTrue(facade.login(new LoginRequest("user", "password")).isSuccess());
    }

    @org.junit.Test
    public void register() throws Exception {

    }

    @org.junit.Test
    public void createGame() throws Exception {

    }

    @org.junit.Test
    public void joinGame() throws Exception {

    }

    @org.junit.Test
    public void getGameList() throws Exception {

    }

}