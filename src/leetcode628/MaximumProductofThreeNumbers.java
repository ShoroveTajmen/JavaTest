package leetcode628;

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for(int n : nums){
            if(n<=min1 ){
                min2 = min1;
                min1 = n;
            }
            else if(n<=min2){
                min2 = n;
            }

            if(n>=max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(n>=max2){
                max3 = max2;
                max2 = n;
            }
            else if(n>=max3){
                max3 = n;
            }

        }
        int poss1 = min1*min2*max1;
        int poss2 = max1*max2*max3;
        return Math.max(poss1,poss2);
    }

    public static void main(String[] args) {
      MaximumProductofThreeNumbers m = new MaximumProductofThreeNumbers();
        int nums[] = {1,2,3};
        int result= m.maximumProduct(nums);
        System.out.println(result);
    }
}
