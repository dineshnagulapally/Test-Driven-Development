package com.example.testdrivendevelopment;

public class Dollar {
    int amount;
    public Dollar() {

    }
    public Dollar(int i){
        amount = i;
    }
    public Dollar times(int i){

        return new Dollar((amount*i));
    }
}
