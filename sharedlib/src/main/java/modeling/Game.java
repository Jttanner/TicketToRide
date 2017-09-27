package modeling;

import java.util.Set;

/**
 * Created by tyler on 9/26/2017.
 * The game class is everything that a Game is in ticket to ride. So, you know, stuff
 */
public class Game {

    Game(){
        this.hasStarted = false;
    }

    Set<Player> players;

    String gameID;

    boolean hasStarted;

    public boolean canJoinGame(){
        return false;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public String getGameID() {
        return gameID;
    }

    public boolean isHasStarted() {
        return hasStarted;
    }
}
