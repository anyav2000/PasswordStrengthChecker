package com.company;

/**
 * Created by AnyaVinogradsky on 12/23/15.
 */
public class PasswordChecker {

    private final String veryWeak = " very weak";

    private final String password;

    public PasswordChecker(String aPassword) {
        password = aPassword;
    }

    public String checkPassword() {
        if (password.length() < 8) {
            if (onlyChar()) {
                return " weak";
            } else if (onlyDigit()) {
                return veryWeak;
            } else if (password.length() > 3 && hasChar() && hasDigit() && hasSpecialChar()) {
                return " medium";
            }
        } else {
            if (hasChar() && hasDigit()) {
                if (hasSpecialChar()) {
                    return " very strong";
                } else {
                    return " strong";
                }
            } else {
                return " medium strong";
            }
        }
        return "n invalid";
    }

    private boolean hasSpecialChar() {
        boolean specialChar = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (!(Character.isLetter(letter) && Character.isDigit(letter))) {
                specialChar = true;
            }
        }
        return specialChar;
    }

    private boolean hasDigit() {
        boolean hasDigit = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (Character.isDigit(letter)) {
                hasDigit = true;
            }
        }
        return hasDigit;
    }

    private boolean hasChar() {
        boolean hasChar = false;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (Character.isLetter(letter)) {
                hasChar = true;
            }
        }
        return hasChar;
    }

    private boolean onlyChar() {
        boolean onlyChar = true;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (!Character.isLetter(letter)) {
                onlyChar = false;
            }
        }
        return onlyChar;
    }

    private boolean onlyDigit() {
        boolean onlyDigit = true;
        for (int ii = 0; ii < password.length(); ii++) {
            char letter = password.charAt(ii);
            if (!Character.isDigit(letter)) {
                onlyDigit = false;
            }
        }
        return onlyDigit;
    }
}
