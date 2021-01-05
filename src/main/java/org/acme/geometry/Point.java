package org.acme.geometry;

public class Point implements Geometry {
	
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
		return "Point";
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
	
	

}
