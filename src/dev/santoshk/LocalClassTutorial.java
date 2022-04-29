package dev.santoshk;

public class LocalClassTutorial {
    public static void main(String[] args) {

        class UserDetails {
            String name;
            double phoneNumber;

            public UserDetails(String name, double phoneNumber) {
                this.name = name;
                this.phoneNumber = phoneNumber;
            }
        }

        UserDetails[] arr = new UserDetails[5];
        arr[0] = new UserDetails("Nithin", 12345);
        arr[1] = new UserDetails("Digesh", 23456);
        arr[2] = new UserDetails("Naman", 34567);
        arr[3] = new UserDetails("Ann", 45678);
        arr[4] = new UserDetails("Hemanth", 56789);
    }
}