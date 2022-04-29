package dev.santoshk;

import java.util.Scanner;


public class Loops {
    public static void forLoop() {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }

    public static void whileLoop() {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();

        int init = 1;
        while (init <= N) {
            System.out.println("hello");
            init++;
        }
    }

    public static boolean isPrime(int num) {
        int numFactors = 0;

        for (int i = 2; i*i < num; i++) {
            if (num%i == 0) {
                numFactors++;
                break;
            }
        }
        return numFactors == 0;
    }

    public static void primesTill(int num) {
        for (int j = 2; j < num; j++) {
            int numFactors = 0;
            for (int i = 2; i*i < num; i++) {
                if (j%i == 0) {
                    numFactors++;
                    break;
                }
            }

            if (numFactors == 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num[] = new int []{1,5,3,35,7,3,2,25,2,1,1,1,34,5};
        int count = num.length;

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int n: num) {
            System.out.println(n);
        }
    }
}
