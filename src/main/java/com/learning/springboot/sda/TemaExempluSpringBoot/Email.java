package com.learning.springboot.sda.TemaExempluSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Email {

    private Printer printer;

    private String emailContent = "This is a short email.";

    @Autowired
    @Qualifier("faxPrinter")//anotatie care este recomandata sa mearga pe setter si constructor
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printEmail() {
        System.out.println(emailContent);
        printer.write();
    }
}
