package ru.kfc.autotest.homework2;

public class Person {

    String fullName;
    int age;
    int id;
    static int count = 0;

    public Person(){
        count++;
    }


    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
        this.id = count;
        count++;

    }


    public static void count() {
        System.out.println("Количество объектов " + count);
    }


    public void talk() {
        if (fullName != null && age > 0) {

            System.out.println("Привет, я " + fullName + " и мне " + age + " лет");
        }
        if (id == 2) {
            System.out.println("Привет, я " + fullName + ", избранный!");
        }
    }


}
