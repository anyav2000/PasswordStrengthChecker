package com.company;

import java.util.*;

public class Main {

    public static String checker(String password) {
        if (password.length() < 8) {
            if (onlyChar(password)) {
                return " weak";
            } if (onlyDigit(password)) {
                return " very weak";
            } if (password.length() > 3 && hasChar(password) &&
                    hasDigit(password) && specialChar(password)) {
                return " medium";
            }
        } else {
            if (hasChar(password) && hasDigit(password)) {
                if (specialChar(password)) {
                    return " very strong";
                } else {
                    return " strong";
                }
            }
            else {
                return " medium strong";
            }
        }
        return "n invalid";
    }

    public static boolean specialChar(String password) {
        boolean specialChar = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (letter <= 47 || (letter >= 58 && letter <= 64) || (letter >= 91 && letter <= 96) || letter >= 123) {
                specialChar = true;
            }
        }
        return specialChar;
    }

    public static boolean hasDigit(String password) {
        boolean hasDigit = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (Character.isDigit(letter)) {
                hasDigit = true;
            }
        }
        return hasDigit;
    }

    public static boolean hasChar(String password) {
        boolean hasChar = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (Character.isLetter(letter)) {
                hasChar = true;
            }
        }
        return hasChar;
    }

    public static boolean onlyChar(String password) {
        boolean onlyChar = true;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (!Character.isLetter(letter)) {
                onlyChar = false;
            }
        }
        return onlyChar;
    }

    public static boolean onlyDigit(String password) {
        boolean onlyDigit = true;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (!Character.isDigit(letter)) {
                onlyDigit = false;
            }
        }
        return onlyDigit;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many passwords would you like to check? ");
        int times = console.nextInt();
        System.out.println();
        for (int ii = 0; ii < times; ii++) {
            System.out.print("Enter password: ");
            String password = console.next();
            System.out.println("The password '" + password + "' is a" + checker(password) + " password.");
        }
    }
}
