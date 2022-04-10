package model;

/**
 * Clase que extiende de la interface
 */
public class TypeShuttleVehicle implements ICreateship {
    private int id;
    private SpaceShip spaceShip;
    private ShuttleVehicle shuttleVehicle;


    /**
     * métodos getters and setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    public ShuttleVehicle getShuttleVehicle() {
        return shuttleVehicle;
    }

    public void setShuttleVehicle(ShuttleVehicle shuttleVehicle) {
        this.shuttleVehicle = shuttleVehicle;
    }

    /**
     * sobreescritura del metodo de la interfaz
     * @param name
     * @param type
     * @param weight
     * @param height
     * @param pushingForce
     * @param power
     * @param fuelType
     */
    @Override
    public void createShip(String name, String type, double weight, double height, int pushingForce, int power,
                           String fuelType) {

    }
}
