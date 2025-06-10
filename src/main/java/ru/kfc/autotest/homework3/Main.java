package ru.kfc.autotest.homework3;

public class Main {

    public static void main (String[] args) {
        bonusDebitCard card1 = new bonusDebitCard("Сбер", 1000.0);
        bonusDebitCard card2 = new bonusDebitCard("Т-Банк", 1.0);
        savingDebitCard card3 = new savingDebitCard("Райфайзен", 999.9);
        savingDebitCard card4 = new savingDebitCard("ВТБ", 0.0);


        bankCards[] cards = {card1, card2, card3, card4};
        for (bankCards bankCards : cards) {
            bankCards.showInfo();
            bankCards.buy(200);
            bankCards.deposit(100000);
        }


    }
    }
