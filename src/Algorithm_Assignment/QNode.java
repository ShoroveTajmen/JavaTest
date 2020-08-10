package Algorithm_Assignment;

import org.w3c.dom.CDATASection;

public class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue {
        private static QNode front = null, rear = null;

        public void Enqueue(int data) {
            QNode t = new QNode(data);
            if (t == null) {
                System.out.println("Queue is empty");
            } else {
                t.data = data;
                t.next = null;
                if (front == null) {
                    front = rear = t;
                } else {
                    rear.next = t;
                    rear = t;
                }
            }
        }
        public int Dequeue() {
            int x = -1;
            if (front == null) {
                System.out.println("Queue is empty");
            } else {
                front = front.next;
                x = front.data;
            }
            return x;
        }

        void display(){
            if(front==null){
                System.out.println("Queue is empty");
            }
            else{
                QNode temp = front;
                while(temp.next!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
                System.out.println( temp.data);
            }
        }
        public static void main(String[] args) {
            Queue q = new Queue();

            q.Enqueue(1);
            q.Enqueue(2);
            q.Enqueue(3);
            q.Enqueue(4);
            System.out.println("Before delete data: ");
            q.display();

            System.out.println("After deleting data: ");
            q.Dequeue();
            q.Dequeue();
            q.display();

        }
    }





