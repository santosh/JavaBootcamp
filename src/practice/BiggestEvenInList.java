package practice;

import java.util.*;

public class BiggestEvenInList {

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            numbers.add(sc.nextInt());
        }
        printMaximumEven(numbers);
    }


    public static void printMaximumEven(List<Integer> numbers){
        int maxEven = 0; // Get the biggest even number
        for (int i: numbers) {
            if (i % 2 == 0) {
                if (i > maxEven) {
                    maxEven = i;
                }
            }
        }
        System.out.println(maxEven);
    }
}
