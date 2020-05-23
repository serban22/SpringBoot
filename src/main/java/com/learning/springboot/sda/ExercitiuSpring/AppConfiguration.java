package com.learning.springboot.sda.ExercitiuSpring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppConfiguration {

    @Value("${mar.nume}")
    String mar;
    @Value("${para.nume}")
    String para;
    @Value("${morcov.nume}")
    String morcov = "morcov";
    @Value("${cartof.nume}")
    String cartof = "cartof";

    @Bean
    public Produs mar() {
        return new Produs(mar);
    }

    @Bean
    public Produs para() {
        return new Produs(para);
    }

    @Bean
    public Produs morcov() {
        return new Produs(morcov);
    }

    @Bean
    public Produs cartof() {
        return new Produs(cartof);
    }

    /*@Value("${vanzator1.nume}")
    String vanzator1;
    @Value("${vanzator2.nume}")
    String vanzator2;
    @Value("${vanzator3.nume}")
    String vanzator3;

    @Bean
    public Vanzator vanzator1() {
        return new Vanzator(vanzator1);
    }

    @Bean
    public Vanzator vanzator2() {
        return new Vanzator(vanzator2);
    }

    @Bean
    public Vanzator vanzator3() {
        return new Vanzator(vanzator3);
    }*/
}