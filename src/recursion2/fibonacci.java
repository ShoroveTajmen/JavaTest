package recursion2;

public class fibonacci {
    static int fibonaccc(int n){
        if(n <= 1)
            return  n;
        else
            return fibonaccc(n-1) + fibonaccc(n-2);
    }

    public static void main(String[] args) {
        int number = 10,i;
        for(i=0; i<=number; i++){
            System.out.println(fibonaccc(i)+ " ");
        }
    }

}
