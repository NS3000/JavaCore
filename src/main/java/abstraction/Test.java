package abstraction;

public class Test {
    public static void main(String[] args) {

        //With Abstract Class

        Shape rec1= new Rectangle("Blue",10,15);
        Shape cir1 = new Circle("Red",5);

        System.out.println(rec1.toString());
        System.out.println(cir1.toString());

        ///With Interface

        Animal d1=new Dog("Tommie");
        Animal c1=new Cat("Khalid");

        d1.makeSound();
        d1.eat();
        c1.eat();
        c1.makeSound();


    }
}
