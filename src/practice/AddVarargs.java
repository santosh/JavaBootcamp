package practice;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class AddVarargs {
    String add(int... nums) {
        String joiner = "+";
        String finalStr = "";
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) joiner = "=";
            sum += nums[i];
            finalStr += nums[i] + joiner;
        }
        System.out.println(finalStr + sum);
        return finalStr + sum;
    }
}


class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            AddVarargs ob=new AddVarargs();
//            ob.add(n1,n2);
//            ob.add(n1,n2,n3);
//            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=AddVarargs.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}

