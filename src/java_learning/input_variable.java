package java_learning;

import java.util.Scanner;

public class input_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer variable: ");
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = x+y;
        System.out.println("sum is :"+z);
    }
}
