import java.awt.*;

public class Locomotive extends RailCar {

    public Locomotive(Color color) {
        super(color);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) {
        // Main car
        g.setColor(color);
        g.fillRect(x, y, 130, 80);

        g.setColor(Color.BLACK);

        // Cowcatcher
        g.fillPolygon(new int[] { x - 40, x, x }, new int[] { y + 80, y + 80, y + 40 }, 3);

        // Steam dome
        int[] xPoints = new int[] { x, x, x + 13, x + 13, x + 27, x + 27, x + 40, x + 40 };
        int[] yPoints = new int[] { y - 40, y - 30, y - 20, y, y, y - 20, y - 30, y - 40 };
        g.fillPolygon(xPoints, yPoints, 8);

        // Window
        g.setColor(Color.WHITE);
        g.fillRect(x + 10, y + 20, 26, 25);

        super.drawCar(g, x, y);
    }
}
