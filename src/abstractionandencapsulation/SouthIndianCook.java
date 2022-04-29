package abstractionandencapsulation;

public class SouthIndianCook extends Cook {
    @Override
    public void makeBreakfast() {
        System.out.println("Idli Chutney");
    }

    @Override
    public void makeLunch() {
        System.out.println("Uttapam");
    }

    @Override
    public void makeDinner() {
        System.out.println("Curd Rice");
    }
}
