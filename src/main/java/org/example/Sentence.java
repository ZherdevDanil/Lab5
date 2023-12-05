package org.example;

public class Sentence {

    private Word[] words;

    private Punctuation[] punctuations;

    //Конструктор Sentence , параметром приймаємо Речення
    public Sentence(String sentence) {
        //Ділимо отримане речення на слова
        String[] text_split_of_word = sentence.split(" ");
        //ініціалізуємо масив words
        words = new Word[text_split_of_word.length];
        //заповнюємо масив, використовуємо метод removeNonLetters для кожного слова, щоб прибрати знаки або числа
        for (int i = 0; i < text_split_of_word.length; i++) {
            words[i] = new Word(removeNonLetters(text_split_of_word[i]));
        }
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public String removeNonLetters(String sentence) {
        return sentence.replaceAll("[^a-zA-Zа-яА-ЯіІїЇ' ']", " ");
    }
}

