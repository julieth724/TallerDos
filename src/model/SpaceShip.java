package model;

/**
 * Super clase
 * Clase Abstracta
 */

public abstract class SpaceShip {

    private static int id = 0;
    private String shipType;
    private String shipName;
    private double weight;
    private double height;
    private int pushingForce;
    private int power;
    String fuelType;

    /**
     * Contructor Sobrecargado
     * @param id
     * @param shipType
     * @param shipName
     * @param fuelType
     * @param power
     * @param height
     * @param weight
     * @param pushingForce
     */
    public SpaceShip(int id, String shipType, String shipName, String fuelType, int power, double height, double weight, int pushingForce){
        this.shipName=shipName;
        this.shipType=shipType;
        this.fuelType=fuelType;
        this.power=power;
        this.height=height;
        this.weight=weight;
        this.pushingForce=pushingForce;
        this.id=id;
    }

    /**
     * Creación de Getter and Setter
     *
     */
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SpaceShip.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPushingForce() {
        return pushingForce;
    }

    public void setPushingForce(int pushingForce) {
        this.pushingForce = pushingForce;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "SpaceShip" +
                ", \nid=" + id + '\'' +
                ", \nname=" + shipName + '\'' +
                ", \nshipType='" + shipType + '\'' +
                ", \nweight=" + weight +
                ", \nheight=" + height +
                ", \npushingForce=" + pushingForce +
                ", \npower=" + power +
                ", \nfuelType='" + fuelType + '\'' ;
    }

    /**
     * método abstracto
     */
    public abstract void createship();
}
