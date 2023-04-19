package org.example.app.views.positions;

import org.example.app.entities.Position;

import java.util.Scanner;

public class PositionDeleteView {

    public Position getData() {

        Scanner scanner = new Scanner(System.in);
        Position position = new Position();

        System.out.print("Enter position's id: ");
        position.setId(scanner.nextInt());

        return position;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

