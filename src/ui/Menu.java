package ui;

import java.util.Scanner;

/**
 * Clase tipo menu
 */

public class Menu {

    /**
     * metodo con switch case pora eleccion de datos
     */
    public static void showMenu() {
        System.out.println("Welcome to the NASA");
        System.out.println("Select the desired option");

        int response = 0;

            System.out.println("1. Create your spaceship");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("we are under construction of your ship");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

    }

}
