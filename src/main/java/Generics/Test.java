package Generics;

public class Test {
    public static void main(String[] args) {
        GenericClass<String> gs = new GenericClass<>();

        gs.setObj("asdsaa");
        System.out.println(gs.getObj());

        GenericClass<Integer> gi = new GenericClass<>();

        gi.setObj(47);
        System.out.println(gi.getObj());
    }
}
