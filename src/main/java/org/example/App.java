package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        for(int i = 1; i <= 12; i++) {
            System.out.printf("\n");
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d",i*j); // formats the table by spacing it apart
            }
        }
    }
}