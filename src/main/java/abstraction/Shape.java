package abstraction;

public abstract class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    abstract double area();
    public abstract String toString();
    String getColor(){
        return color;
    }

}

