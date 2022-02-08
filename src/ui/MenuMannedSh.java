package ui;

import model.MannedShip;
/**
Clase para creacion de nave tripulada
 */

import java.util.Scanner;

/**
 * metodo de ejecucion de menu con switch case pora eleccion de datos
 */

public class MenuMannedSh {
        static void showMaShipMenu() {
        int response3 = 0;

            System.out.println("What ship do you want to create?");
            System.out.println("1. Apolo");
            System.out.println("2. Vostok");
            System.out.println("3. Skylab");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response3 = Integer.valueOf(sc.nextLine());
            switch (response3) {
                case 1:
                    createMannedShip1();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 2:
                    createMannedShip2();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 3:
                    createMannedShip3();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
                case 0:
                    MenuShip.showSpaceShipMenu();
                    break;
            }

    }

    /**
     * metodos para creacion de naves tripuladas
     */
    static void createMannedShip1(){
        System.out.println("The Shuttle Vehicle was created");
        MannedShip mMannedShip = new MannedShip(1, "ShuttleVehicle", "Apolo", "combustible químico", 133, 88.7, 30.4, 88,1);
        System.out.println(mMannedShip);
    }

    static void createMannedShip2(){
        System.out.println("The Shuttle Vehicle was created");
        MannedShip mMannedShip = new MannedShip(2, "ShuttleVehicle", "Vostok", "combustible solido", 133, 88.7, 30.4, 88,2);
        System.out.println(mMannedShip);
    }

    static void createMannedShip3() {
        System.out.println("The Shuttle Vehicle was created");
        MannedShip mMannedShip = new MannedShip(3, "ShuttleVehicle", "Skylab", "combustible químico", 133, 88.7, 30.4, 88, 1);
        System.out.println(mMannedShip);

    }
}
