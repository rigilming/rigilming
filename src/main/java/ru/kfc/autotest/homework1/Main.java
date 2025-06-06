package ru.kfc.autotest.homework1;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20]; //Создаем массив из 20 чисел
        Random number = new Random();// Не понял как использовать метод new Random().nextInt(),
        // поэтому нашел этот метод

        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(35);//Присваиваем каждому значению массива число  от 0 до 34
        }

        System.out.print("Массив случайных целых чисел: ");
        for (int value : array) { // Создаем переменную value и выводим каждый элемент массива на терминал,
            // но все равно не до конца понял отличие от предыдущего цикла)

            System.out.print(value + " ");
        }
        int max = array[0]; //Создаем переменную max и присваиваем ей значение первого элемента массива
        int sum = 0; //Создаем переменную sum

        for (int number1 : array){
            sum += number1;//Суммируем все элементы массива
            if (number1 > max){//Сравниваем все элементы массива с переменной max и отбираем наибольшее
                max = number1;
            }
        }
        System.out.println("\nНаибольший элемент массива: " + max);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

