package ClassMore;

public class Human {
    public static Integer test=4;
    public String name;
    public Integer age;

    Human(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public boolean isEqual(Human hum2){
        return this.name.equals(hum2.name) && this.age.equals(hum2.age);
    }

    static void testStatic(String value){
        System.out.println("value: "+value);
    }
}
