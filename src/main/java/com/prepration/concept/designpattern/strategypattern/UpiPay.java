package com.prepration.concept.designpattern.strategypattern;

public class UpiPay implements PaymentPay {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
    
}
