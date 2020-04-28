package ClassMore;

import Constructor_chain.Test;

public class TestMain {
    static void test2(){
        System.out.println("test2");
    }

    static {
        System.out.println("static block.");
        Human.testStatic("java: "+Human.test);
        Human hum3 = new Human("aa",23);
        System.out.println(hum3.name);
        test2();
        TestMain testMain = new TestMain();
        testMain.test();
    }

    public void test(){
        System.out.println("test");
    }

    public static void main(String[] a){
        Human hum1 = new Human("Joe",21);
        Human hum2 = new Human("Joe",21);

//        System.out.println("test: "+Human.test);
//        Human.testStatic("java");
        if(hum1.isEqual(hum2)){
            System.out.println("same human");
        }
    }
}
