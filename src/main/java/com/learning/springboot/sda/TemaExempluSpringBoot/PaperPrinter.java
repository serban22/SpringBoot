package com.learning.springboot.sda.TemaExempluSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class PaperPrinter implements Printer {

    @Override
    public void write() {
        System.out.println("Writing the email on paper!");
    }
}
