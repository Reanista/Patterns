package Lab2.graph;

public class ColorGOFactory extends AbstractGOFactory {
	public static final Point DEFAULT_POINT = new Point(0,0); 	
	
	@Override
	public Point createPoint(CompositeShape parent) {
		Point p = DEFAULT_POINT.clone();
		Scene.instance.add(parent, p); // hook
		return p;
	}

	@Override
	public Circle createCircle(CompositeShape parent) {
		Circle c = new Circle(0,0,1);
		Scene.instance.add(parent, c);
		return c;
	}

	@Override
	public TriangleAdapter createTriangle(CompositeShape parent) {
		TriangleAdapter t = new TriangleAdapter(0, 0, 0, 1, 1, 0, "black");
		Scene.instance.add(parent, t);
		return t;
	}

	@Override
	public CompositeShape createRoot() {
		CompositeShape cs = new CompositeShape();
		Scene.instance.add(null, cs);
		return cs;
	}

	@Override
	public CompositeShape createContainer(CompositeShape parent) {
		CompositeShape cs = new CompositeShape();
		Scene.instance.add(parent, cs);
		return cs;
	}

}
