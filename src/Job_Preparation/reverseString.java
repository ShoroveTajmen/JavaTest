package Job_Preparation;

import java.util.Scanner;

public class reverseString {

    public static String stringReverse(String str){
        int len = str.length();
        String rev = "";
        if(len == 0){
            return str;
        }
        for (int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }


    public static void main(String[] args) {
        reverseString r1 = new reverseString();
        //for take a inpuut from the user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String please : ");
        String str = s.nextLine();
        String revString = r1.stringReverse(str);
        System.out.println(revString);
    }
}
