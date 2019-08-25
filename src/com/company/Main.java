package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Привет, мир!");

        final String HELLO = "Привет,";
        String world = "мир";

        String helloWorld = HELLO + world;
        System.out.println( "Это константа " + HELLO);
        System.out.println(helloWorld);


    }
}
