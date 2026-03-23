package com.prepration.concept.oops;

import lombok.Synchronized;

public class OppsEncapsulation {
    
    private String name;
    private static OppsEncapsulation oppsEncapsulation;

    @Synchronized
  public static OppsEncapsulation  getOppsEncapsulation() {
    if(oppsEncapsulation==null){
          OppsEncapsulation op= new OppsEncapsulation();
       oppsEncapsulation = op;
    }
    return oppsEncapsulation;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
