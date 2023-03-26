package leetcode_105;

import java.util.HashMap;
import java.util.Map;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left=right=null;
    }
}
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    int[] preOrder;
    int[] inOrder;
    Map<Integer, Integer> hm = new HashMap<>();
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        inOrder = inorder;
        int n = preOrder.length;
         for(int i = 0; i<n; i++){
             hm.put(inorder[i], i);
         }
         TreeNode root = dfs(0, n-1);
         return root;

    }

    private TreeNode dfs(int s, int e){
        //base case
        if(s>e) return  null;

        //build the tree node
        int curVal = preOrder[index++];
        TreeNode cur = new TreeNode(curVal);

        //find mid  value
        int mid = hm.get(curVal);

        //build the left subtree
        cur.left = dfs(s,mid-1);

        //build the right subtree
        cur.right = dfs(mid+1, e);

        //return the tree node
        return cur;

    }
    public static void main(String[] args) {
        ConstructBinaryTreefromPreorderandInorderTraversal c = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder =  {3,9,20,15,7};
        int[] inorder =   {9,3,15,20,7};
        TreeNode result = c.buildTree(preorder,inorder);
        System.out.println(result);

    }
}
