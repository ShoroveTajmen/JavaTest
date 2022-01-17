package leetcode171;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        char[] charArray = columnTitle.toCharArray();
        int strlen = charArray.length;
        int sum = 0;
        for(int i = strlen-1; i>=0; i--){
            sum+= Math.pow(26, strlen-1-i) * (((int) columnTitle.charAt(i))-64);
        }
        return sum;

    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = s.nextLine();
        System.out.println("string is: " +str);
        int result = e.titleToNumber(str);
        System.out.println(result);


    }
}
