package net.prosavage.fwildaddon;

import net.prosavage.factionsx.command.engine.CommandInfo;
import net.prosavage.factionsx.command.engine.CommandRequirementsBuilder;
import net.prosavage.factionsx.command.engine.FCommand;

public class CmdWild extends FCommand {

    public CmdWild() {
        // Alias for the command, so this would do `/f wild`.
        getAliases().add("wild");
        // We can add multiple
        getAliases().add("wild-tp");

        // The commandRequirements pre-check common things for you, the official way.
        // For example we could add #asFactionMember(true) if we want to make sure they're a faction member.
        // Here we do not want this executed in console, as the console cannot be teleported.
        this.commandRequirements = new CommandRequirementsBuilder()
                .asPlayer(true)
                .build();
    }


    public boolean execute(CommandInfo info) {
        info.message("Executing wild command, since you passed the command requirement check.");
        return true;
    }


    /**
     * This is used by the command engine to tell a player what a command does in the help menu
     */
    public String getHelpInfo() {
        return "teleport to a random chunk.";
    }
}