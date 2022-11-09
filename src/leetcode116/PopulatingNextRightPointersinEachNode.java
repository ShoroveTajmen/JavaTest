package leetcode116;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulatingNextRightPointersinEachNode {
    private static Node root;
    public Node connect(Node root) {
        if(root == null) return root;

        Node leftNode = root;
        while(leftNode.left != null){
            Node head = leftNode;
            while(head != null){
                head.left.next = head.right;
                if(head.next != null){
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftNode = leftNode.left;

        }
        return root;
    }
//    void printLevelOrder()
//    {
//        Queue<Node> queue = new LinkedList<Node>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node tempNode = queue.poll();
//            System.out.print(tempNode.val + " #");
//
//
//            if (tempNode.left != null) {
//                queue.add(tempNode.left);
//            }
//
//            if (tempNode.right != null) {
//                queue.add(tempNode.right);
//            }
//        }
//    }
    void printLevelOrder()
    {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (true) {

            int nodeCount = q.size();
            if (nodeCount == 0)
                break;

            while (nodeCount > 0) {
                Node node = q.peek();
                System.out.print(node.val + " " );
                q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            System.out.println("#");
        }
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersinEachNode p = new PopulatingNextRightPointersinEachNode();

        p.root = new Node(1);
        p.root.left = new Node(2);
        p.root.right = new Node(3);
        p.root.left.left = new Node(4);
        p.root.left.right = new Node(5);
        p.root.right.left = new Node(6);
        p.root.right.right = new Node(7);

        p.connect(root);
//      p.printLevelOrder();
        p.printLevelOrder();


    }
}
