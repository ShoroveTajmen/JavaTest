package Algorithm_Assignment;

public class StackLinkedList {
    Node Top;                  //globally head node declare.
    static class Node{
        int data;
        Node next;            //node created.

        Node (int data)                  //constructor
        {
            this.data = data;
        }
    }
    public Boolean isEmpty(){           //check stack is empty or not
        if(Top == null){
            return true;
        }
        else
            return false;
    }
    public void push(int data){                  //push method;
        Node t = new Node(data);                    //create a node;
        if(t == null)                                      //check stack is empty or not ,,t==null means stack is full;
            System.out.println("stack overflow");
        else{                                          //if stack is't full then assign data to t.node and link to next node;
            t.data = data;
            t.next = Top;
            Top = t;
        }
    }
    public int pop(){                                      //pop method;
        int x = -1;
        if(Top == null)
            System.out.println("stack is empty");
        else{
            x = Top.data;
            Top = Top.next;
        }
        return x;
    }
    public int peek(){
        if(Top == null){
            System.out.println("stack is empty");
            return -1;
        }
        else
            return Top.data;
    }

    public void display(){
        Node temp;
        temp = Top;
        while(temp!=null){

            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("  ");
    }

    public static void main(String[] args)
    {
        StackLinkedList sl = new StackLinkedList();

        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        System.out.println("Before popping: ");
        sl.display();

        System.out.println("After popping out our remaining data is: ");
        sl.pop();
        sl.pop();
        sl.display();

        System.out.println("Top element is: " + sl.peek());
    }

}
