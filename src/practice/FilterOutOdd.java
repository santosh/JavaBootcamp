package practice;

import java.util.*;
import java.util.stream.Collectors;

public class FilterOutOdd {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            numbers.add(sc.nextInt());
        }
        printEvenNumbers(numbers);
    }
    public static void printEvenNumbers(List<Integer> numbers){
        // Print even numbers in the same orders as of array,
        // each in new line
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }


}