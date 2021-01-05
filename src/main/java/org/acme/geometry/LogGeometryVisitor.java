package org.acme.geometry;

public class LogGeometryVisitor implements GeometryVisitor {

	public void visit (Point point) {
		System.out.print("Je suis un point avec x = " +
				point.getCoordinate().getX()  + " et y = " + point.getCoordinate().getY());
	};
	public void visit (LineString linestring) {
		System.out.print("Je suis une polyligne avec " + linestring.getNumPoints() + " points(s)");
	};
}
