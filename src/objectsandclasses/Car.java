package objectsandclasses;

public class Car {
    public int noOfWheels;
    public double speed;

    public String gear;
    public String engineType;

    public static int sampleVariable;

    public Car(int noOfWheels, double speed, String gear, String engineType) {
        this.noOfWheels = noOfWheels;
        this.speed = speed;
        this.gear = gear;
        this.engineType = engineType;
    }

    public Car() {
    }

        public void playMusic() {

    }

    public void moveCar(String direction) {

    }

    public void cleanWindShield() {

    }

    public static void pressHorn() {
        System.out.println(sampleVariable);
    }

    public void printDetails() {
        System.out.println("Wheels: " + noOfWheels);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println("Engine: " + engineType);
    }

    public static void main(String[] args) {

    }
}
