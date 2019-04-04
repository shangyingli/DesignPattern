package com.example.builderpattern.extendbuilderpattern;

public class Client {

    public static void main(String[] args) {
        User user = new User.UserBuilder("li", "yishan")
                .setAge(10)
                .setAddress("aa")
                .setPhone("122")
                .build();

    }
}
