package com.example.testdrivendevelopment;

public abstract class Money {
    private String currency;
    public int money;
    public abstract Money times(int amount);
    protected Money(){};
    protected Money(int i,String currency){
        money = i;
        this.currency = currency;
    }
    public static Money dollar(int money){
        return new Dollar(money,"USD");
    }
    public static Money fran(int money){
        return new Fran(money,"CHF");
    }
    public boolean equals(Object object){
        Money dollar = (Money) object;
        return money == dollar.money &&
                getClass() == object.getClass();
    }


    public abstract String currency();
}
