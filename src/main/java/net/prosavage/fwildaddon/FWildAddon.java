package net.prosavage.fwildaddon;

import net.prosavage.factionsx.FactionsX;
import net.prosavage.factionsx.addonframework.Addon;

public class FWildAddon extends Addon {

    private static FWildAddon instance;

    public static FWildAddon getInstance() {
        return instance;
    }

    private static CmdWild cmdWild = new CmdWild();

    @Override
    protected void onEnable() {
        logColored("Enabling FWild-Addon!");
        instance = this;
        FactionsX.baseCommand.addSubCommand(cmdWild);
        WildConfig.load(this);
    }

    @Override
    protected void onDisable() {
        logColored("Disabling FWild-Addon!");
        FactionsX.baseCommand.removeSubCommand(cmdWild);
        // Load first to read changes from file, then save.
        WildConfig.load(this);
        WildConfig.save(this);
    }
}