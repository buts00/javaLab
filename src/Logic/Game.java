package Logic;

import Logic.Dictionary;

import java.util.Scanner;

/**
 * Manages the gameplay.
 */
public class Game {
    private Player player; // Represents the player
    private Dictionary dictionary; // Manages the dictionary of words

    /**
     * Initializes a new Logic.Game instance.
     */
    public Game() {
        player = new Player(); // Initialize a new player
        dictionary = new Dictionary(); // Create a new dictionary
    }

    /**
     * Initiates and controls the game loop.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (player.getHealth() > 0) {
            if (dictionary.getLength() == 0) {
                System.out.println("Ви знаєте всі слова. Вітаю!!"); // Congratulatory message if all words are known
                break;
            }
            Word word = dictionary.getRandomWord(); // Get a random word from the dictionary
            System.out.println("Перекладіть англійське слово: " + word.getEnglishWord()); // Prompt for English word translation
            String input = scanner.nextLine(); // Get user input

            if (input.equalsIgnoreCase(word.getTranslation())) {
                player.increaseHealth(); // Increase health if the translation is correct
                System.out.println("Правильно! Ваше поточне здоров'я: " + player.getHealth()); // Display current health
                dictionary.removeWord(word);

            } else {
                player.decreaseHealth(); // Decrease health if the translation is incorrect
                System.out.println("Неправильно! Ваше поточне здоров'я: " + player.getHealth()); // Display current health
                System.out.println("Правильний переклад = " + word.getTranslation() + ". Ваше поточне здоров'я: " + player.getHealth()); // Display the correct translation
            }
            System.out.println(dictionary.getLength());
        }

        if (player.getHealth() <= 0) {
            System.out.println("Гра закінчена. Ви програли."); // End game message if health reaches zero
        }
    }
}
