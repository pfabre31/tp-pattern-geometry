package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class EnvelopeBuilder implements GeometryVisitor {
	
	
	private List<Coordinate> coordinates = new ArrayList<Coordinate>();
	private double minX = 0;
	private double minY = 0;
	private double maxX = 0;
	private double maxY = 0;
	
	public EnvelopeBuilder() {};
	
	public void insert(Coordinate c) {
				
		if (c.getX() > maxX)
			maxX = c.getX();
		if (c.getX() < minX)
			minX = c.getX();
		if (c.getY() > maxY)
			maxY = c.getY();
		if (c.getY() < minY)
			minY = c.getY();
		
		coordinates.add(c);
	};
	public Envelope build() {
		
		if (coordinates.size() == 0)
			return null;

		Coordinate bottomLeft = new Coordinate(minX,minY);
		Coordinate topRight = new Coordinate(maxX,maxY);
		
		return new Envelope(bottomLeft,topRight);
	};
	
	public void visit (Point point) {
		this.insert(point.getCoordinate());
		
	};
	public void visit (LineString linestring) {
		for (int i = 0; i < linestring.getNumPoints();i++)
			this.insert(linestring.getPointN(i).getCoordinate());
	};

}
