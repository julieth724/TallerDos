package model;

/**
 * clase hija de SpaceShip
 */
public class ShuttleVehicle extends SpaceShip {

    private int transportCapacity;

    /**
     * Constructor con sobrecarga
     * @param id
     * @param shipType
     * @param shipName
     * @param fuelType
     * @param power
     * @param height
     * @param weight
     * @param pushingForce
     * @param transportCapacity
     */
    public ShuttleVehicle(int id, String shipType, String shipName, String fuelType, int power, double height, double weight, int pushingForce, int transportCapacity) {
        super(id, shipType, shipName,  fuelType,  power,  height,  weight,  pushingForce);
        this.transportCapacity = transportCapacity;
    }

    /**
     * creacion de getter and setter
     * @return transportCapacity
     */
    public int getTransportCapacity() {
        return transportCapacity;
    }

    public void setTransportCapacity(int transportCapacity) {
        this.transportCapacity = transportCapacity;
    }

    /**
     *encapsulamiento clase toString
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() +
                "\ntransportCapacity=" + transportCapacity;
    }

    /**
     * Reescritura de metodo
     */

    @Override
    public void createship() {

    }

}

