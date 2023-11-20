package com.jls;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> names = Arrays.asList("Balaji","Ananditha","Jestin","Shilpa","Sthephen","Rashmini");

        List<String > nameStartsWithJ =
        names.stream() //Stream creation
                .filter(name -> name.startsWith("J")) // Intermedaite operation : filter
                .map(String::toUpperCase) // Intermediate Operation : map
                .collect(Collectors.toList()); // terminal operation: collect

        System.out.println("names starting with J :"+ nameStartsWithJ);
    }
}
