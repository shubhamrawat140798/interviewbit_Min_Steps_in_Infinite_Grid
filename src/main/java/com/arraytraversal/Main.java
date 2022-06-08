package com.arraytraversal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * For taking inputs.
 */
 final class Main {
    /**
     * for taking inputs.
     * @param args for taking inputs from terminal.
     */
    public static void main(final String[] args) {
        final ArrayList<Integer> xCoordinate = new ArrayList<>();
        final ArrayList<Integer> yCoordinate = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            char choice;
            do {
                System.out.print("\nEnter the X Coordinate: ");
                xCoordinate.add(scanner.nextInt());
                System.out.print("\nEnter the y Coordinate: ");
                yCoordinate.add(scanner.nextInt());
                System.out.print("\nDo you want to continue y/n: ");
                choice = scanner.next().charAt(0);
                while (choice != 'y' && choice != 'n') {
                    System.out.print("\nWrong Input : " + choice);
                    System.out.print("\nDo you want to continue y/n: ");
                    choice = scanner.next().charAt(0);
                }
            } while (choice == 'y');
            System.out.print("\nCoordinates: \nX: " + xCoordinate + "\nY: "
            + yCoordinate);
            PointTraversal pointTraversal = new PointTraversal();
            System.out.print("\nTotal steps " + pointTraversal.coverPoint(
            xCoordinate,
            yCoordinate
            ));

        }  catch (InputMismatchException exception) {
            System.out.println("Enter input should be Integer.");
            System.out.println("Log: " + exception);
        }  catch (Exception exception) {
            System.out.println("Exception occur. ");
            System.out.println("Log: " + exception);
        }
    }

    /**
     * Utility classes should not have a public or default constructor.
     */
    private Main() {
    }
}
