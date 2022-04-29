package dev.santoshk;

import java.util.HashSet;
import java.util.Set;

public class SetTutorial {
    static void bubbleSort(int[] arr) {
        int size = arr.length;
        int num = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    num = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = num;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 6, 4, 7, 87, 4, 8, 4};
//        bubbleSort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }



        Set<Integer> set = new HashSet<>();
        // Set is interface and HashSet implements Set
        // I have used dynamic method dispatch
        set.add(1);
        set.add(5);
        set.add(10);
        set.add(0);
        set.add(20);

        // add 5 -> fail
        // add 6 -> pass

        if(set.add(6)) {
            System.out.println("6 is added");
        }
        else {
            System.out.println("6 is not added");
        }

        System.out.println("Size of set is " + set.size());

        for(Integer val: set) {
            System.out.print(val + " ");
        }
    }
}