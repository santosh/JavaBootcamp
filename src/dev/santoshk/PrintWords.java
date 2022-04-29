package dev.santoshk;

import java.util.ArrayList;
import java.util.List;

public class PrintWords {
    public static void main(String[] args) {
        List<String> dishes = new ArrayList<>();
        dishes.add("Kadahi Paneer");
        dishes.add("Gulab Jamun");
        dishes.add("Paani Puri");
        dishes.add("Pizza");
        dishes.add("Lassi");
        dishes.add("poha");
        dishes.add("Kadahi Paneer");

//        printWordsWithSpaces(dishes);
        printWordsThatContainsLetterP(dishes);
    }

    private static void printWordsThatContainsLetterP(List<String> dishes) {
        dishes.stream()
                .filter(dish->dish.toLowerCase().contains("p"));
//                .forEach(System.out::println);
    }

    private static void printWordsWithSpaces(List<String> dishes) {
        dishes.stream()
                .filter(dish->dish.contains(" "))
                .forEach(System.out::println);
    }
}
