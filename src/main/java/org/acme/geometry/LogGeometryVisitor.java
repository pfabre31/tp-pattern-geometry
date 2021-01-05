package org.acme.geometry;

public class LogGeometryVisitor implements GeometryVisitor {

	public void visit (Point point) {
		point.accept(this);
	};
	public void visit (LineString linestring) {
		linestring.accept(this);
	};
}
