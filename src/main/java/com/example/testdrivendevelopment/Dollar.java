package com.example.testdrivendevelopment;

public class Dollar extends Money{
    public String currency;

    public Dollar(int i, String currency){
        money = i;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return "USD";
    }

    public Dollar times(int i){

        return new Dollar((money*i),"USD");
    }

}
