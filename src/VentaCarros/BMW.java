package VentaCarros;

public class BMW extends Car {

    public BMW(CarType type, String carID, int maxSpeed) {
        super(type, carID, maxSpeed);
    }

    @Override
    public int increaseSpeed(int dV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int decreaseSpeed(int dV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}