

public class Circle extends Shape{
    private double radius =1.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*3.14*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
