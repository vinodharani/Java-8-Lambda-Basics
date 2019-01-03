package com.vino;

public class ClosuresExample {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

//        num2 value is effectively final
//        num2 value will also be passed, eventhough it is not passed in the argument list
        doProcess(num1, i -> System.out.println(i + num2));

    }

    static void doProcess (int a, Process process) {
        process.process(a);
    }

    interface Process {
        void process (int i);
    }
}
