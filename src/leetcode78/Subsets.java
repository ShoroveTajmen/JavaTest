package leetcode78;

import leetcode152.MaximumProductSubarray;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList());
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }
        public static void main(String[] args) {
          Subsets s = new Subsets();
          int[] nums = {1,2,3};
          List<List<Integer>> res = s.subsets(nums);
          System.out.println(res);

    }
}
