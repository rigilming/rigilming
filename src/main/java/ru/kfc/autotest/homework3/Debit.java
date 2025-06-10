package ru.kfc.autotest.homework3;

public class Debit extends Cards{

    public Debit(String cardName, double balance, double bonusPoints) {
        super(cardName, balance, bonusPoints);
    }

    @Override
    public void buy() {
        if (getBalance() < balance){
            System.out.println("Недостаточно средств на карте");
        }

    }

    @Override
    public void deposit() {

    }
}
