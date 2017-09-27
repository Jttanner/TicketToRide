package modeling;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by tyler on 9/26/2017.
 * The user is the client, i mean who doesn't know what a user is
 */
public class User {
    public User(UserInfo info){
        this.info = info;
    }

    UserInfo info;
    Set<Game> activeGames = new HashSet<>();
    Set<Player> ownedPlayers = new HashSet<>();

    private void addGame(Game game){
        activeGames.add(game);
    }

    private void removeGame(Game game){
        activeGames.remove(game);
    }

    private void addPlayer(Player player){
        ownedPlayers.add(player);
    }

    private void removePlayer(Player player){
        ownedPlayers.remove(player);
    }

    public UserInfo getInfo() {
        return info;
    }

    /*
        Join an existing game.
         */
    public void joinGame(){

    }

    /*
    Returns reference to the created game.
     */
    public Game createNewGame(){
        return null;
    }

    /*
    Deletes an existing game which has been created but not started, or has finished.
     */
    public void deleteGame(){

    }

}
