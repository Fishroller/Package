package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HolyDayServiceTest {
    @Test
    void shouldCalculateIncome_10_000_expenses_3000_threshold_20_000() {
        HolyDayService service = new HolyDayService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяцев отдыха - " + actual);
        System.out.println(" ");
    }

    @Test
    void shouldCalculateIncome_100_000_expenses_60_000_threshold_150_000() {
        HolyDayService service = new HolyDayService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяцев отдыха - " + actual);
    }
}
