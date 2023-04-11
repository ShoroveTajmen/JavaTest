import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String str){
        int len = str.length()-1;
        String reverse = "";

        for(int i=len; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("it is a palindrome");
            return true;
        }
        else {
            System.out.println("it is not a palindrome");
            return false;
        }
    }


    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.nextLine();
        boolean result = p.isPalindrome(str);
        System.out.println(result);

    }
}
