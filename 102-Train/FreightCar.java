import java.awt.*;

public class FreightCar extends RailCar {

    public FreightCar(Color color) {
        super(color);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) {
        // Main car
        g.setColor(color);
        g.fillRect(x, y, 130, 80);

        g.setColor(Color.BLACK);

        // Border
        g.drawRect(x + 25, y + 7, 80, 50);

        // Door line
        g.drawLine(x + 65, y + 7, x + 65, y + 57);

        // Left cross
        g.drawLine(x + 25, y + 7, x + 65, y + 57);
        g.drawLine(x + 25, y + 57, x + 65, y + 7);

        // Right cross
        g.drawLine(x + 65, y + 7, x + 105, y + 57);
        g.drawLine(x + 65, y + 57, x + 105, y + 7);

        // Handles
        g.fillRect(x + 57, y + 27, 5, 10);
        g.fillRect(x + 69, y + 27, 5, 10);

        super.drawCar(g, x, y);
    }
}
