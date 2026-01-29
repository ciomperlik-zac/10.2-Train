import javax.swing.*;
import java.awt.*;              

public class RailCar {
    private int x, y;

    public RailCar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawCar(Graphics g) {
        g.drawOval(x + 5, y + 50, 20, 20);
        g.drawOval(x + 75, y + 50, 20, 20);

        
    }
}
