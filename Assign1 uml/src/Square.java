

public class Square extends Rectangle{
    private double side;
    public Square(){

    }
    public Square(double side){
        this.side=side;

    }

    public Square(String color, Boolean filled,double side,double width,double length ) {
        super(color,filled,length,width);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        double ars=side*side;
        return ars;

    }

    @Override
    public double getPerimeter() {
       double pers=4*side;
       return pers;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
