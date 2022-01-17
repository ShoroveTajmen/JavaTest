package leetcode384;

import java.util.Random;
import java.util.Scanner;

public class ShuffleanArray {
    int[] A;
    public ShuffleanArray(int[] nums) {
        A = nums;

    }

    public ShuffleanArray() {

    }

    public int[] reset() {
        return A;

    }

    public int[] shuffle() {
        int[] shuffle = A.clone();
        for(int i=shuffle.length-1; i >= 0; i--){
            int index = new Random().nextInt(i+1);
            int temp = shuffle[i];
            shuffle[i] = shuffle[index];
            shuffle[index] = temp;
        }
        return shuffle;
    }

    public static void main(String[] args) {
        ShuffleanArray sa = new ShuffleanArray();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i<a.length-1; i++){
             a[i] = s.nextInt();
        }


    }
}
