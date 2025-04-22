package caseStudies.Study5;

public class PayPalPayment extends Payment
{
    PayPalPayment(double amount, long transactionID)
    {
        super(amount, transactionID);
    }
    @Override
    public double processPayment() {
        return super.processPayment();
    }
}