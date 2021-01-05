package org.acme.geometry;

import org.junit.Test;

public class LogGeometryVisitorTest {
	
	@Test
	public void tesPoint() {
		//TODO
		
		LogGeometryVisitor visitor = new LogGeometryVisitor();
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		geometry.accept(visitor);
	};
}
