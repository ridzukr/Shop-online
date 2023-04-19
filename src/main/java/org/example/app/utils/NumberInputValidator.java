package org.example.app.utils;

import org.example.app.exceptions.OptionException;

import java.util.Scanner;

public class NumberInputValidator {

    public static int validateIntInput(Scanner scan) {
        if (!scan.hasNextInt()) {
            try {
                throw new OptionException(Constants.INCORRECT_VALUE_MSG);
            } catch (OptionException e) {
                System.out.println(e.getMessage());
                AppStarter.startApp();
            }
        }
        return scan.nextInt();
    }

    public static double validateDoubleInput(Scanner scan) {
        if (!scan.hasNextDouble()) {
            try {
                throw new OptionException(Constants.INCORRECT_VALUE_MSG);
            } catch (OptionException e) {
                System.out.println(e.getMessage());
                AppStarter.startApp();
            }
        }
        return scan.nextDouble();
    }

}
