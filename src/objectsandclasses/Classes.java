package objectsandclasses;

public class Classes {
    final int method() {
        return 1;
    }

    public static void main(String[] args) {
        Car car = new Car(4, 80, "800cc", "Manual");
        Car car2 = new Car();

        car.printDetails();
        car2.printDetails();
    }
}
