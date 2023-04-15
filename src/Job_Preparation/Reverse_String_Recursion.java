package Job_Preparation;

public class Reverse_String_Recursion {
    public static void reverse(String str, int i){
        int len = str.length();
        if(len == 0){
            return;
        }
        if(i == len) return ;
        reverse(str, i+1);
        System.out.print(str.charAt(i));

    }
    public static void main(String[] args) {
        Reverse_String_Recursion r = new Reverse_String_Recursion();
        String str = "abc";
         r.reverse(str,0);
    }
}
