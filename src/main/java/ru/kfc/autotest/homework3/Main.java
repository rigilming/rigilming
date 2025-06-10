package ru.kfc.autotest.homework3;

public class Main {

    public static void main (String[] args) {
        Debit debitCard = new Debit("Сбер", 1000.0, 0.0);
        Debit debitCard2 = new Debit("Т-Банк", 0.0, 0.0);

        Cards[] cards = {debitCard, debitCard2};
        for (Cards card : cards) {
            card.buy();
            card.deposit();
            card.showInfo();
        }
    }
    }
