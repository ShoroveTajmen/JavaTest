package leetcode541;

import java.util.Scanner;

public class ReverseStringII {


    public static String reverseStr(String s, int k) {
        char[] wordArray = s.toCharArray();
        for(int i=0; i<s.length(); i += 2*k)
        {
             int start = i;
             int end = Math.min(i + k-1,wordArray.length-1);
            while (start < end){
                char temp = wordArray[start];
                wordArray[start++] = wordArray[end];
                wordArray[end--] = temp;

            }
        }
        return String.valueOf(wordArray);


    }
    public static void main(String[] args) {
        ReverseStringII r = new ReverseStringII();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a integer: ");
        int k = sc.nextInt();
        String result = r.reverseStr(str,k);
        System.out.println(result);


    }
}
