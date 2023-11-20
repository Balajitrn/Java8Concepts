package com.jls;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference to a Static Method: ClassName::staticMethodName
 * Reference to an Instance Method of a Particular Object: instance::instanceMethodName
 *
 */
public class MethodReferenceExample {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("anandita","Jestin","Stephen","Shipla","Rashmini");

        //static method reference
        name.forEach(x -> System.out.println(x));
        name.forEach(System.out::println);

        //Reference to an Instance Method
        UserService userService = new UserService();
        name.forEach(x -> userService.print(x));
        System.out.println("****************");
        name.forEach(userService::print);


        /**
         * reference to instance method on Arbitrary Object
         * ClassName::instanceMethodName
         */
        name.stream() // creation of stream
                .map(String::toUpperCase)// method reference // intermediate operation (thee can be 0 or more intermediate operation)
                .forEach(System.out::println);

        /**
         * method reference to a constructor
         * Classname::new (new keyword)
         */

        List<User> users = name.stream()
                .map(User::new)
                .collect(Collectors.toList());


    }




}
