package ru.kfc.autotest;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20]; //Создаем массив из 20 чисел
        Random number = new Random();// не знаю

        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(35);//Присваиваем каждому значению массива число  от 0 до 34
        }

        System.out.print("Массив случайных целых чисел: ");
        for (int value : array) {
            System.out.print(value + " "); //Выводим на терминал
        }
        int max = array[0]; //Создаем переменную max
        int sum = 0; //Создаем переменную sum

        for (int number1 : array){
            sum += number1;
            if (number1 > max){
                max = number1;
            }
        }
        System.out.println("\nНаибольший элемент массива: " + max);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

