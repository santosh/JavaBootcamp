package dev.santoshk;

class DVD {
    String movieName;
    int storage; // in MB
    private int price;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPrice(int val) {
        price = val;
    }

    public int getPrice() {
        return price;
    }
}

public class EncapsulationTutorial {
    public static void main(String[] args) {
        DVD obj1 = new DVD();
        obj1.movieName = "Game of Thrones";
        obj1.storage = 1024;
        obj1.setPrice(50);

        System.out.println(obj1.getPrice());

        DVD obj2 = new DVD();
        obj2.movieName = "Bahubali";
        obj2.storage = 2048;
        obj2.setPrice(100);
    }
}