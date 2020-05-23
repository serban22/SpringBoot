package com.learning.springboot.sda.ExercitiuSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);

        Magazin magazin = context.getBean("magazin", Magazin.class);
        System.out.println(magazin.getListaProduse());

        Vanzator vanzator = context.getBean("vanzator", Vanzator.class);
        System.out.println(vanzator.getListaMagazine());
    }
}
