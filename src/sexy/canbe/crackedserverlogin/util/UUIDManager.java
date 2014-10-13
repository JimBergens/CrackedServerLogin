package sexy.canbe.crackedserverlogin.util;

import org.bukkit.entity.Player;

import java.util.HashSet;

/**
 * @author Matthew
 */
public class UUIDManager {

    private static HashSet<Player> loggedInPlayers = new HashSet<>();

    private Player player;

    /**
     *
     * @param player the player
     */
    public UUIDManager(Player player) {
        this.player = player;
    }

    /**
     *
     */
    public void generateUUID() {

    }

    /**
     * @return the logged in players
     */
    public static HashSet<Player> getLoggedInPlayers() { return loggedInPlayers; }
}