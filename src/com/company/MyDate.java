package com.company;

public class MyDate {
    //Create a class MyDate with the following fields: int day, int month, int year.
    //a. Implement the constructor method. It should take three integer arguments.
    //b. Implement String toString() method, that returns the String something like “21-15-2022”
    int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return this.day+"-"+this.month+"-"+this.year;
    }
}
