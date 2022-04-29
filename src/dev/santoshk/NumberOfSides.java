package dev.santoshk;

import java.util.*;

class Shape {
    public void display() {
        System.out.println("display method overriding");
    }
}

// define the classes here.
class Circle extends Shape {
    public void display() {
        System.out.println("The shape is a circle");
    }
}

class Triangle extends Shape {
    public void display() {
        System.out.println("The shape is a triangle");
    }
}

class RectangleShape extends Shape {
    public void display() {
        System.out.println("The shape is a rectangle");
    }
}


public class NumberOfSides {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj2 = new Circle();
        Shape obj1 = new RectangleShape();
        int numberOfSides = in.nextInt();

        switch (numberOfSides) {
            case 0:
                obj2.display();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
                break;
        }
    }
}