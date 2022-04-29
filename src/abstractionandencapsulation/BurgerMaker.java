package abstractionandencapsulation;

public class BurgerMaker {
    VegetableChopper vegetableChopper;
    PattyMaker pattyMaker;

    public BurgerMaker(String country) {
        this.vegetableChopper = new VegetableChopper();
        switch (country) {
            case "India":
                this.pattyMaker = new IndianPattyMaker();
                break;
            case "USA":
                this.pattyMaker = new AmericanPattyMaker();
                break;
        }
    }

    public void makeBurger() {
        // 1. Prepare the veggies
        vegetableChopper.washVeggies();
        vegetableChopper.cutVeggies();

        // 2. Patty
        pattyMaker.preparePatty();
        pattyMaker.fryPatty();
    }
}
