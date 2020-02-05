package Inheritance.Inheritance1;

public class Manager extends Member {
    String department;

    public void show2(){
        System.out.println("Department:" +this.department);
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "tdhd";
        e1.age = "34";
        e1.phNum = "072727777777";
        e1.address = "t-block";
        e1.specialization = "jjj";
        e1.salary = 6777;
        e1.printSalary();
        e1.show();
        e1.display();

        System.out.println();

        Manager m1 = new Manager();
        m1.name = "rita";
        m1.age = "20";
        m1.phNum = "78827788888";
        m1.address = "dhaka";
        m1.department = "cse";
        m1.salary = 9999;
        m1.printSalary();
        m1.show2();
        m1.display();
    }
}
