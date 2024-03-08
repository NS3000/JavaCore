package Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        E ObjE = new E();
        ObjE.printThird();
        ObjE.printSecond();
        ObjE.printFirst();
    }
}
class C{
    public void printFirst(){
        System.out.println("Accessing SuperSuperClass");
    }
}
class D extends C{
    public void printSecond(){
        System.out.println("Accessing SuperClass");
    }
}
class E extends D{
    public void printThird(){
        System.out.println("Accessing SubClass");
    }
}
