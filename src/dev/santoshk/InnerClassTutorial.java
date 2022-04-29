package dev.santoshk;

class Student {
    String name;
    int rollNo;
    int classNo;
    int phoneNumber;
    address address;

    class address {
        // Address
        String flatNo;
        int floorNo;
        String apptName;
        String street;
        String colony;
        String city;
        String state;
        int pincode;
    }
}

public class InnerClassTutorial {
    public static void main(String[] args) {
        Student digesh = new Student();

        digesh.name = "Digesh";
        digesh.rollNo = 123456;
        digesh.classNo = 12;
        digesh.phoneNumber = 9876543;

        Student.address addr = digesh.new address();
        addr.flatNo = "SF-2";
        addr.floorNo = 1;
        addr.apptName = "Happy Home";
        addr.street = "Mahatma Gandhi street";
        addr.colony = "Nehru colony";
        addr.city = "Ahmedabad";
        addr.state = "UP";
        addr.pincode = 12345;
    }
}
