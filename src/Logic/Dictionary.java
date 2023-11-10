package Logic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Manages a collection of words.
 */
public class Dictionary {
    private ArrayList<Word> words;

    /**
     * Initializes a new Logic.Dictionary instance with predefined words and translations.
     */
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
        words.add(new Word("complexity", "складність"));
    }

    /**
     * Gets a random word from the dictionary, removes it to avoid repetition, and returns the word.
     *
     * @return The randomly selected Logic.Word.
     */
    public Word getRandomWord() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.size()); // Get a random index within the word list
        Word selectedWord = words.get(randomIndex); // Select a word from the list
        return selectedWord; // Return the selected word
    }

    /**
     * Removes the specified word from the dictionary.
     *
     * @param word The word to be removed.
     */
    public void removeWord(Word word) {
        int index = words.indexOf(word);
        if (index != -1) {
            words.remove(index);
        }
    }

    /**
     * Gets the current number of words in the dictionary.
     *
     * @return The number of words in the dictionary.
     */
    public int getLength() {
        return words.size();
    }
}
