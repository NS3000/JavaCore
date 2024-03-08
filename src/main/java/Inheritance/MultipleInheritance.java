package Inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Child cc=new Child();
        cc.printOne();
        cc.printTwo();
        cc.printThree();
    }
}

interface One{
    public void printOne();

}
interface Two{
    public void printTwo();
}
class Child implements One,Two{

    @Override
    public void printOne() {
        System.out.println("Parent 1 ");
    }

    @Override
    public void printTwo() {
        System.out.println("Parent 2");
    }

    public void printThree(){
        System.out.println("Child ");
    }

}
