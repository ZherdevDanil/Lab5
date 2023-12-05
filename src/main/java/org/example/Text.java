package org.example;

public class Text {

    private Sentence[] sentences;


    public Text(String t, String separationSign) {
        //заміняємо знаки, які теоретично можуть позначати кінець речення , на знак розділення, видаляємо ","
        String text = t.replace(".", separationSign)
                .replace("?", separationSign)
                .replace("!", separationSign)
                .replace(",", " ");
        //Розділяємо текст на на массив речень, за допомогою знака розділення
        String[] splittedTextOnSentences = text.split(separationSign);
        //заповнюємо масив sentences реченнями
        sentences = new Sentence[splittedTextOnSentences.length];
        for (int i = 0; i < splittedTextOnSentences.length; i++) {
            sentences[i] = new Sentence(splittedTextOnSentences[i]);
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }


    //Метод знаходження слів в тексті, приймає параметром масив цих слів
    public void findWordsInText(String[] wordsToFind) {
        for (int i = 0; i < wordsToFind.length; i++) {
            int count = 0;
            for (int j = 0; j < sentences.length; j++) {
                Word[] words = sentences[j].getWords();
                for (int k = 0; k < words.length; k++) {
                    if (wordsToFind[i].equalsIgnoreCase(words[k].getWord())) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Слово '" + wordsToFind[i] + "' не зустрічається в реченнях");
            } else if (count == 1) {
                System.out.println("Слово '" + wordsToFind[i] + "' зустрічається в " + count + " реченні");
            } else {
                System.out.println("Слово '" + wordsToFind[i] + "' зустрічається в "
                        + count + " реченнях");
            }
        }
    }
}

