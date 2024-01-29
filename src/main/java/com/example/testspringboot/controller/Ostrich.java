package com.example.testspringboot.controller;

public class Ostrich {

    public static void main(String[] args) {
        String str = "sunil";
        String str1 ="";
        for(int i=0;i<str.length();i++){
            str1 = str.charAt(i) + str1;
        }
        System.out.println(str1);
    }
}
