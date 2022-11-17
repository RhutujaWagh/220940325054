/*
Q3 : Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square, each class has two member function
named draw () and erase (). Create these using Runtime Polymorphism concepts. (10 Marks)
 */

class Shapes
{
    void draw()
    {
        System.out.println("Shape Draw....");
    }
    void erase()
    {
        System.out.println("Shape Erase....");
    }

}
class Circle extends Shapes
{
    void draw()
    {
        System.out.println("Circle Draw....");
    }
    void erase()
    {
        System.out.println("Circle Erase....");
    }

}
class Tringle extends Shapes
{
    void draw()
    {
        System.out.println("Tringle Draw....");
    }
    void erase()
    {
        System.out.println("Tringle Erase....");
    }
}
class Square extends Shapes
{
    void draw()
    {
        System.out.println("Square Draw....");
    }
    void erase()
    {
        System.out.println("Square Erase....");
    }

}
public class Shape
{
    public static Shapes shapesInfo()
    {
        switch ((int)(Math.random() * 3))
        {
            case 0 :
                return new Circle();
            case 1:
                return new Tringle();
            case 2:
                return new Square();
            default:
                System.out.println("Default");
        }
        return new Shapes();
    }



    public static void main(String[] args) {
        Shapes shapes[] = new Shapes[9];
        for(int i = 0 ; i < shapes.length ; i++)
            shapes[i] = shapesInfo();
        for(int i = 0 ; i < shapes.length ; i++)
            shapes[i].draw();
    }
}
