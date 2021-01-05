package org.acme.geometry;

public class Point extends AbstractGeometry {
	
	private Coordinate coordinate;
	
	//Constructors
	public Point() {
		this.coordinate = new Coordinate();
	};
	public Point(Coordinate coordinate) {
		assert(coordinate != null);
		this.coordinate = coordinate;
	};
	
	//Getter
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	//Methods

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "POINT";
	}
	
	@Override
	public boolean isEmpty() {
		return this.getCoordinate().isEmpty();
	};
	
	@Override
	public void translate(double dx, double dy) {
			
		double newX = this.getCoordinate().getX() + dx;
		double newY = this.getCoordinate().getY() + dy;
		
		this.coordinate = new Coordinate(newX, newY);
			
	};
	
	@Override
	public Point clone() {
		return new Point(this.coordinate);
	};
	

	
	public void accept(GeometryVisitor visitor) {
		
		if (visitor instanceof LogGeometryVisitor) {
			
		} else if (visitor instanceof WktVisitor)
			visitor.visit(this);
		else if (visitor instanceof EnvelopeBuilder) {
			
			((EnvelopeBuilder) visitor).insert(this.getCoordinate());
			
		};
		
	};

	
	
	

}
