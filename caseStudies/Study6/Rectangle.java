package caseStudies.Study6;

public class Rectangle extends Shape
{
    private double height;
    private double width;
    private String colour;
    public Rectangle(double width, double height, String colour)
    {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return height*width;
    }

    @Override
    public double getPerimeter()
    {
        return 2*(height+width);
    }
}