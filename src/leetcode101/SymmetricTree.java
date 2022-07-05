package leetcode101;


class Node{
    int key;
    Node left, right;
    Node (int key){
        key = key;
        left = right = null;
    }
}

public class SymmetricTree {
    Node root;
    public boolean isMirror(Node root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node left,Node right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.key != right.key){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right,right.left);
    }
    boolean isSymmetric()
    {
        // check if tree is mirror of itself
        return isMirror(root, root);
    }

    public static void main(String[] args) {
        SymmetricTree s = new SymmetricTree();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(2);
        s.root.left.left = new Node(3);
        s.root.left.right = new Node(4);
        s.root.right.left = new Node(4);
        s.root.right.right = new Node(3);

        boolean output = s.isSymmetric();
        if(output == true){
            System.out.println("Symmettric");
        }
        else{
            System.out.println("Not Symmetric");
        }
    }
}
