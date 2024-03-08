package Polymorphism;

public class Runtime {
    public static void main(String[] args) {
        A obj;
        obj = new A();
        obj.print();
        obj = new B();
        obj.print();
    }
}

class A{
    void print(){
        System.out.println("In Class A");
    }
}
class B extends A{
    @Override
    void print(){
        System.out.println("In Class B");
    }
}