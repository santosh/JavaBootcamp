package dev.santoshk;

class NormalCalculator {
    public int addTwoNumbers(int a, int b) {
        return a+b;
    }
}

class AdvancedCalculator extends NormalCalculator{
    public int addThreeNumbers(int a, int b, int c) {
        return a+b+c;
    }
}

class SuperCalculator extends AdvancedCalculator{
    public int multiplyTwoNumbers(int a, int b) {
        return a*b;
    }

    public int multiplyThreeNumbers(int a, int b, int c) {
        return a*b*c;
    }
}

class UltraSuperCalculator extends SuperCalculator{
    public int divide(int a, int b) {
        return a/b;
    }
}

public class InheritanceTutorial {
    public static void main(String[] args) {
        SuperCalculator obj = new UltraSuperCalculator();
        System.out.println(obj.addTwoNumbers(3,4));
        System.out.println(obj.addThreeNumbers(5,6,7));
        System.out.println(obj.multiplyTwoNumbers(8,9));
        System.out.println(obj.multiplyThreeNumbers(10,11,12));
    }
}