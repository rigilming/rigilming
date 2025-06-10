package ru.kfc.autotest.homework3;

public class bonusDebitCard extends bankCards {

    private double bonusPoints;

    public bonusDebitCard(String cardName, double balance) {
        super(cardName, balance);
    }

    @Override
    public void buy(double amount) {
        if (getBalance() < amount) {
            System.out.println("Карта " + getCardName() + ", Недостаточно средств на карте");
        } else {
            minusBalance(amount);
            bonusPoints = amount * 0.01;
            System.out.println("Карта " + getCardName() + ", Покупка на " + amount + " Остаток после покупки " + getBalance() + ", Бонус " + bonusPoints);
        }

    }

    @Override
    public void deposit(double amount) {
    }
}
