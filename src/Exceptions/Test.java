package Exceptions;

import java.util.Scanner;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z;
        try{
            // risky code
            z = x/y; // ArithmaticException
            System.out.println("Result: "+z);
        }catch(Throwable e){
            // exception handling
            System.out.println("Can not divide by zero");
        }finally {
            // finally
        }

        // file, file r location

    }
}
