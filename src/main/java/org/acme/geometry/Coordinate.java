package org.acme.geometry;

public class Coordinate {
	
	//Attributes
	private double x;
	private double y;
	
	//Constructors
	public Coordinate() {
		x = 0.0;
		y = 0.0;
	};
	public Coordinate(double x, double y) {
		this.x= x;
		this.y = y;
	};
	
	//Getters
	public double getX() {
		return x;
	};
	
	public double getY() {
		return y;
	};
	
	public boolean isEmpty() {
		return Double.isNaN(x) || Double.isNaN(y);
	};
}
