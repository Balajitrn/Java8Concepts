package com.jls;

public interface Vehicle {
    default void print(){
        System.out.println("This is a vehicle");
    }

    static void blowHorn(){
        System.out.println("Blowing Horn");
    }
}
