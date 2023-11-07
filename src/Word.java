// Represents a word in English and its translation
class Word {
    private String englishWord; // Stores the English word
    private String translation; // Stores the translation

    public Word(String englishWord, String translation) {
        this.englishWord = englishWord;
        this.translation = translation;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslation() {
        return translation;
    }
}