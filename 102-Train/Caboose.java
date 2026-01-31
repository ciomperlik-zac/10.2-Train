import java.awt.*;

public class Caboose extends RailCar {

    public Caboose(Color color) {
        super(color);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) {
        // Main car
        g.setColor(color);
        g.fillRect(x, y, 130, 80);

        // Roof
        g.fillRect(x + 20, y - 20, 90, 20);
        g.setColor(Color.BLACK);
        g.fillRect(x + 15, y - 20, 100, 5);

        // Windows
        g.setColor(Color.WHITE);
        g.fillRect(x + 25, y + 20, 25, 25);
        g.fillRect(x + 80, y + 20, 25, 25);

        super.drawCar(g, x, y);
    }
}
