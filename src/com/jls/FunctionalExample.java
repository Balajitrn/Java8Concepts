package com.jls;


import java.beans.Customizer;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Functional interface in java
 * Predicate<T> : it takes an argument of type T and returns a boolean
 * Consumer<T> : accepts an argument of type T and returns no result
 * Function<T, R> : takes an argument of type T and returns a result of type R
 * Supplier <T> : takes no argument but returns a result of type T
 *
 * Lambda () -> expression/ statement;
 */
public class FunctionalExample {


    public static void main(String[] args) {
        Predicate<String> stringLenCheck = str -> str.length() > 5;
        System.out.println(stringLenCheck.test("Hello")); // check the lenght using predicate and output the result
        System.out.println(stringLenCheck.test("Hello, Learners")); // output expected - true



        Consumer<String> printConsumer = str -> System.out.println(str);
        printConsumer.accept("Hello, learners"); // output: Hello, learners

        Function<Integer, String> intToString = num -> Integer.toString(num);
        System.out.println(intToString.apply(123)); // Output: "123"

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // output : random double value
    }
}
