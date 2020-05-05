import java.io.*;
import java.util.Scanner;


public class parallelogram {
    static boolean flag = true;
    static int B,H;
    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception:Breadth and height  must be positive");
        }
        else{
            System.out.println(B * H);
        }
    }

    public static void main(String[] args) {

    }
}




