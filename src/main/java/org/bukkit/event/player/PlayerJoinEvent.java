package org.bukkit.event.player;

import org.bukkit.entity.Player;

/**
 * Called when a player joins a server
 */
public class PlayerJoinEvent extends PlayerEvent {
    private String joinMessage;
    private boolean newPlayer;

    public PlayerJoinEvent(Player playerJoined, String joinMessage, boolean newPlayer) {
        super(Type.PLAYER_JOIN, playerJoined);
        this.joinMessage = joinMessage;
        this.newPlayer = newPlayer;
    }

    /**
     * Gets the join message to send to all online players
     *
     * @return string join message
     */
    public String getJoinMessage() {
        return joinMessage;
    }

    /**
     * Sets the join message to send to all online players
     *
     * @param joinMessage join message
     */
    public void setJoinMessage(String joinMessage) {
        this.joinMessage = joinMessage;
    }

    /**
     * Gets whether the Player that is joining is new to the server.
     *
     * @return Boolean, true if the player is new to the server and doesn't have a player.dat
     */
    public boolean isNewPlayer() {
        return this.newPlayer;
    }
}
