/**
 * The main package to run the language learning game.
 */
package Main;
import Logic.*;
/**
 * The main class to run the language learning game.
 */
public class Main {
    /**
     * Default constructor for the Main class.
     * This constructor is not used for this program.
     */
    public Main() {
        // Constructor logic, if needed.
    }

    /**
     * The entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Game game = new Game(); // Create a new game instance.
        game.play(); // Start the game.
    }
}
