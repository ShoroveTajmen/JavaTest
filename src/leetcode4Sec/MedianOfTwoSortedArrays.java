package leetcode4Sec;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total_length = nums1.length + nums2.length;
        if (total_length < 1) return 0;
        if (total_length == 1) {
            return nums1.length == 1 ? nums1[0] : nums2[0];
        }
            int i = 0;
            int j = 0;
            int[] r = new int[total_length];
            int k = 0;

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums1[j]) {
                    r[k++] = nums1[i++];
                } else {
                    r[k++] = nums2[j++];
                }
                while (i < nums1.length) {
                    r[k++] = nums1[i++];
                }
                while (j < nums2.length) {
                    r[k++] = nums2[j++];
                }

                }
        int mid;
        if (total_length % 2 == 0) {
            mid = total_length / 2;
            return (double) (r[mid - 1] + r[mid]) / 2;
        } else {
            mid = total_length / 2;
            return r[mid];
            }

    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays m11 = new MedianOfTwoSortedArrays();
        Scanner s = new Scanner(System.in);
        int n,m;
        System.out.println("Enter no of element you want in array: ");
        n=s.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter all the element: ");
        for(int i = 0; i<n; i++){
            nums1[i]=s.nextInt();
        }
        System.out.println("Enter no of element you want in array:");
        m=s.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter all the element: ");
        for(int j = 0; j<n; j++){
            nums2[j]=s.nextInt();
        }
        double res = m11.findMedianSortedArrays(nums1,nums2);
        System.out.println(res);

    }
}
