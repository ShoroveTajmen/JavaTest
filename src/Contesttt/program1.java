package Contesttt;

import java.util.Scanner;

public class program1 {
    public void check(String str){
        String var = "Samsung";
        if(str != var){
            System.out.println("SRBD");
        }
        else{
            System.out.println("GHOST");
        }
    }
    public static void main(String[] args) {
        program1 p = new program1();
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        p.check(str);
    }
}
