package sexy.canbe.crackedserverlogin.listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import sexy.canbe.crackedserverlogin.util.UUIDManager;

/**
 * @author Matthew
 */
public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {}

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {}

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {

        // Stop the player from moving if they're not logged in
        if (!UUIDManager.getLoggedInPlayers().contains(event.getPlayer())) {
            Location from = event.getFrom();
            Location to = event.getTo();
            double x = Math.floor(from.getX());
            double z = Math.floor(from.getZ());

            if (Math.floor(to.getX()) != x || Math.floor(to.getZ()) != z) {
                x += 0.5;
                z += 0.5;
                event.getPlayer().teleport(new Location(from.getWorld(), x,
                        from.getY(), z, from.getYaw(), from.getPitch()));
            }
        }
    }
}