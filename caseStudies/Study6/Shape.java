package caseStudies.Study6;

abstract public class Shape
{
    private double radius;
    private String colour;
    public Shape(double radius, String colour)
    {
        this.radius = radius;
        this.colour = colour;
    }
    public Shape(String colour)
    {
        this.colour = colour;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}