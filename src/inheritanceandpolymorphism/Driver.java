package inheritanceandpolymorphism;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
//        Child c = new Child(1, 51, 1);
//        c.childMethod();
//        c.parentMethod();
//        c.sample();

//        Alexa a;
//        Scanner sc = new Scanner(System.in);
//        String country = sc.nextLine();
//
//        switch (country) {
//            case "US":
//                a = new Alexa();
//                break;
//            case "FR":
//                a = new AlexaFrance();
//                break;
//            default:
//                a = new Alexa();
//        }
//
//        a.listen();
//        a.greeting();

        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(1001, "Ishwar", "Java");
        System.out.println(softwareDeveloper.getDetails());
    }
}
