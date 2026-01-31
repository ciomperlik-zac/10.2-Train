import java.awt.*;
import java.util.ArrayList;

public class Train {
    private int x, y;
    private final ArrayList<RailCar> cars;

    public Train(int x, int y) {
        this.x = x;
        this.y = y;
        this.cars = new ArrayList<>();
    }

    public void addCar(CarType type, Color color) {
        addCar(cars.size(), type, color);
    }

    public void addCar(int index, CarType type, Color color) {
        switch (type) {
            case LOCOMOTIVE:
                cars.add(index, new Locomotive(color));
                break;

            case PASSENGER:
                cars.add(index, new PassengerCar(color));
                break;

            case FREIGHT:
                cars.add(index, new FreightCar(color));
                break;

            case CABOOSE:
                cars.add(index, new Caboose(color));
                break;

            default:
                break;
        }
    }

    public void drawCars(Graphics g) {
        int drawX = x;

        for (RailCar car : cars) {
            car.drawCar(g, drawX, y);

            drawX += 150;
        }
    }
}