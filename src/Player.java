// Represents the player with health points
class Player {
    private int health; // Player's health points

    public Player() {
        this.health = 5; // Initialize player health to 5
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth() {
        health += 1; // Increase player health
    }

    public void decreaseHealth() {
        health -= 2; // Decrease player health
    }
}
