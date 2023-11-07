import java.util.ArrayList;
import java.util.Random;

// Manages a collection of words
class Dictionary {
    private ArrayList<Word> words; // Stores a list of Word objects

    public Dictionary() {
        words = new ArrayList<>(); // Initialize the word list with predefined words and translations
        words.add(new Word("apple", "яблуко"));
        words.add(new Word("book", "книга"));
        words.add(new Word("house", "будинок"));
        words.add(new Word("cat", "кіт"));
        words.add(new Word("sun", "сонце"));
        words.add(new Word("computer", "компʼютер"));
        words.add(new Word("water", "вода"));
        words.add(new Word("innovative", "іноваційний"));
        words.add(new Word("sustainable", "стійкий"));
        words.add(new Word("significant", "значний"));
        words.add(new Word("diversity", "різноманітність"));
        words.add(new Word("globalization", "глобалізація"));
        words.add(new Word("complexity", "складність"));
        words.add(new Word("sophisticated", "вишуканий"));
    }

    public Word getRandomWord() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.size()); // Get a random index within the word list
        Word selectedWord = words.get(randomIndex); // Select a word from the list
        words.remove(randomIndex); // Remove the selected word from the list to avoid repetition
        return selectedWord; // Return the selected word
    }

    public int getLength() {
        return words.size(); // Return the current number of words in the dictionary
    }
}