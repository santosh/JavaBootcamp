package dev.santoshk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
1. Add element add(int ele)
2. Add element at specific index add(int index, int ele)
3. Size of ArrayList size()
4. Element at a particular index is get(index)
5. Delete element from a particular index remove(index)
6. Remove all the specified elements arr.removeAll(arr2).
    arr2 contains the elements which we want to remove
7. Check whether element is present or not contains(val)
8.
 */

public class ArrayListTutorial {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(25);
        arr.add(7);
        // 5, 15, 25, 7
        // 5, 10, 15, 25, 7
        arr.add(1, 10);
        // arr[2] -> array
        // arr.get(2) -> ArrayList
        // Delete element at index 2
        arr.remove(2); // 5, 10, 25, 7

        ArrayList arr2 = new ArrayList();
        arr2.add(5);
        arr2.add(15);
        arr2.add(25);
        arr2.add(7);



        arr.addAll(arr2);

        if(arr.contains(2)) {
            System.out.println("2 is present");
        } else {
            System.out.println("2 is not present");
        }

        Collections.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println(Collections.frequency(arr, 5));
    }
}