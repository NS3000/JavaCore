package Generics;

import abstraction.Dog;

public class GenericMethod {

    static <T> void genericPrint(T element)
    {
        System.out.println(element);
    }

    public static void main(String[] args) {
        genericPrint("ayush");
        genericPrint(1232312);
        genericPrint(128.67);
        genericPrint(true);
        Mango m = new Mango();
        genericPrint(m);
    }
}

class Mango{
    int id=1;

    @Override
    public String toString() {
        return "Mango with id: "+id;
    }
}
