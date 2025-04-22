package caseStudies.Study4;

public class Calci_Ver2 extends CalcVer2
{
    @Override
    double square(double a) {
        return a*a;
    }

    @Override
    double cube(double a) {
        return a*a*a;
    }

    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return Math.abs(a-b);
    }
}
