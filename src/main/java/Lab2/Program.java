package Lab2;

import Lab2.graph.AbstractGOFactory;
import Lab2.graph.Circle;
import Lab2.graph.ColorGOFactory;
import Lab2.graph.CompositeShape;
import Lab2.graph.FillDecorator;
import Lab2.graph.Scene;

public class Program {

	public static void main(String[] args) {
		
		// "P 10 10 red C 0 0 50 blue "
		AbstractGOFactory gof = new ColorGOFactory();
		gof.createRoot();
		gof.createPoint(null).setColor("red");
		gof.createPoint(null).setColor("green");
		
		
		Scene.instance.add(null, 
			new FillDecorator(new Circle(0, 0, 50, "blue"), "aquamarin"));

		gof.createTriangle(null).setColor("pink");
		
		Scene.instance.draw();

	}

}
