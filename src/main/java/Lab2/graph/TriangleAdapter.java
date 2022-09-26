package Lab2.graph;

public class TriangleAdapter extends SimpleShape {

	private Triangle t;
	
	public TriangleAdapter(int x1, int y1,
			int x2, int y2, int x3, int y3, String color) {
		super(color);
		t = new Triangle(new Coords(x1, y1), 
				new Coords(x2, y2), new Coords(x3, y3));
	}
	
	public int getX1() {
		return t.getA1().getX();
	}
	public void setX1(int x) {
		t.getA1().setX(x);
	}
	public int getX2() {
		return t.getA2().getX();
	}
	public void setX2(int x) {
		t.getA2().setX(x);
	}
	public int getX3() {
		return t.getA3().getX();
	}
	public void setX3(int x) {
		t.getA3().setX(x);
	}
	public int getY1() {
		return t.getA1().getY();
	}
	public void setY1(int x) {
		t.getA1().setY(x);
	}
	public int getY2() {
		return t.getA2().getY();
	}
	public void setY2(int x) {
		t.getA2().setY(x);
	}
	public int getY3() {
		return t.getA3().getY();
	}
	public void setY3(int x) {
		t.getA3().setY(x);
	}
	
	@Override
	public void draw() {
		System.out.printf("Triangle (%d, %d) (%d, %d) (%d, %d) %s\n", 
			getX1(), getY1(), getX2(), getY2(), getX3(), getY3(), getColor());
		
	}

}
