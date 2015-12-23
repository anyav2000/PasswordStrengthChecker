package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many passwords would you like to check? ");
        int times = console.nextInt();
        System.out.println();
        for (int ii = 0; ii < times; ii++) {
            System.out.print("Enter password: ");
            String password = console.next();
            PasswordChecker checker = new PasswordChecker(password);
            System.out.println("The password '" + password + "' is a" + checker.checkPassword() + " password.");
        }
    }
}
