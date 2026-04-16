package caseStudies.Study6;

public class Circle extends Shape
{
    private double radius;
    private String colour;
    public Circle(double radius, String colour)
    {
        super(radius, colour);
    }

    @Override
    public double getArea()
    {
        return (Math.PI*radius*radius);
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}