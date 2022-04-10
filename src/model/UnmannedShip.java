package model;

/**
 * Clase hija de SpaceShip
 */
public class UnmannedShip extends SpaceShip{

    /**
     * constructor con sobrecarga
     */
    private String studyPlanet;

    public UnmannedShip(int id, String shipType, String shipName, String fuelType, int power, double height, double weight, int pushingForce, String studyPlanet) {
        super(id, shipType, shipName,  fuelType,  power,  height,  weight,  pushingForce);
        this.studyPlanet = studyPlanet;
    }

    /**
     * métodos getters and setters
     *
     */
    public String getStudyPlanet() {
        return studyPlanet;
    }

    public void setStudyPlanet(String studyPlanet) {
        this.studyPlanet = studyPlanet;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUnmannedShip" +
                "\nstudyPlanet='" + studyPlanet + '\'';
    }

    @Override
    public void createship() {

    }
}
