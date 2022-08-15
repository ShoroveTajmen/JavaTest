package leetcode103;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left=right=null;
    }
}
public class BinaryTreeZigzagLevelOrderTraversal {
    static TreeNode root;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           List<List<Integer>> result = new ArrayList<>();
           if(root == null){
               return result;
           }
        Queue<TreeNode> q = new LinkedList<>();
           q.add(root);
           boolean reverseLevel = false;
           while(!q.isEmpty()){
               int size = q.size();
               List<Integer> level = new ArrayList<>();
               for(int i=0; i<size; i++){
                   root = q.poll();
                   level.add(root.val);
                   if(root.left !=null ){
                       q.add(root.left);
                   }
                   if(root.right !=null ){
                       q.add(root.right);
                   }
               }
               if(reverseLevel){
                   Collections.reverse(level);
               }
               result.add(level);
               reverseLevel = !reverseLevel;
           }
           return result;
    }

    public static void main(String[] args) {
       BinaryTreeZigzagLevelOrderTraversal c = new BinaryTreeZigzagLevelOrderTraversal();

        c.root = new TreeNode(3);
        c.root.left = new TreeNode(9);
        c.root.right = new TreeNode(20);
        c.root.right.left = new TreeNode(15);
        c.root.right.right = new TreeNode(7);
        List<List<Integer>> output = c.zigzagLevelOrder(root);
        System.out.println(output);

    }
}
