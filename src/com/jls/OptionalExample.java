package com.jls;

import java.util.Optional;

/**
 * Optional.of(value) - when you are sure the value is not null, use this
 * Optional.empty() - use this to create an empty optional
 * Optional.ofNullable(value) - use this when the value might be null.
 *    it create a empty optional when the value is null
 */
public class OptionalExample {

    public static void main(String[] args) {
        Optional<String > notEmpty = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        String mayBeNullableValue = null;
        Optional<String> nullable = Optional.ofNullable(mayBeNullableValue);

        /**
         * isPresent() - checks if the value is present
         * ifPresent(consumer) - Execute the given action if a value is present
         * orElse(defaultValue) - Returns the value if present, otherwise return a default value.
         * orElseGet(supplier) - similar to orElse, but the default value is provided by the
         *                       supplier funtion
         */

        if(notEmpty.isPresent()){
            System.out.println("value Exist");
        }
        nullable.ifPresent(value -> System.out.println("Found: " + value));
        notEmpty.ifPresent(value -> System.out.println("Found value in notEmpty: " + value));

        String valueOrDefault = nullable.orElse("DefaultValue");
        System.out.println("valueOrDefault: "+valueOrDefault);

        String valueOrDefaultSupplier = nullable.orElseGet(() -> "provided by supplier");
        System.out.println("valueOrDefaultSupplier "+valueOrDefaultSupplier);

        UserService userService = new UserService();
        Optional<String> email = userService.getUserEmail("balaji");
        email.ifPresent(s -> System.out.println(s)); // print the value if the value is not null

    }
}
