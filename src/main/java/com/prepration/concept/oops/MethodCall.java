package com.prepration.concept.oops;

public class MethodCall {
    
    public static void main(String[] args) {
    
        OppsEncapsulation op= OppsEncapsulation.getOppsEncapsulation();
        op.setName("Shushant");
        System.out.println(op.getName());
        System.out.println(OppsEncapsulation.getOppsEncapsulation());
    }


}
