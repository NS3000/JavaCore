package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        B Objb= new B();
        Objb.printSub();
        Objb.printSuper();
    }
}
class A{
    public void printSuper(){
        System.out.println("Accessing SuperClass");
    }
}
class B extends A{
    public void printSub(){
        System.out.println("Accessing Subclass");
    }
}
