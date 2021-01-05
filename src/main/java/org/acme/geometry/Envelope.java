package org.acme.geometry;

public class Envelope {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	//Constructors
	public Envelope() {
		bottomLeft = new Coordinate();
		topRight = new Coordinate();
	};
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	};
	
	public boolean isEmpty() {
		return this.bottomLeft.isEmpty() || this.topRight.isEmpty();
		
	};
	
	
	//Getters
	public double getXMin() {
		return bottomLeft.getX();
	};
	
	public double getYMin() {
		return bottomLeft.getY();
	};
	
	public double getXMax() {
		return topRight.getX();
	};
	
	public double getYMax() {
		return topRight.getY();
	};


}
