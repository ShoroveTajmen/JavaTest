package Inheritance.Inheritance1;

public class Member {
    String name;
    String age;
    String phNum;
    String address;
    int salary;

    public void printSalary(){
        System.out.println("Salary: " +this.salary);
    }

    public void display(){
        System.out.println("Name: " +this.name);
        System.out.println("Age: " +this.age);
        System.out.println("PhoneNumber: " +this.phNum);
        System.out.println("Address: " +this.address);

    }
}
