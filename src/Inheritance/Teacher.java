package Inheritance;

public class Teacher extends Student{
    String designation;

    public void show(){
        System.out.println("Designation: " +this.designation);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "shorove";
        s1.id = "191-15-2370";
        s1.department = "CSE";
        s1.display();

        Teacher t1 = new Teacher();
        t1.name = "Akhi";
        t1.id = "700177727";
        t1.department = "CSE";
        t1.designation = "lecturer";
        t1.display();
        t1.show();
    }

}
