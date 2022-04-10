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
        System.out.println("__________________________");
        System.out.println("Welcome to the NASA");
        System.out.println("Select the desired option");
        System.out.println("__________________________");


        int response = 0;

        System.out.println("__________________________");
        System.out.println("1. Create your spaceship");
        System.out.println("0. Exit");
        System.out.println("__________________________");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("________________________________________");
                    System.out.println("we are under construction of your ship");
                    System.out.println("________________________________________");
                    MenuShip.showSpaceShipMenu();

                    break;
                case 0:
                    System.out.println("__________________________");
                    System.out.println("Thank you for you visit");
                    System.out.println("__________________________");

                    break;
                default:
                    System.out.println("________________________________");
                    System.out.println("Please select a correct answer");
                    System.out.println("________________________________");

            }

    }

}
