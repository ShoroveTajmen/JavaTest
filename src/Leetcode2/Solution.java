package Leetcode2;

public class Solution {
    public static void main(String[] args) {
        int n=-121,sum=0, temp,rem;
        temp =n;
        while(n>0){
            rem = n%10;
            sum = (sum * 10)+rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("palindrome number");
        }
        else
            System.out.println("is not palindrome");

    }
}
