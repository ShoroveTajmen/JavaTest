package Constructor_chain.constructor_chain1;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Varsity v1 = new Varsity();
        v1.display();

        Varsity v2 = new Varsity("ffffff");
        v2.display();

        Varsity v3 = new Varsity("jjjj","t-block");
        v3.display();
    }

}
