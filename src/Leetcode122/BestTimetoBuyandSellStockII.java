package Leetcode122;

import java.util.Scanner;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1]>prices[i]){
                profit+= prices[i+1]-prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStockII b = new BestTimetoBuyandSellStockII();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter number how many elements you want in array:");
        n = s.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter all elements:");
        for(int i=0; i<n; i++){
            prices[i]=s.nextInt();
        }
        int res = b.maxProfit(prices);
        System.out.println(res);
    }
}
