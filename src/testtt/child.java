package testtt;

public class child extends parent {
    String s = "child";

    public void hello(){
        System.out.println("hello from child");
    }

    public void test(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
        hello();
        this.hello();
        super.hello();
    }

    public static void main(String[] args) {
        child c = new child();
        c.test();
    }
}
