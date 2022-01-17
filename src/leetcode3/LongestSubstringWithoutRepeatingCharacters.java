package leetcode3;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] data = new int[26];
        for(int i = 0; i<s.length(); i++){
            data[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j<s.length(); j++){
            if(data[s.charAt(j)] == 2){
                int result = data.length;
                return result;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        String s;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s = s1.nextLine();
        int final_result = l.lengthOfLongestSubstring(s);
        System.out.println(final_result);

    }
}
