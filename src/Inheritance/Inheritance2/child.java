package Inheritance.Inheritance2;

public class child extends parent {
    public void show(){
        System.out.println("This is child class");
    }

    public static void main(String[] args){
        parent p = new parent();
        child c = new child();
        p.display();
        c.show();
        c.display();
    }
}
