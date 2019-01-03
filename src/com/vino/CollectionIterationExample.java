package com.vino;

import com.vino.unit1exercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 66),
                new Person("Lewis", "Carroll", 82),
                new Person("Thomas", "Carlyle", 24),
                new Person("Charlotte", "Bronte", 63),
                new Person("Matthew", "Arnold", 51),
                new Person("Stephen", "Fry", 47)
        );

//        the below two are external iterators
//        this is the old way of iterating through a list
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("=====");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("=====");

//        below is the example of internal iterator
//        this is new way to do it in java 8
        people.forEach(p -> System.out.println(p));

        System.out.println("=====");
        
//        this is the same as above except this uses method reference
//        read more about method reference
        people.forEach(System.out::println);

    }
}
