package org.example;

public class Letter {
    private char letter;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Letter(char letter) {
        this.letter = letter;
    }

    public Letter() {
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}

