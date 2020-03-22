package javatest;
import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        //int firstNumber = 30;
        //int secondNumber = 50;
        //int resutt = firstNumber + secondNumber;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();
        int result = n1+n2;
        System.out.println("Result is: " +result);
    }


}
