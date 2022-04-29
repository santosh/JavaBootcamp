package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFruits {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            fruits.add(sc.next());
        }
        printFruitCount(fruits);
    }


    public static void printFruitCount(List<String> fruits){
        // store the count of each fruit into a Map using lambda function and print the map
        TreeMap<String, Integer> fruitCount = new TreeMap<>();
        for (String f : fruits) {
            if (fruitCount.containsKey(f)) {
                fruitCount.put(f, fruitCount.get(f) + 1);
            } else {
                fruitCount.put(f, 1);
            }
        }

        System.out.println(fruitCount);
    }
}