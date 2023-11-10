package Logic;

/**
 * Represents the player with health points.
 */
public class Player {
    private int health; // Logic.Player's health points

    /**
     * Initializes a new Logic.Player instance with default health of 5.
     */
    public Player() {
        this.health = 5; // Initialize player health to 5
    }

    /**
     * Gets the current health of the player.
     *
     * @return The player's health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Increases the player's health by 1.
     */
    public void increaseHealth() {
        health += 1; // Increase player health
    }

    /**
     * Decreases the player's health by 2.
     */
    public void decreaseHealth() {
        health -= 2; // Decrease player health
    }
}
