package com.work.sunsam.java;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test();
    }

    void test(){
        System.out.println("Hello World from test method");
    }
}
