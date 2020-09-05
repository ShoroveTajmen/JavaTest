package Contest;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input");
        int cases = s.nextInt();


        for(int i=0; i<cases; i++) {
            int input = s.nextInt();
            String result = "No";
            for (int j = 1; j <= 10; j++) {
                if (input % j == 0) {
                    if (input / j <= 10) {
                        result = "yes";
                        break;
                    }
                }
            }
            System.out.println(result);

        }



    }
}
