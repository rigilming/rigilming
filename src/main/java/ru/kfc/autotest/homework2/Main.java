package ru.kfc.autotest.homework2;

public class Main {

    public static void main (String[] args) {
        Person person1 = new Person("Ригиль", 30);
        Person person0 = new Person();
        Person person2 = new Person("Иван", 22);
        Person person3 = new Person("Сергей", 22);
        person0.talk();
        person1.talk();
        person2.talk();
        person3.talk();
        Person.count();

    }



}
