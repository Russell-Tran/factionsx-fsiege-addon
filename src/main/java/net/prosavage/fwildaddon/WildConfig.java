package net.prosavage.fwildaddon;

import net.prosavage.factionsx.FactionsX;
import net.prosavage.factionsx.addonframework.Addon;

import java.io.File;

public class WildConfig {

    public static transient WildConfig instance = new WildConfig();

    public static String coolConfigOption = "yeah boiii";


    public static void save(Addon addon) {
        addon.getConfigSerializer().save(instance,
                new File(FWildAddon.getInstance().getAddonDataFolder(), "config.json")
        );
    }

    public static void load(Addon addon) {
        FactionsX.baseCommand.getHelpInfo();
        addon.getConfigSerializer().load(instance,
                WildConfig.class,
                new File(FWildAddon.getInstance().getAddonDataFolder(), "config.json")
        );
    }

}
