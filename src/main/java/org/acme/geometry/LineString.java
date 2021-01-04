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
		this.points = points;
	};

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getNumPoints() {
		return points.size();
	};
	
	public Point getPointN(int n) {
		return points.get(n);
	};

}
