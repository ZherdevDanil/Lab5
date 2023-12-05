package org.example;

/*
 * 1505%3 = 2 => тип String
 * 1505%17 = 9 => Дія з рядком "Задано текст та масив слів.Підрахувати у скількох реченнях зустрічається кожне слово масиву."
 * */

public class Lab5 {
    public static void main(String[] args) {
        String inputText = "Модифікувати лабораторну роботу №3 наступним чином: для літер, слів,\n" +
                "речень, розділових знаків та тексту створити окремі класи. Слово повинно\n" +
                "складатися з масиву літер, речення з масиву слів та розділових знаків, текст з\n" +
                "масиву речень. Замінити послідовність табуляцій та пробілів одним пробілом.";
        String separationSign = "&&&";

        //Передаємо в конструктоп текст, та знак роздільності
        Text text = new Text(inputText, separationSign);

        //масив слів, які шукаємо в заданому тексті inputText
        String[] wordsToFind = new String[]{"чином", "літер"};

        //визиваємо метод, який знаходить чи є слова,які шукаємо в тексті,параметром метода є масив шуканих слів
        text.findWordsInText(wordsToFind);

    }
}