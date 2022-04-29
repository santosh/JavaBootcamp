package practice;

class Employee{
    int id;
}

public class ReferenceOrValue {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.id = 2;
        System.out.println(employee.id);

        Employee temp = employee;
        temp.id = 4;
        System.out.println(employee.id);
    }
}
