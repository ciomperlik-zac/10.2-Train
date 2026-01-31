import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
	public Display() {
	}

	// paintCommponent is not explicitly called. It is executed whenever the JPanel
	// is called.
	// Graphics g object is implicitly passed to function.
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // satisfies the parent class' requirements.
		setBackground(Color.WHITE);

		Train train = new Train(100, 100);

		train.addCar(CarType.LOCOMOTIVE, Color.BLUE);
		train.addCar(CarType.PASSENGER, Color.GRAY);
		train.addCar(CarType.PASSENGER, Color.GRAY);
		train.addCar(CarType.FREIGHT, Color.GREEN);
		train.addCar(3, CarType.PASSENGER, Color.GRAY);
		train.addCar(CarType.FREIGHT, Color.GREEN);
		train.addCar(CarType.CABOOSE, Color.RED);
		train.addCar(6, CarType.FREIGHT, Color.GREEN);

		train.drawCars(g);
	}
}