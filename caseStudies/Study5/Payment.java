package caseStudies.Study5;

abstract public class Payment
{
    private double amount;
    private long transactionID;
    Payment(double amount, long transactionID)
    {
        this.amount = amount;
        this.transactionID = transactionID;
    }
    public double processPayment()
    {
        return amount;
    }
}