package model;

public class TypeUnmannedShip implements ICreateship {
    private int id;
    private SpaceShip spaceShip;
    private UnmannedShip unmannedShip;

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

    public UnmannedShip getUnmannedShip() {
        return unmannedShip;
    }

    public void setUnmannedShip(UnmannedShip unmannedShip) {
        this.unmannedShip = unmannedShip;
    }

    @Override
    public void createShip(String name, String type, double weight, double height, int pushingForce, int power,
                           String fuelType) {

    }
}
