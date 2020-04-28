package Encapsulation;

public class test {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setvalue(20,10);

        System.out.println("Age: " +s1.getAge());
        System.out.println("cgpa: " +s1.getCgpa());
    }
}
