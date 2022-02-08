package ui;

import model.UnmannedShip;
import java.util.Scanner;

/**
 Clase para creacion de nave tripulada
 */
public class MenuUnmannedSh {
    /**
     * metodo de ejecucion de menu con switch case pora eleccion de datos
     */

    static void showUnShipMenu() {
        int response2 = 0;

            System.out.println("\n");
            System.out.println("What ship do you want to create?");
            System.out.println("1. onda Cassini-Huygens,");
            System.out.println("2. Mariner IV");
            System.out.println("3. Mariner X");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response2 = Integer.valueOf(sc.nextLine());
            switch (response2) {
                case 1:
                    createUnmannedShip1();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 2:
                    createUnmannedShip2();
                    System.out.println("\n");
                    MenuShip.showSpaceShipMenu();
                    break;
                case 3:
                    createUnmannedShip3();
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
     * metodos para creacion de naves no tripuladas
     */
    static void createUnmannedShip1(){
        System.out.println( "The Shuttle Vehicle was created");
        UnmannedShip uUnmannedShip = new UnmannedShip(1, "ShuttleVehicle", "onda Cassini-Huygens", "combustible químico", 133, 88.7, 30.4, 88,"Saturno y sus lunas");
        System.out.println(uUnmannedShip);
    }

    static void createUnmannedShip2(){
        System.out.println("The Shuttle Vehicle was created");
        UnmannedShip uUnmannedShip = new UnmannedShip(2, "ShuttleVehicle", "Mariner IV", "combustible solido", 133, 88.7, 30.4, 88,"Marte");
        System.out.println(uUnmannedShip);
    }

    static void createUnmannedShip3() {
        System.out.println("The Shuttle Vehicle was created");
        UnmannedShip uUnmannedShip = new UnmannedShip(3, "ShuttleVehicle", "Mariner X", "combustible solido", 133, 88.7, 30.4, 88, "Mercurio");
        System.out.println(uUnmannedShip);

    }
}
