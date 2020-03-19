package linkedlist;
import java.util.*;
public class LinkedListPoll {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();

        list.add("A");
        list.add("b");
        list.add(4);

        System.out.println("the list is :" +list);
        System.out.println("head element is:" +list.pop());
        System.out.println("final list is:" +list);

    }
}