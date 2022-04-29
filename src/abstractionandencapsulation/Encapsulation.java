package abstractionandencapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getSalary());

        String s = "Apple";
        if (s.equals("Orange")) {
            System.out.println("Strings are equal");
        }
    }
}
