package com.shoshore.javafunctional.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.shoshore.javafunctional.imperative.Person.Gender.FEMALE;
import static com.shoshore.javafunctional.imperative.Person.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tapiwa", MALE),
                new Person("Tawana", FEMALE),
                new Person("Faith", FEMALE),
                new Person("Tino", MALE)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person:people){
            if (FEMALE.equals(person)){
                females.add(person);
            }
        }
    }
}
