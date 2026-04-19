package com.prepration.concept.designpattern.strategypattern;

public class PaymentMaster {
    
    private PaymentPay paymentPay;
    public  PaymentMaster(PaymentPay paymentPay) {
        this.paymentPay = paymentPay;
    }
    public void makePayment(double amount) {
        paymentPay.pay(amount);
    }

    public static void main(String[] args) {
        PaymentMaster creditPayment = new PaymentMaster(new CreditPay());
        creditPayment.makePayment(100.0);

        PaymentMaster upiPayment = new PaymentMaster(new UpiPay());
        upiPayment.makePayment(200.0);
        // SELECT Salary
// FROM (SELECT Salary, Dense_Rank OVER  (Order by Salary DESC) as Rank
// FROM employee) t
// WHERE Rank= n;
    }
}
