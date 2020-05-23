package com.learning.springboot.sda.ExercitiuSpring;

public class Produs {

    private String numeProdus;

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "numeProdus='" + numeProdus + '\'' +
                '}';
    }
}
