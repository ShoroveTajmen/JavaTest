import java.util.*;
import java.io.*;

public class java_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;
            for (int k = 0; k < n; k++) ;
            {
                result = (int) Math.pow(2,'k') * b + result;
                System.out.println(a + result + " ");
            }
            System.out.println();
        }
    }
}


