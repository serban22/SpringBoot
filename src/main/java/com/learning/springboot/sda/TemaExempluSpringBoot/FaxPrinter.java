package com.learning.springboot.sda.TemaExempluSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class FaxPrinter implements Printer{
    @Override
    public void write() {
        System.out.println("Printing on fax!");
    }
}
