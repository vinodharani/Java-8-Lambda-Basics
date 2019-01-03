package com.vino.java8way;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
//        java 8 way -> using lambda expression
//        lambda expression of type greeting
        Greeting greeting = () -> System.out.println("Hello World!");
        greeting.perform();

//        java 7 way -> using regular class implememnting interface
//        instance of the class that implements the interface
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeter greeter = new Greeter();
        greeter.greet(helloWorldGreeting);

//        inner class method of achieving the same thing
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };
        greeter.greet(innerClassGreeting);

//        how are the above two ways different?
    }
}
