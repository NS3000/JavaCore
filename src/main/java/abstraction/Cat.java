package abstraction;

public class Cat implements Animal{

    String name;
    Cat(String name){
        this.name=name;
    }
    @Override
    public void makeSound() {
        System.out.println(name +"  Meows...");
    }

    @Override
    public void eat() {
        System.out.println(name+"  eats fish.");
    }


}
