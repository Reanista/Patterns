package Lab2.graph;

public abstract  class AbstractGOFactory {
	public abstract Point createPoint(CompositeShape parent);
	
	//public abstract Line createLine();
	public abstract Circle createCircle(CompositeShape parent);
	
	public abstract TriangleAdapter createTriangle(CompositeShape parent);
	public abstract CompositeShape createRoot();
	public abstract CompositeShape createContainer(CompositeShape parent);

}
