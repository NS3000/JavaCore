package DataStr;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(24);
        ll.add(10);
        ll.add(2);
        ll.add(47);
        ll.remove(2);
        ll.add(11);
        ll.removeFirst();

        System.out.println(ll.toString());

        System.out.println("Reverse is: ");

        Collections.reverse(ll);
        System.out.println(ll);
    }
}
