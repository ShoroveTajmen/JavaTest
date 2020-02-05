package Constructor_chain;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Job j1 = new Job();
        j1.show();

        Job j2 = new Job("zzzzzz");
        j2.show();

        Job j3 = new Job("sssss",30000);
        j3.show();
    }
}
