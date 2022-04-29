package dev.santoshk;

import java.util.*;

public class InterestCalculator {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int principle_amount = scanner.nextInt ();
        int time = scanner.nextInt ();

        if (n == 1)
        {
            IBank obj = new IBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 2)
        {
            JBank obj = new JBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 3)
        {
            KBank obj = new KBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else
        {
            System.out.println ("Please enter correct choice");}
    }
}
abstract class RBI {
    abstract int InterestCalculator (int x, int y);
}


// Define the classes here.
class IBank extends RBI {
    int InterestCalculator(int x, int y) {
        return (x * y * 7) / 100;
    }
}

class JBank extends RBI {
    int InterestCalculator(int x, int y) {
        return (x * y * 8) / 100;
    }
}

class KBank extends RBI {
    int InterestCalculator(int x, int y) {
        return (x * y * 9) / 100;
    }
}