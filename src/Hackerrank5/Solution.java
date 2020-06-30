package Hackerrank5;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] char_a = a.toLowerCase().toCharArray();
        char[] char_b = b.toLowerCase().toCharArray();

        //Sort char array; use full package path to not import
        java.util.Arrays.sort(char_a);
        java.util.Arrays.sort(char_b);

        //Condition to check equal array
        if(!java.util.Arrays.equals(char_a, char_b))
            return false;

        //Everything goes fine then its Anagram!!!!
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
