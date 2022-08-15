package one;

public class primeNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int flag = 0;
        int i;
        for ( i = 2; i<=10; i++){
            if(i % 2 == 0){
                flag = 1;
                break;

            }
        }
        if(i>1 && flag == 0){
            System.out.println(i);
        }
    }
}
