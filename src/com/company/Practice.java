package com.company;

public class Practice {
    //Create a class Practice with following fields: String subject , Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish.
    //a. Implement the constructor method.
    //b. Implement String toString() method, that returns the String info about Practice.
    String subject;
    Person trainee;
    Person tutor;
    MyDate dateStart;
    MyDate dateFinish;

    public Practice(String subject, Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish) {
        this.subject = subject;
        this.trainee = trainee;
        this.tutor = tutor;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public String toString(){
        return "Subject: "+this.subject+
                "\nTrainee: "+this.trainee.toString()+
                "\nTutor: "+this.tutor.toString()+
                "\nStart date: "+this.dateStart.toString()+
                "\nFinish date: "+this.dateFinish.toString();
    }
}
