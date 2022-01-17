package fibonacci;

public class FiboMethod1 {
    static int f(int n){
        int first=0, second=1,c;
        if(n==0)
            return first;
        for(int i=2; i<=n; i++){
            c=first+second;
            first = second;
            second = c;
        }
        return second;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(f(n));
    }
}
