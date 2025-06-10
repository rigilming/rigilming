package ru.kfc.autotest.homework3;

public class savingDebitCard extends bankCards {

    private double depositPoints;

    public savingDebitCard(String cardName, double balance) {
        super(cardName, balance);
    }

    @Override
    public void buy(double amount) {

    }

    @Override
    public void deposit(double amount) {
        plusBalance(amount);
        depositPoints = amount * 0.0005;
        System.out.println("Карта " + getCardName() + ", Пополнение на " + amount + ", Накопление " + depositPoints + ", Баланс после накоплении: " + (getBalance() + depositPoints));


    }
}
