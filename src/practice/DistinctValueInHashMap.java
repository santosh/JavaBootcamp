package practice;

import java.util.*;

public class DistinctValueInHashMap {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        HashSet<String> vals = new HashSet<String>(map.values());
        for (Object o: vals) {
            System.out.print(o + " ");
        }
    }
    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}