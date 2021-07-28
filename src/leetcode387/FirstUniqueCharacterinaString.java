package leetcode387;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i = 0; i<n; i++){
            if(count.get(s.charAt(i))==1)
            return i;
        }
      return -1;
    }
    public static void main(String[] args) {
        FirstUniqueCharacterinaString f = new FirstUniqueCharacterinaString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        System.out.println("Your input is: "+str);
        int result = f.firstUniqChar(str);
        System.out.println(result);

    }
}
