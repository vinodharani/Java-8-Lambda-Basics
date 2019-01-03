package com.vino.unit1exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7Solution {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 66),
                new Person("Lewis", "Carroll", 82),
                new Person("Thomas", "Carlyle", 24),
                new Person("Charlotte", "Bronte", 63),
                new Person("Matthew", "Arnold", 51),
                new Person("Stephen", "Fry", 47)
        );

//        sort list by age - old way of doing it
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge() - person2.getAge();
            }
        });

        System.out.println("Sorting by Age");
        printAll(people);

//        sort list by first name - old way of doing it
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getFirstName().compareTo(person2.getFirstName());
            }
        });

        System.out.println("Sorting by first name");
        printAll(people);

        System.out.println("Printing persons whose last name begins with C");
        printNamesBeginningWithC(people);

        System.out.println("Printing persons whose last name begins with D");
        printConditionally(people, new Condition() {
            @Override
            public boolean testCondition(Person person) {
                return person.getLastName().startsWith("D");
            }
        });

        System.out.println("Printing persons whose first name begins with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean testCondition(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });
    }

    private static void printNamesBeginningWithC(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
        System.out.println("=====");
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("=====");
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.testCondition(person)) {
                System.out.println(person);
            }
        }
        System.out.println("=====");
    }
}
