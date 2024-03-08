package Collections;

import java.util.HashMap;
import java.util.Map;


public class Hashmp {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"aaa");
        hm.put(102,"bbb");
        hm.put(103,"ccc");
        hm.put(104,"ddd");
        hm.put(105,"eee");
        hm.put(106,"fff");


        for(Map.Entry<Integer,String> i: hm.entrySet()){
            System.out.println(i);
        }
    }
}
