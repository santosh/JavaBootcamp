package inheritanceandpolymorphism;

class Employee {
    private int employeeCode;
    private String name;

    public Employee(int employeeCode, String name) {
        this.employeeCode = employeeCode;
        this.name = name;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class SoftwareDeveloper extends Employee {
    private String programmingLanguage;

    public SoftwareDeveloper(int employeeCode, String name, String programmingLanguage) {
        super(employeeCode, name);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getDetails() {
        String details = "";
        // <name> (<employeeCode>), Software Developer with Programming Language: <programmingLanguage>
        details += this.getName() + " (" + this.getEmployeeCode() + "), " + "Software Developer";
        details += " with Programming Language: " + this.getProgrammingLanguage();
        return details;
    }
}
