package org.example;

public class Plant {
    private int Age;
    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Plant(int age, String name) {
        Age = age;
        Name = name;
    }
}
