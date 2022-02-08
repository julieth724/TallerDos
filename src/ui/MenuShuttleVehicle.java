package ui;
import java.util.Scanner;

import model.ShuttleVehicle;

/**
 *
 * Clase para creacion de nave tripulada
 *
 */
public class MenuShuttleVehicle {
    /**
     * metodo de ejecucion de menu con switch case pora eleccion de datos
     */
   static void showShVeShipMenu() {
        int response1 = 0;

            System.out.println("\n");
            System.out.println("What ship do you want to create?");
            System.out.println("1. Saturno V");
            System.out.println("2. Atlas V");
            System.out.println("3. Delta IV");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response1 = Integer.valueOf(sc.nextLine());

            switch (response1) {
                case 1:
                    createshuttleVehicles1();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 2:
                    createshuttleVehicles2();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 3:
                    createshuttleVehicles3();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 0:
                    MenuShip.showSpaceShipMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

    }
    /**
     * metodos para creacion de naves de lanzadera
     */
    static void createshuttleVehicles1(){
        System.out.println("The Shuttle Vehicle was created");
        ShuttleVehicle sShuttleVehicle = new ShuttleVehicle(1, "ShuttleVehicle", "Saturno V", "combustible químico", 133, 88.7, 30.4, 88,118);
        System.out.println(sShuttleVehicle);
    }

    static void createshuttleVehicles2(){
        System.out.println("The Shuttle Vehicle was created");
        ShuttleVehicle sShuttleVehicle = new ShuttleVehicle(2, "ShuttleVehicle", "Atlas V", "combustible solido", 133, 88.7, 30.4, 88,118);
        System.out.println(sShuttleVehicle);
    }

    static void createshuttleVehicles3() {
        System.out.println("The Shuttle Vehicle was created");
        ShuttleVehicle sShuttleVehicle = new ShuttleVehicle(3, "ShuttleVehicle", "Delta IV", "combustible químico", 133, 88.7, 30.4, 88, 118);
        System.out.println(sShuttleVehicle);

    }
}
