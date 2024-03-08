package abstraction;

public class Dog implements Animal{
    String name;

    Dog(String name){
        this.name=name;
    }

    @Override
    public void makeSound() {
        System.out.println(name+" Barks....");
    }

    @Override
    public void eat() {
        System.out.println(name + "  eats pedigree");
    }
}
