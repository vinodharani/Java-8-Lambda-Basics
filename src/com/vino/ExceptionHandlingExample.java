package com.vino;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 2;

//        add key to the elements of array
        processByKey(someNumbers, key, (num, kee) -> System.out.println(num + kee));
        System.out.println("=====");

//        divide element by key
        processByKey(someNumbers, key, (num, kee) -> System.out.println(num / kee));
        System.out.println("=====");
    }

//    for full tutorial, watch the java brains video
//    it is not fully implemented to catch exceptions here
    private static void processByKey(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
        }
    }
}
