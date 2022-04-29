package dev.santoshk;

import java.util.ArrayList;
import java.util.List;

public class PrintNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(44);
        numbers.add(56);
        numbers.add(85);
        numbers.add(99);

        printStructuredWay(numbers);
        printFunctionalWay(numbers);
    }

    private static void printStructuredWay(List<Integer> numbers) {
        System.out.println("Structured Way");
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printFunctionalWay(List<Integer> numbers) {
        System.out.println("Functional way");
        numbers.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);
    }
}
