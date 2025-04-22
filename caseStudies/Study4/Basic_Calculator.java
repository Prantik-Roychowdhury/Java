package caseStudies.Study4;

public class Basic_Calculator extends Basic_Calci
{
    @Override
    public int add(int a, int b)
    {
        return a+b;
    }
    @Override
    public int sub(int a, int b)
    {
        return Math.abs((a-b));
    }
}
