package com.example.realmdatabase.RealmDBForTest;

import android.app.Application;

import io.realm.RealmObject;


public class Dog  {


    public String name;
    public int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog( ) {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // ... Generated getters and setters ...
}