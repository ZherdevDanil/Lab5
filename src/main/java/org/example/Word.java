package org.example;

public class Word {

    private String word;
    private Letter[] letters;

    public Word(String word) {
        this.word = word;
    }

    public Letter[] getLetters() {
        return letters;
    }

    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
