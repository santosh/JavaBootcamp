package dev.santoshk;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("/home/santosh/workspace/upgrad/JavaBootcamp/src/dev/santoshk/aliceinwonderland.txt"); // specify the path of your file -  Note that C:\\ is used instead of C:\ to specify path
        // Create a scanner
        Scanner scan = new Scanner(inputfile);
        // scan lines from the file
        String Line =scan.nextLine();
        System.out.println(Line);
    }
}

