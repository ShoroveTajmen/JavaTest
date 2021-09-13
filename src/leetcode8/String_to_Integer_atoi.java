package leetcode8;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class String_to_Integer_atoi {
    public int myAtoi(@NotNull String s) {
        // if s is null or empty
        if(s==null || s.length() == 0) return 0;

        // remove the leading spaces
        s = s.trim();

        // after trim if the string is empty. eg: " "
        if(s.length() == 0) return 0;

        long num =0; // declare variable to store calculated value
        int sign=1; // declare variable to store sign, initially lets consider it positive 1

        // convert string to char array
        char[] chars = s.toCharArray();

        int i =0; // define index counter variable
        if(chars[i] == '-'){
            sign = -1;
            i++;
        }else if(chars[i] == '+'){
            sign = 1;
            i++;
        }

        // case: when input is only "-" or "+"
        if(i==chars.length) return 0;

        // if string starts with alphabet no need to go fatrther, return
        if(chars[i] <'0' && chars[i]>'9') return 0;

        // we don't need to initialize i, bcz we already did before sign check
        for(;i<chars.length;i++){
            if(chars[i] < '0' || chars[i] > '9') return (int)num*sign;

            num = num*10 + (chars[i]-'0');

            if(num*sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(num*sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        }

        return (int)num*sign;
    }
    public static void main(String[] args) {
        String_to_Integer_atoi st = new String_to_Integer_atoi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int result = st.myAtoi(s);
        System.out.println(result);


    }
}
