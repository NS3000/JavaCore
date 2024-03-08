package abstraction;

public class Circle extends Shape{
    double radius;
    Circle(String color,double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Color of circle is : " + super.getColor() + " and area is :"+ area();
    }


}
