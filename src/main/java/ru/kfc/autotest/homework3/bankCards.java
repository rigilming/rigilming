package ru.kfc.autotest.homework3;

public abstract class bankCards implements Actions {
    private String cardName;
    private double balance;


    public bankCards(String cardName, double balance) {
        this.cardName = cardName;
        this.balance = balance;
    }

    public void showInfo() {
        System.out.println("Карта " + cardName + ", Баланс: " + balance);
    }

    public void plusBalance(double amount) {
        balance =   balance + amount;
    }

    public void minusBalance(double amount) {
        balance =   balance - amount;
    }

    public String getCardName() {
        return cardName;
    }

    public double getBalance() {
        return balance;
    }
}
