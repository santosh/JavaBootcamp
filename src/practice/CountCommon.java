package practice;

import java.util.*;

public class CountCommon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int size1 = scanner.nextInt();
        for(int i=0; i<size1; i++)
            list1.add(scanner.nextInt());

        int size2 = scanner.nextInt();
        for(int i=0; i<size2; i++)
            list2.add(scanner.nextInt());



        System.out.println(countCommon(list1, list2));

    }

    public static int countCommon(ArrayList<Integer>list1, ArrayList<Integer>list2 ){
        //write your code here.
        list1.retainAll(list2);
        System.out.println(list1);
        return list1.size();
    }
}