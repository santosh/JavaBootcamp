package dev.santoshk;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CalculateMean {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("/home/santosh/workspace/upgrad/JavaBootcamp/src/dev/santoshk/quiz_numbers.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 0;
        int sum = 0;

        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            int number = scan.nextInt();
            sum = sum + number;
            numb++;
        }

        int mean = sum/numb;

        System.out.println("Mean is : " + mean);
    }
}
