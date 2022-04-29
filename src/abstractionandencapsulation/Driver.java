package abstractionandencapsulation;

import inheritanceandpolymorphism.Child;

public class Driver {
    public static void main(String[] args) {
//        BurgerMaker indianMacD = new BurgerMaker("India");
//        indianMacD.makeBurger();
//
//        System.out.println();
//
//        BurgerMaker americanMacD = new BurgerMaker("USA");
//        americanMacD.makeBurger();
//
        Cook cook = new NorthIndianCook();

        cook.makeBreakfast();
        cook.makeLunch();
        cook.makeDinner();

        System.out.println();

        cook = new SouthIndianCook();
        cook.makeBreakfast();
        cook.makeLunch();
        cook.makeDinner();

        SampleInterface i = new Implementation();
        i.sampleMethod();
    }
}
