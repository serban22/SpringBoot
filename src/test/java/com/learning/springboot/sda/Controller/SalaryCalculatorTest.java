package com.learning.springboot.sda.Controller;

import com.learning.springboot.sda.SoftTesting.Controller.SalaryCalculator;
import com.learning.springboot.sda.SoftTesting.Service.SalaryProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SalaryCalculatorTest {

    SalaryProvider salaryProvider = Mockito.mock(SalaryProvider.class);

    @Test
    public void checkIfIAmSuperHappy() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(200);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        String expectedResult = "I am like, REAL happy!";
        String actualResult = sc.amIHappy();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfIAmHappy() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(100);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        String expectedResult = "I am happy";
        String actualResult = sc.amIHappy();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfIAmKindaHappy() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(25);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        String expectedResult = "I am kinda happy";
        String actualResult = sc.amIHappy();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfIAmNotHappy() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(0);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        String expectedResult = "I am a sad puppy";
        String actualResult = sc.amIHappy();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void remainingMoneyAfterBuyingWithBigSalary() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(100);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        int expectedResult = 70;
        int actualResult = sc.salaryAfterBuyingShoes();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void remainingMoneyAfterBuyingWithMedSalary() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(50);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        int expectedResult = 20;
        int actualResult = sc.salaryAfterBuyingShoes();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void remainingMoneyAfterTryingToBuyWithNoMoney() {
        Mockito.when(salaryProvider.getSalary()).thenReturn(0);
        SalaryCalculator sc = new SalaryCalculator(salaryProvider);
        int expectedResult = 0;
        int actualResult = sc.salaryAfterBuyingShoes();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
