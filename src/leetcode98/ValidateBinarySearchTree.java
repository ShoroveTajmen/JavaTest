package leetcode98;

class Node{
    int key;
    Node left,right;

    Node(Integer key){
        key = key;
        left=right=null;
    }
}

public class ValidateBinarySearchTree {
    Node root;
    public boolean isValidBST(Node root){
        if(root == null){
            return true;
        }
        return dfs(root, null, null);
    }
    public boolean dfs(Node root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if((min != null && root.key <= min) || (max != null && root.key >= max)){
            return false;
        }
        return dfs(root.left, min, root.key) && dfs(root.right, root.key, max);
    }

    boolean isValid()
    {
        // check if tree is mirror of itself
        return dfs(root, null,null);
    }


    public static void main(String[] args) {
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();
        v.root = new Node(5);
        v.root.left = new Node(1);
        v.root.left.left = new Node(null);
        v.root.left.right = new Node(null);
        v.root.right = new Node(7);
        v.root.right.left = new Node(3);
        v.root.right.right = new Node(8);

        boolean output = v.isValid();
        if(output == true){
            System.out.println("Is valid");
        }
        else{
            System.out.println("Is not valid");
        }

    }
}
