package Logic;

/**
 * Represents a word in English and its translation.
 */
public class Word {
    private String englishWord; // Stores the English word
    private String translation; // Stores the translation

    /**
     * Initializes a new Logic.Word instance with the specified English word and its translation.
     *
     * @param englishWord The English word.
     * @param translation The translation of the English word.
     */
    public Word(String englishWord, String translation) {
        this.englishWord = englishWord;
        this.translation = translation;
    }

    /**
     * Gets the English word.
     *
     * @return The English word.
     */
    public String getEnglishWord() {
        return englishWord;
    }

    /**
     * Gets the translation of the English word.
     *
     * @return The translation.
     */
    public String getTranslation() {
        return translation;
    }
}
