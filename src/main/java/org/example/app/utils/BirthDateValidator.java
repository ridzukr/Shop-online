package org.example.app.utils;

public class BirthDateValidator {
    public static boolean isBirthDateValid(String date) {
        return date.isEmpty() || !date.matches(Constants.BIRTH_DATE_RGX);
    }
}
