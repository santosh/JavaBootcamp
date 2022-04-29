package dev.santoshk;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 3;
        arr[4] = 9;

        for (int val : arr) {
            System.out.print(val + " ");
        }

        Arrays.sort(arr);

        System.out.println();

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
