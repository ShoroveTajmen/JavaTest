package Encapsulation.Encapsulation2;

public class employee extends people {
    int employee_id;
    int salary;
    String company_name;
    int position;


    public static void main(String[] args) {
        people p = new employee();
        p.height = 5;
        p.age = 30;
        p.color = "red";
        p.weight = 50;
        p.display();
    }
}
