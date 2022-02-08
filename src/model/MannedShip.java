package model;

/**
 * Clase hija de SpaceShip
 */
public class MannedShip extends SpaceShip{
    /**
     * contructor con sobrecarga
     */
    private int passengerCapacity;

    public MannedShip(int id, String shipType, String shipName, String fuelType, int power, double height, double weight, int pushingForce, int passengerCapacity) {
        super(id, shipType, shipName,  fuelType,  power,  height,  weight,  pushingForce);
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * Sobreescritura
     */
    @Override
    public void createship() {

    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
