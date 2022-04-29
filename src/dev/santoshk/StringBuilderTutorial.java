package dev.santoshk;

//public class StringBuilderTutorial {
//    public static void main(String... args) {
//        StringBuilder str = new StringBuilder("Hyderabad");
//        // Insert ABCD at index 1 -> HABCDyderabad
//        str.insert(1, "ABCD");
//        System.out.println(str.toString());
//        str.delete(1, 4);
//        System.out.println(str);
//        str.replace(1, 4, "pqrst");
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
//    }
//}


class Employee{
    int emp_num;
}

class StringBuilderTutorial {
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println(e1.emp_num);
        Employee e2 = e1;
        e2.emp_num=4;
        System.out.println(e1.emp_num + e2.emp_num);
    }
}