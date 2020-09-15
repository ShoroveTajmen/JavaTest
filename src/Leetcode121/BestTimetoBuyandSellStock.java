package Leetcode121;

import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int min = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            profit = Math.max(profit,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element you want in array:");
        n = s.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter element:");
        for(int i=0; i<n; i++){
            prices[i]=s.nextInt();
        }
        int res = b.maxProfit(prices);
        System.out.println(res);

    }
}
