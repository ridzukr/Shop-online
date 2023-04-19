package org.example.app.utils;

public class NameValidator {

    public static boolean isNameValid(String name) {
        return name.isEmpty() || !name.matches(Constants.NAME_RGX);
    }
}
