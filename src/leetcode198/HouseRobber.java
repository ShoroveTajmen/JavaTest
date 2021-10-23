package leetcode198;
import java.util.Scanner;

public class HouseRobber {
    public int rob(int[] nums) {
          int prev = 0;
          int current = nums[0];
          for(int i = 1; i<nums.length; i++){
              int temp = Math.max(current,prev+nums[i]);
              prev = current;
              current = temp;
          }
          return Math.max(prev,current);
    }
    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number's do you want to enter : ");
        int num = sc.nextInt();
        int array[] =  new int[num];
        System.out.println("Enter the "+num+"number's now");
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }

        int result = h.rob(array);
        System.out.println("final result is : " +result);



    }
}
