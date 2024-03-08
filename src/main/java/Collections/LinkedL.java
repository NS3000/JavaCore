package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(6);
        ll.add(9);
        ll.addLast(4);
        ll.addFirst(3);

        ll.set(2,99);

        for (Integer integer : ll) {
            System.out.print(integer + "-->");
        }

    }
}
