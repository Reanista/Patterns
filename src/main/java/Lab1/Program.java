package Lab1;

import Lab1.graph.AbstractGOFactory;
import Lab1.graph.ColorGOFactory;
import Lab1.graph.Scene;

public class Program {

	public static void main(String[] args) {
		
		AbstractGOFactory gof = new ColorGOFactory();
		gof.createPoint().setColor("red");
		gof.createPoint().setColor("green");
		
		gof.createCircle().setColor("blue");
		
		Scene.instance.draw();

	}

}
