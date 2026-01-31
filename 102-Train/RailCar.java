import java.awt.*;

public class RailCar {
    protected final Color color;

    public RailCar(Color color) {
        this.color = color;
    }

    public void drawCar(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);

        g.fillOval(x + 5, y + 60, 40, 40);
        g.fillOval(x + 85, y + 60, 40, 40);

        g.fillRect(x - 20, y + 55, 20, 5);
    }
}
