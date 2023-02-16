package com.shoshore.javafunctional.imperative;

public class Person {
    private final Gender gender;
    private String name;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }

    enum Gender {
         MALE,FEMALE
    }

}
