
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the color of the shape: ");
        String col= input.nextLine();
        System.out.println("The color of the shape is: ");
        System.out.println(col);

        Circle c1=new Circle(20);
        System.out.println("The "+col+" circle Area and Perimeter: ");
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Rectangle r1=new Rectangle(10,20);
        System.out.println("The "+col+ " rectangle Area and Perimeter: ");
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        Square s1=new Square(20);
        System.out.println("The "+col+" square side: ");
        System.out.println(s1.getSide());
        System.out.println("The "+col+" square area and perimeter: ");
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

    }
}