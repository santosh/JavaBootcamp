package dev.santoshk;

class Employe {
    String employeeName;
    int employeeId;
    int departmentId;
    static String ceo;

    @Override
    public String toString() {
        return "Employe{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", departmentId=" + departmentId +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}

public class StaticKeywordTutorial {
    public static void main(String[] args) {
        Employe ayush = new Employe();
        ayush.employeeName = "Ayush";
        ayush.employeeId = 1;
        ayush.departmentId = 2;

        Employe vishwa = new Employe();
        vishwa.employeeName = "Vishwa Patel";
        vishwa.employeeId = 2;
        vishwa.departmentId = 10;

        ayush.ceo = "Hemanth";
        // My ceo got changed and Prachi is my ceo

        vishwa.ceo = "Prachi";

        System.out.println(ayush.toString());
        System.out.println(vishwa.toString());
    }
}