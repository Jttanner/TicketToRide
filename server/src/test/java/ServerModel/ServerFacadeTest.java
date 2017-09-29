package ServerModel;

import java.util.HashMap;
import java.util.Map;

import modeling.Game;
import modeling.User;
import modeling.UserInfo;
import request.LoginRequest;
import request.RegisterRequest;

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
        for (int i = 0; i < 10; ++i){
            users.put("user" + i, new User(new UserInfo("user" + i, "password" + i, "test" + i)));
        }
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void login() throws Exception {
        assertTrue(facade.login(new LoginRequest("user", "password")).isSuccess());
        assertFalse(facade.login(new LoginRequest("notAUser", "password")).isSuccess());
        assertFalse(facade.login(new LoginRequest("", "")).isSuccess());
        for (int i = 0; i < 10; ++i){
            assertTrue(facade.login(new LoginRequest("user" + i, "password" + i)).isSuccess());
            assertFalse(facade.login(new LoginRequest("notAUser" + i, "password" + i)).isSuccess());
            assertFalse(facade.login(new LoginRequest("user" + i, "badPassword" + i)).isSuccess());
        }
    }

    @org.junit.Test
    public void register() throws Exception {
        assertFalse(facade.login(new LoginRequest("newUser", "newPassword")).isSuccess());
        facade.register(new RegisterRequest("newUser", "newPassword"));
        assertTrue(facade.login(new LoginRequest("newUser", "newPassword")).isSuccess());
        for (int i = 0; i < 10; ++i){
            assertFalse(facade.login(new LoginRequest("newUser" + i, "newPassword" + i)).isSuccess());
            facade.register(new RegisterRequest("newUser" + i, "newPassword" + i));
            assertTrue(facade.login(new LoginRequest("newUser" + i, "newPassword" + i)).isSuccess());
        }

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