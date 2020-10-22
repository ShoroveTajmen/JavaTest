package leetcode234;

import java.util.Stack;

public class PalindromeLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        //constructor
        ListNode(int val){
            this.val = val;
        }
    }
    static boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        for (ListNode i = head; i != null; i = i.next) {

            st.push(i.val);
        }

        for (ListNode j = head; j != null; j = j.next) {

            if (j.val != st.pop()) {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
            ListNode one = new ListNode(1);
            ListNode two = new ListNode(2);
            ListNode three = new ListNode(2);
            ListNode four = new ListNode(1);
            one.next = two;
            two.next=three;
            three.next=four;
            boolean result = isPalindrome(one);
        System.out.println(result);
    }

}
