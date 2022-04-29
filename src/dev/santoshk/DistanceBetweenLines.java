package dev.santoshk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenLines {

    // DO NOT CHANGE THIS MAIN METHOD!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);

        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);

        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);

        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);

        br.close();
    }

    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {

        int firstLineA = firstLine.getA() > firstLine.getB() ? firstLine.getA() : firstLine.getB();
        int firstLineB = firstLine.getA() < firstLine.getB() ? firstLine.getA() : firstLine.getB();
        int firstLineLength = firstLineA - firstLineB;

        int secondLineA = secondLine.getA() > secondLine.getB() ? secondLine.getA() : secondLine.getB();
        int secondLineB = secondLine.getA() < secondLine.getB() ? secondLine.getA() : secondLine.getB();
        int secondLineLength = secondLineA - secondLineB;
        return firstLineLength + secondLineLength;

    }

    public static class Line {
        private int a;
        private int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}