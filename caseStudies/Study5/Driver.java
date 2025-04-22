package caseStudies.Study5;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Driver Class");
        CreditCardPayement ccp = new CreditCardPayement(321321.0,1233454567);
        PayPalPayment ppp = new PayPalPayment(132361.0, 345235324);
        System.out.println(ccp.processPayment());
        System.out.println(ppp.processPayment());
    }
}