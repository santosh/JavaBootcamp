package practice;

import java.util.*;

public class ArrayListProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();

        for (int i = 0; i <= numberOfArrays; i++) {
            String num = sc.nextLine();
            String[] numArray = num.split(" ");
            for (int j = 0; j < numArray.length; j++) {
                System.out.print(numArray[j] + "  ");
            }
            System.out.println();
        }
    }
}
