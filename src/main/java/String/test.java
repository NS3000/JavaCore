package String;

import javax.sound.midi.Soundbank;

public class test {
    public static void main(String[] args) {
        String s = new String("Ayush");
        String s1 = "Ayush";
        String s2 = "Ayush";
        float a= 55.0f;

        System.out.println(s== s1);
        System.out.println(s2==s1);
        System.out.println(String.valueOf(a));
    }
}
