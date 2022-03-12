package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(21,02,1967);
        System.out.println(date.toString());

        Person p = new Person("Ivan", "Ivanov", date);
        System.out.println(p.toString());

        System.out.println();

        MyDate dateTeacher = new MyDate(12,12,1951);
        Person teacher = new Person("Petr", "Petrov", dateTeacher);

        MyDate startDate = new MyDate(01,01,2022);
        MyDate finishDate = new MyDate(15,11,2023);

        Practice practice = new Practice("IT", p, teacher, startDate, finishDate);
        System.out.println(practice.toString());
    }

}
