package com.vino.java8way;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda stringLengthLambda = s -> s.length();
        int a = stringLengthLambda.getLengthOfString("Hello Lambda!");

        System.out.println(a);

//        passing lambda function as an argument
        printLengthLambda(stringLengthLambda);
    }

    public static void printLengthLambda(StringLengthLambda stringLengthLambda) {
        int b = stringLengthLambda.getLengthOfString("Inside method ha ha ha ha");

        System.out.println(b);
    }

    interface StringLengthLambda {
        int getLengthOfString(String s);
    }
}
