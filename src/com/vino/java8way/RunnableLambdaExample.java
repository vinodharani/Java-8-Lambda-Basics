package com.vino.java8way;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing inside Runnable");
            }
        });

        thread.run();

//        Runnable interface has only one method in it
//        so, this is a perfect candidate for using lambda expression
//        the following implementation uses lambda function
//        so, lambda expressions are backwards compatible with older interface as well
//        as long as the interface has only one method
        Runnable runnable = () -> System.out.println("Printing inside Lambda Runnable");
        Thread thread1 = new Thread(runnable);
        thread1.run();
    }
}
