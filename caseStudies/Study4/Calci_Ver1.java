package caseStudies.Study4;

public class Calci_Ver1 extends CalcVer1
{
    @Override
    int add(int a, int b) {
        return a+b;
    }
    @Override
    int sub(int a, int b) {
        return Math.abs((a-b));
    }
    @Override
    public double power(double a, double b)
    {
        return super.power(a, b);
    }
}
