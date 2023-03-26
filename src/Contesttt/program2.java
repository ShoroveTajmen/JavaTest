package Contesttt;

import java.util.Scanner;

public class program2 {

    public static boolean isPrime(int n){
        int count = 0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
 
        return true;

    }
    public static void main(String[] args) {
        program2 s = new program2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n = sc.nextInt();
        System.out.print("Enter the second number : ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

}
