package com.insightfullogic.java8.exercises.chapter3;

import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {

        return (int) string.chars()
                .map(e -> (char) e)
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings
                .stream()
                .filter(e -> e.toLowerCase().equals(e))
                .sorted((e1, e2) -> Integer.compare(e2.length(), e1.length()))
                .findFirst();
    }

}
