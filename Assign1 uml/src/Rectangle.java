

public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(String color, Boolean filled, double width,double length) {
        super(color, filled);
        this.width = width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area=length*width;
        return area;
    }

    public double getPerimeter(){
        double perimeter=2*(length+width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}