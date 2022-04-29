package dev.santoshk;

class upgradException extends Exception { }

public class CustomException {
    public static void main(String... args) throws upgradException {
        int a = 0;
        int b = 0;

        int ans = a+b;

        if (ans < 20) {
            throw new upgradException();
        }
    }
}
