package leetcode83;
public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int i) {
            this.data=i;
        }

        void Node(int data){
            this.data = data;
            next = null;
        }
    }
     Node ReverseList(Node node){
        Node prev = null;
        Node current= node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.head  = new Node(10);
        l.head.next = new Node(20);
        l.head.next.next = new Node(30);
        l.head.next.next.next = new Node(40);

        System.out.println("Given Linked list");
        l.printList(head);
        head = l.ReverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        l.printList(head);
    }
}
