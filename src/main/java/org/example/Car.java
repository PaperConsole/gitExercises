package org.example;

public class Car {
    private int Age;
    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Car(int age, String name) {
        Age = age;
        Name = name;
    }
}
