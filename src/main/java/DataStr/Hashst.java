package DataStr;

import java.util.HashSet;
import java.util.Set;

public class Hashst {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.clear();
        hs.add("asd");
        hs.add(null);
        hs.add("asd");
        hs.add("aaa");
        hs.add("bbb");

        System.out.println(hs);
    }
}
