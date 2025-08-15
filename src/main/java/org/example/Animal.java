package org.example;

public class Animal {
    private int Age;
    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Animal(String name, int age) {
        Name = name;
        Age = age;
    }
}
