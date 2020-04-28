package Encapsulation;

public class student {
    private int age;
    private float cgpa;

    public void setAge(int a){
        this.age = a;
    }

    public void setCgpa(int b){
        this.cgpa = b;
    }

    public int getAge(){
        return this.age;
    }

    public float getCgpa(){
        return this.cgpa;
    }

    public void setvalue(int a,int b){
        this.age = a;
        this.cgpa = b;
    }
}
