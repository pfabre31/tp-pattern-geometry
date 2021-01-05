package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;

public class LineString implements Geometry {
	
	private List<Point> points;
	
	//Constructors
	public LineString() {
		List<Point> points = new ArrayList<Point>();
		
		this.points = points;
	};
	
	public LineString(List<Point> points) {
		assert(points != null );
		this.points = points;
	};
	
	//Methods


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "LINESTRING";
	}
	
	@Override
	public boolean isEmpty() {
		return this.getNumPoints() == 0;
	};
	
	@Override
	public void translate(double dx, double dy) {
		for (Point point : this.points) {
			point.translate(dx, dy);
		};
	};
	
	@Override
	public LineString clone() {
		List<Point> newPoints = new ArrayList<Point>();
		for (Point point : this.points) {
			newPoints.add(point.clone());
		};
		return new LineString(newPoints);
	};
	

	public int getNumPoints() {
		return points.size();
	};
	
	public Point getPointN(int n) {
		return points.get(n);
	};
	
	@Override
	public Envelope getEnvelope(){
		EnvelopeBuilder builder = new EnvelopeBuilder();
		for (Point point : this.points)
			builder.insert(point.getCoordinate());
		return builder.build();
		
	};
	
	public void accept(GeometryVisitor visitor) {
		
		System.out.print("Je suis une polyligne avec " + this.getNumPoints() + " points(s)");
	};

}
