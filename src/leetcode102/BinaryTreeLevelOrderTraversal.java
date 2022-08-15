package leetcode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeLevelOrderTraversal {
    static TreeNode root;

    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> result = new ArrayList<>();
     if(root == null){
         return result;
     }
     Queue<TreeNode> q  = new LinkedList<>();
     q.offer(root);
     while(!q.isEmpty()){
         int size = q.size();
         List<Integer> tempList = new ArrayList<>();
         for(int i = 0; i < size; i++){
             TreeNode current = q.poll();
             tempList.add(current.val);
             if(current.left != null){
                 q.add(current.left);
             }
             if(current.right != null){
                 q.add(current.right);
             }
         }
         result.add(tempList);
     }
     return result;
    }
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();

        b.root = new TreeNode(3);
        b.root.left = new TreeNode(9);
        b.root.right = new TreeNode(20);
        b.root.right.left = new TreeNode(15);
        b.root.right.right = new TreeNode(7);
        List<List<Integer>> output = b.levelOrder(root);
        System.out.println(output);

    }
}
