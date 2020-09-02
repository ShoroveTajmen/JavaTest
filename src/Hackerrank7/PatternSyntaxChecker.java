package Hackerrank7;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            for(int i=0; i<testCases; i++){
                try{
                    String Pattern = in.nextLine();
                    Pattern.compareToIgnoreCase(Pattern);
                    System.out.println("Valid");
                }
                catch (Exception e){
                    System.out.println("Invalid");
                }
                testCases --;
            }

        }
    }
}
