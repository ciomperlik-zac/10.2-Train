import java.awt.*;

public class PassengerCar extends RailCar {

    public PassengerCar(Color color) {
        super(color);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) {
        // Main car
        g.setColor(color);
        g.fillRect(x, y, 130, 80);

        // Roof
        g.fillPolygon(new int[] { x - 10, x, x }, new int[] { y + 10, y + 10, y }, 3);
        g.fillPolygon(new int[] { x + 130, x + 130, x + 140 }, new int[] { y, y + 10, y + 10 }, 3);

        // Windows
        g.setColor(Color.WHITE);
        g.fillRect(x + 5, y + 20, 26, 30);
        g.fillRect(x + 36, y + 20, 26, 30);
        g.fillRect(x + 67, y + 20, 26, 30);
        g.fillRect(x + 98, y + 20, 26, 30);

        super.drawCar(g, x, y);
    }
}
