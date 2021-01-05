package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class EnvelopeBuilder {
	
	
	private List<Coordinate> coordinates = new ArrayList<Coordinate>();
	private double minX = 0;
	private double minY = 0;
	private double maxX = 0;
	private double maxY = 0;
	
	public void insert(Coordinate coordinate) {
		coordinates.add(coordinate);
	};
	public Envelope build() {

		for (Coordinate c : coordinates) {
			if (c.getX() > maxX)
				maxX = c.getX();
			if (c.getX() < minX)
				minX = c.getX();
			if (c.getY() > maxY)
				maxY = c.getY();
			if (c.getY() < minY)
				minY = c.getY();
			
		};
		
		Coordinate bottomLeft = new Coordinate(minX,minY);
		Coordinate topRight = new Coordinate(maxX,maxY);
		
		return new Envelope(bottomLeft,topRight);
	};

}
