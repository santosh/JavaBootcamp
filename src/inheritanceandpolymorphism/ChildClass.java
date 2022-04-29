package inheritanceandpolymorphism;

class SuperClass{
    public String val = "SUPER_VAL";
}
public class ChildClass extends SuperClass{
    private String val;
    public ChildClass(String value) {
        this.val = value;
    }
    protected void display(){
        System.out.println("val = "+this.val);
        System.out.println("val = "+super.val);
    }
    public static void main(String[] args){
        ChildClass child = new ChildClass("CHILD_VAL");
        child.display();
    }
}