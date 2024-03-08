package String;

public class Str {
    public static void main(String[] args) {

        String s = new String("ayush");
        String s1 = "ayush";
        String s2 = new String(new char[]{'a','b','c','d'});
        System.out.println(s.equals(s1));
        System.out.println(s == s1);
        System.out.println(s2);


        String full = new String("simply dummy text of the printing");
        String[] words = full.split(" ");
        for (String x:words){
            System.out.println(x);
        }

        

    }
}
