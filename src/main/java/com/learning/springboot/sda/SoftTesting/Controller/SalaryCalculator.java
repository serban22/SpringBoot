package com.learning.springboot.sda.SoftTesting.Controller;

import com.learning.springboot.sda.SoftTesting.Service.SalaryProvider;

public class SalaryCalculator {

    SalaryProvider salaryProvider;

    public SalaryCalculator(SalaryProvider salaryProvider) {
        this.salaryProvider = salaryProvider;
    }

    public SalaryCalculator() {
    }

    public String amIHappy() {
        int salary = salaryProvider.getSalary();

        if (salary > 100) {
            return "I am like, REAL happy!";
        } else if (salary > 50 && salary <= 100) {
            return "I am happy";
        } else if (salary > 0 && salary <= 50) {
            return "I am kinda happy";
        }
        return "I am a sad puppy";
    }

    public int salaryAfterBuyingShoes() {
        int shoePrice = 30;

        int salary = salaryProvider.getSalary();

        int remainingMoney = salary - shoePrice;

        if (salary == 0) {
            remainingMoney = 0;
        }

        // if salary == 100 => RM => 70
        // if salary == 50 => RM => 20;
        // if salary == 0 => RM??? => Refactor to not buy shoes. and just return 0;

        return remainingMoney;
    }
}
