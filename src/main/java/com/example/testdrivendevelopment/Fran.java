package com.example.testdrivendevelopment;

public class Fran extends Money{

    public String currency;
    public Fran(int i, String currency) {
        money = i;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return "CHF";
    }

    public Fran times(int i){

        return new Fran((money*i),"CHF");
    }


}
