package ru.geekbrains.level2.lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Homework3 {

    private static final String words =
            "Желание " +
                    "Семнадцать " +
                    "Ржавый " +
                    "Рассвет " +
                    "Печь " +
                    "Желание " +
                    "Девять " +
                    "Добросердечный " +
                    "Возвращение на родину " +
                    "Рассвет " +
                    "Один " +
                    "Товарный вагон ";

    private static TreeSet<String> getWords(String[] angryBucky) {
        return new TreeSet<>(Arrays.asList(angryBucky));
    }

    private static HashMap<String, Integer> getWordsCount(String[] angryBucky) {
        HashMap<String, Integer> map = new HashMap<>();
                for (int i = 0; i < angryBucky.length; i++) {
                    String word = angryBucky[i];
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }

        return map;
    }
    public static void main(String[] args) {
        System.out.println(getWords(words.split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Михалыч", "8 920 283 94 02");
        phonebook.add("Пикачине", "8 921 483 29 31");
        phonebook.add("Пикачини", "8 352 456 31 90");
        phonebook.add("Михалыч", "8 222 333 20 30");


        System.out.println("Телефон Михалыча: " + phonebook.get("Михалыч"));
        System.out.println("телефон Пикачини: " + phonebook.get("Пикачини"));
    }
}