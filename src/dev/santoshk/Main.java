public class Main {
    public static void main(String[] args) {   //line 1
        TestClass c1 = new TestClass(2, 5.2);   //line 2
        TestClass c2 = new TestClass(3, 7.5);   //line 3
//        System.out.println(c1.a + ", " + c1.b);    //line 4
    }
}

class TestClass {
    private int a;
    public double b;
    public TestClass(int first, double second) {
        this.a = first;
        this.b = second;
    }
}