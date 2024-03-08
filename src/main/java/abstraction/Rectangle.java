package abstraction;

public class Rectangle extends Shape{

    Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Color of box is "+super.getColor()+" and area is :" + area();
    }
    double length;
    double width;


}
