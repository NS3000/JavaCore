package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TypeCheck {


    public static void main(String[] args) {

        List li = new ArrayList();
        li.add("10");
        li.add(10);
        String s = (String) li.get(1);
        System.out.println(li);



        List<String> list =new  ArrayList<>();
        list.add("hello");
        list.add("1021");
        
        System.out.println(li);

    }
}
