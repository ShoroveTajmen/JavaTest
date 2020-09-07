package Leetcode38;

import java.util.Scanner;

public class CountAndSay {
    public static String CountandSay(int n){
        String prev_value = "1";
        for(int i=1; i<n; i++){
            Character C = prev_value.charAt(0);
            int count = 1;
            StringBuilder s = new StringBuilder();
            if(prev_value.length()==1){
                s.append(count);
                s.append(C);
            }
            else{
                for(int j=1; j<prev_value.length(); j++){
                    Character c = prev_value.charAt(j);
                    if(c.equals(C)){
                        count++;
                    }else {
                        s.append(count);
                        s.append(C);
                        C=c;
                        count=1;
                    }
                }
                s.append(count);
                s.append(C);
            }
            prev_value=s.toString();
        }
        return prev_value;
    }
    public static void main(String[] args) {
        CountAndSay c = new CountAndSay();
        Scanner s = new Scanner(System.in);
        System.out.println("Input");
        int n = s.nextInt();
       String res = c.CountandSay(n);
        System.out.println(res);

    }
}
