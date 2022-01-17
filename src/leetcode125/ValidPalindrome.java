package leetcode125;

import leetcode242.ValidAnagram;

import java.util.Scanner;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        String NewStr = s.toLowerCase();
        while (start <= end){
            while (start <= end && !Character.isLetterOrDigit(NewStr.charAt(start))){
                start++;
            }
            while (start <= end && !Character.isLetterOrDigit(NewStr.charAt(end))){
                end--;
            }
            if(start <= end && NewStr.charAt(start) != NewStr.charAt(end)) return false;
            start ++;
            end --;
        }
        return true;

    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome : ");
        String str = sc.nextLine();
        boolean result = vp.isPalindrome(str);
        System.out.println(result);

    }
}
