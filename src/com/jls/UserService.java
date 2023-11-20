package com.jls;

import java.util.Optional;

public class UserService {


    public Optional<String> getUserEmail (String userId) {
        //code to get user email
        String email = getEmailFromDatabase();
        return Optional.ofNullable(email);
    }

    private String getEmailFromDatabase() {
        return null;
    }

    public void print(String s){
        System.out.println(s);
    }
}
