package ru.kfc.autotest.homework3;

public abstract class Cards implements Actions {
    String cardName;
    double balance;
    double bonusPoints;

    public Cards(String cardName, double balance, double bonusPoints) {
        this.cardName = cardName;
        this.balance = balance;
        this.bonusPoints = bonusPoints;
    }

    public void showInfo() {
        System.out.println("Карта" + cardName + "/nБаланс: " + balance + "/nБонусные баллы: " + bonusPoints);
    }
    public void plusBalance(double amount) {
        balance = balance + amount;
    }

    public void minusBalance(double amount) {
        balance = balance - amount;
    }

    public String getCardName() {
        return cardName;
    }

    public double getBalance() {
        return balance;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }
}
