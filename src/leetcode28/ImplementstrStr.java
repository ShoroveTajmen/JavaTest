package leetcode28;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(n == 0) {
            return 0;
        }
        if(n>h){
            return -1;
        }
        for(int i = 0; i<=h-n; i++){
            String partOfString = haystack.substring(i, i+n);
            if(partOfString.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr i = new ImplementstrStr();
        String haystack = "hello";
        String needle = "ll";
        int result = i.strStr(haystack,needle);
        System.out.println(result);

    }
}
