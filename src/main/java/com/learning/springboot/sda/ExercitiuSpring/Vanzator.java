package com.learning.springboot.sda.ExercitiuSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class Vanzator {

    @Autowired
    private List<Magazin> listaMagazine;

    private Magazin magazinulVanzatorului;

    @Autowired
    @Qualifier("magazin")
    public void setMagazinulVanzatorului(Magazin magazinulVanzatorului) {
        this.magazinulVanzatorului = magazinulVanzatorului;
    }

    public Magazin getMagazinulVanzatorului() {
        return magazinulVanzatorului;
    }

    public List<Magazin> getListaMagazine() {
        if (listaMagazine == null) {
            throw new IllegalArgumentException("No shops are found.");
        }
        return listaMagazine;
    }

    @Override
    public String toString() {
        return "Vanzator{" +
                "listaMagazine=" + listaMagazine +
                ", magazinulVanzatorului=" + magazinulVanzatorului +
                '}';
    }
}
