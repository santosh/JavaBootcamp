package dev.santoshk;

public class StringTutorial {
    public void charAtAndLength() {
        String city = "Bangalore";
        for (int i = 0; i < city.length(); i++) {
            System.out.print(city.charAt(i) + " ");
        }
    }
    public static void isSubstringPresent() {
        String city = "Bangalore";
        System.out.println("lor present is " + city.contains("lor"));
        System.out.println("ABCD present is " + city.contains("ABCD"));
    }

    public static void firstIndexOfAChar() {
        String city = "Hyderabad";
        System.out.println(city.indexOf('a'));
    }

    public static void trim() {
        String city = "   Hyderabad  ";
        System.out.println("city before trim: " + city);
        System.out.println("city after trim: " + city.trim());
    }

    public static void toUppercaseToLowercase() {
        String phrase = "Hi, how are you?";
        System.out.println("toUpperCase: " + phrase.toUpperCase());
        System.out.println("toLowerCase: " + phrase.toLowerCase());
    }

    public static void equals() {
        String city1 = new String("Banglaore");
        String city2 = new String("Banglaore");
        String city3 = "banglaore";
        if (city1.equals(city2)) {
            System.out.println("city1 is same as city2");
        }
        if (city1.equals(city3)) {
            System.out.println("city1 is same as city3");
        }
    }

    public static void replace() {
        String name = "Santosh Kumar";
        System.out.println(name.replace("S", "F"));
        System.out.println(name.replaceAll("t", "th"));
    }

    public static void split() {
        String name = "Geeks@For@Geeks";
        String[] strArr = name.split("@", -1);
        for (String st : strArr) {
            System.out.print(st + " ");
        }

    }

    public static void main(String[] args) {
        split();
    }
}
