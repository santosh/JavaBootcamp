package practice;

import java.util.*;

class Employeee {
    String name;
    int id;

    public Employeee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String showEmployee() {
        // return {employeeID}: {name}
        return String.format("%d: %s", this.id, this.name);
    }
}

class Registration {
    ArrayList<Employeee> employeeList;
    static int counter;

    public Registration() {
        this.employeeList = new ArrayList<Employeee>();
        counter = 1;
    }

    boolean register(Employeee emp) {
        counter++;
        return employeeList.add(emp);
    }

    String findEmployee(String name) {
        // "{employeeID}: {name}". If not found return "N/A"
        for (Employeee emp : employeeList) {
            if (Objects.equals(emp.name, name)) {
                return String.format("%d: %s", emp.id, emp.name);
            }
        }
        return "N/A";
    }

    public int getNextID() {
        return counter;
    }

    public void iterateEmployees() {
        for (Employeee e : employeeList) {
            System.out.println(e.showEmployee());
        }
    }
}

public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = sc.nextInt();

        Registration reg = new Registration();

        for (int i = 0; i < numEmployees; i++) {
            String name = sc.next();
            Employeee emp = new Employeee(name, reg.getNextID());
            reg.register(emp);
        }
        String toFind = sc.next();

        reg.iterateEmployees();

        System.out.println(reg.findEmployee(toFind));
    }
}
