package com.prepration.concept.designpattern.strategypattern;

public class CreditPay implements PaymentPay {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    
}
