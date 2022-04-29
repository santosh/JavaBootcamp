package inheritanceandpolymorphism;

public class Parent {
    int parentVar = 5;
    double doubleParentVar = 5.5;

    public Parent(double doubleParentVar) {
        this.doubleParentVar = doubleParentVar;
    }

    public void parentMethod() {
        System.out.println("Parent method!");
    }
}
