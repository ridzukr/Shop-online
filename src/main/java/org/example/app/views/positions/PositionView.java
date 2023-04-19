package org.example.app.views.positions;

import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositionView {

    Scanner scanner;
    int option;

    public int chooseOption() {
        scanner = new Scanner(System.in);
        showMenu();
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(Constants.INCORRECT_VALUE_MSG);
            AppStarter.startApp();
        }
        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                __ Position Menu ___________
                1 - Create a position
                2 - View positions
                3 - Delete a position
                0 - Close the App.
                """);
    }

    public void getOutput(int choice, String output) {
        if (choice == 0) System.out.println(output);
        // Scanner лучше закрыть здесь,
        // т.к. в этом методе завершаем программу.
        scanner.close();
        System.exit(0);
    }
}
