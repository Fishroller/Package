package ru.netology.javaqa.javaqamvn.services;

public class HolyDayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету-
        System.out.println("Месяц 1 " + " Денег " + money);
        for (int month = 2; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
                System.out.println("Месяц " + month + " Денег " + money);
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + " Денег " + money);
            }
        }
        return count;
    }
}
