package abstractionandencapsulation;

public class NorthIndianCook extends Cook {
    @Override
    public void makeBreakfast() {
        System.out.println("Samosa");
    }

    @Override
    public void makeLunch() {
        System.out.println("Chole Bhature");
    }

    @Override
    public void makeDinner() {
        System.out.println("Rajma Chawal");
    }
}
