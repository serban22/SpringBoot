package com.learning.springboot.sda.ExercitiuSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


public class Magazin {

    @Autowired
    private List<Produs> listaProduse;

    private Produs produsulDinMagazin;

    @Autowired
    @Qualifier("mar")
    public void setProdusulDinMagazin(Produs produsulDinMagazin) {
        this.produsulDinMagazin = produsulDinMagazin;
    }

    public Produs getProdusulDinMagazin() {
        return produsulDinMagazin;
    }

    public List<Produs> getListaProduse() {
        if (listaProduse == null) {
            throw new IllegalArgumentException("No products are found.");
        }
        return listaProduse;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "listaProduse=" + listaProduse +
                ", produsulDinMagazin=" + produsulDinMagazin +
                '}';
    }
}

