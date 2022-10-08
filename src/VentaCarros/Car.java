package VentaCarros;

public abstract class Car implements Vehicle {

    private CarType type;

    private String carID;

    private int maxSpeed;

    protected Car(CarType type, String carID, int maxSpeed) {
    }

    public CarType getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCarID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMaxSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}