package DataStr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listi {
    public static void main(String[] args) {

        List<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(5);
        li.add(9);
        li.add(18);
        li.add(-4);
        Collections.sort(li);
        for (int i: li){
            System.out.println(i);
        }

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Guava");

        fruitList.remove("Mango");
        fruitList.set(3,"Green Apple");

        for(String s:fruitList){
            System.out.println(s);
        }

    }

}
