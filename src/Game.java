import java.util.Scanner;

// Manages the gameplay
class Game {
    private Player player; // Represents the player
    private Dictionary dictionary; // Manages the dictionary of words
    private int bestScore; // Tracks the best score

    public Game() {
        player = new Player(); // Initialize a new player
        dictionary = new Dictionary(); // Create a new dictionary
        bestScore = 0; // Initialize the best score
    }

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
            } else {
                player.decreaseHealth(); // Decrease health if the translation is incorrect
                System.out.println("Неправильно! Ваше поточне здоров'я: " + player.getHealth()); // Display current health
                System.out.println("Правильний переклад = " + word.getTranslation() + ". Ваше поточне здоров'я: " + player.getHealth()); // Display the correct translation
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("Гра закінчена. Ви програли."); // End game message if health reaches zero
        }
    }
}