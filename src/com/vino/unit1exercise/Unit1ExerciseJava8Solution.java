package com.vino.unit1exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8Solution {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 66),
                new Person("Lewis", "Carroll", 82),
                new Person("Thomas", "Carlyle", 24),
                new Person("Charlotte", "Bronte", 63),
                new Person("Matthew", "Arnold", 51),
                new Person("Stephen", "Fry", 47)
        );

//        sort list by age
//        the below line is commented because it does the same thing as the Collections.sort line
//        people.sort((Person p1, Person p2) -> p1.getAge() - p2.getAge());
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Sorting by Age");
        printAll(people);
        printConditionally(people, person -> true);
        performConditionallyWithPredicateAndConsumer(people, person -> true, person -> System.out.println(person));

//        sort list by first name
        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println("Sorting by first name");
        printAll(people);
        printConditionally(people, person -> true);
        printConditionallyWithPredicate(people, person -> true);
        performConditionallyWithPredicateAndConsumer(people, person -> true, person -> System.out.println(person));

//        the above two lines does the same thing
//        Predicate is an interface present in java.util.functions
//        it has an abstract method which takes in a generic object and returns boolean
//        which exactly fits our case, so we can use it instead of creating our own condition interface

//        Consumer is an interface present in java.util.functions
//        it has an abstract method which takes in a generic object and returns nothing
        System.out.println("Printing persons whose first name begins with C");
        printConditionally(people, person -> {
            if(person.getFirstName().startsWith("C")) {
                return true;
            }
            return false;
        });
        performConditionallyWithPredicateAndConsumer(people, person -> {
            if(person.getFirstName().startsWith("C")) {
                return true;
            }
            return false;
        }, person -> System.out.println(person));
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

    private static void printConditionallyWithPredicate(List<Person> people, Predicate<Person> predicate) {
        for (Person person : people) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
        System.out.println("=====");
    }

    private static void performConditionallyWithPredicateAndConsumer(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
        System.out.println("=====");
    }
}
