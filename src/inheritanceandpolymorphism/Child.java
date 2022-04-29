package inheritanceandpolymorphism;

public class Child extends Parent{
    int abc = 200;
    int parentVar = 50;

    public Child(int abc, int par, double d) {
        super(d);
        this.abc = abc;
        this.parentVar = par;
    }

    public void childMethod() {
        System.out.println("Child method!");
        System.out.println(super.doubleParentVar);
    }

    public void sample() {
        System.out.println(super.parentVar);
        System.out.println(parentVar);
    }

    public void sample(int x) {
        System.out.println(super.parentVar);
        System.out.println(parentVar);
    }

    public void sample(double x) {
        System.out.println(super.parentVar);
        System.out.println(parentVar);
    }

    public void sample(int x, double y) {
        System.out.println(super.parentVar);
        System.out.println(parentVar);
    }

    public void sample(String x, double y) {
        System.out.println(super.parentVar);
        System.out.println(parentVar);
    }
}
