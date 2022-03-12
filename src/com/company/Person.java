package com.company;

public class Person {
    //Create a class Person with following fields: String firstName, String lastName, MyDate birthday.
    //a. Implement the constructor method.
    //b. Implement String toString() method, that returns the String something like “Ivanov Ivan [21-15-2022]”
    String firstName;
    String lastName;
    MyDate birthday;

    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String toString(){
        return this.lastName+" "+this.firstName+" ["+this.birthday.toString()+"]";
    }
}
