package ui;

import java.util.Scanner;

/**
 * clase menu para elegir el tipo de nave q se desea crear
 */
public class MenuShip {


    static void showSpaceShipMenu() {
        int response4 = 0;

        System.out.println("__________________________");
        System.out.println("Select type of spaceship");
        System.out.println("1. shuttle vehicles");
        System.out.println("2. unmanned ships");
        System.out.println("3. manned ships");
        System.out.println("0. Return");
        System.out.println("__________________________");


        Scanner sc = new Scanner(System.in);
        response4 = Integer.valueOf(sc.nextLine());

        switch (response4) {
            case 1:
                MenuShuttleVehicle.showShVeShipMenu();

                break;
            case 2:
                MenuUnmannedSh.showUnShipMenu();
                break;
            case 3:

                MenuMannedSh.showMaShipMenu();
                break;
            case 0:
                Menu.showMenu();
                break;
        }

    }


}
