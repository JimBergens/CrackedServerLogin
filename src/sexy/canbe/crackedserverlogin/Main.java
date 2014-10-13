package sexy.canbe.crackedserverlogin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import sexy.canbe.crackedserverlogin.listeners.PlayerListener;

/**
 * @author Matthew
 */
public class Main extends JavaPlugin {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;

        this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    /**
     * @return the Bukkit Plugin instance
     */
    public static Plugin getInstance() { return instance; }
}