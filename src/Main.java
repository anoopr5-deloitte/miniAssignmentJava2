
public class Main
{

    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        Square obj2 = new Square();
        Triangle obj3 =new Triangle();
        Circle obj1 = new Circle();

        obj.Area(30, 20);
        obj.Area(12.5, 4.5);


        obj1.Area(3);
        obj1.Area(5.5);

        obj3.Area(5,10);
        obj3.Area(55.54,74.22);

        obj2.Area(20);
        obj2.Area(5.2);

    }
}
class Square
{

    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }

    void Area(float side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
}
class Circle
{
    double PI = Math.PI;


    void Area(double r)
    {
        double A = PI * r * r;

        System.out.println("The area of the circle is :" + A);
    }


    void Area(float r)
    {
        double A = PI * r * r;

        System.out.println("The area of the circle is :" + A);
    }
}
class Triangle
{
    void Area(int base , int height)
    {
        double A=0.5 * base * height;
        System.out.println("The area of triangle is:" + A);
    }
    void Area(double base, double height)
    {
        double A=0.5 * base * height ;
        System.out.println("The area of triangle is:"+A);
    }
}
class Rectangle
{

    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }

    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}