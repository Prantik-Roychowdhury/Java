package caseStudies.Study6;

public class Driver
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle(12.0,15,"Purple");
        Circle cir = new Circle(10.0,"Blue");
        System.out.println("Area of the rectangle: "+rec.getArea());
        System.out.println("Perimeter of the rectangle: "+rec.getPerimeter());
    }
}