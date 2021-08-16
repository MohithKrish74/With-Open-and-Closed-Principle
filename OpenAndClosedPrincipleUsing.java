package com.keyword;

interface PaymentType
{
    public void processPayment();
}

class Payments
{
    public void paymentProcessing(PaymentType paymentType)
    {
        paymentType.processPayment();
    }
}

class Cash implements PaymentType
{
    public void processPayment()
    {
        System.out.println("Amount is cash type");
    }
}

class DebitCard implements PaymentType
{
    public void processPayment()
    {
        System.out.println("Amount through debit.");
    }
}

class CreditCard implements PaymentType
{
    public void processPayment()
    {
        System.out.println("Amount through credit.");
    }
}

public class OpenAndClosedPrincipleUsing
{
    public static void main(String[] args)
    {
        Cash cash = new Cash();
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();
        Payments payments = new Payments();
        payments.paymentProcessing(cash);
        payments.paymentProcessing(debitCard);
        payments.paymentProcessing(creditCard);
    }
}
