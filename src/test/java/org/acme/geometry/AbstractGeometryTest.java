package org.acme.geometry;

import org.junit.Test;

import org.junit.Assert;

public class AbstractGeometryTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@SuppressWarnings("deprecation")
	@Test
	public void asTextTest() {
		Geometry p = new Point(new Coordinate(0.0,0.0));
		Assert.assertEquals("POINT(0.0 0.0)", ((AbstractGeometry)p).asText());
	};
	
	@Test
	public void testEnvelope() {
		Geometry p = new Point(new Coordinate(0.0,0.0));
		Assert.assertEquals(0.0, ((AbstractGeometry)p).getEnvelope().getXMin(), EPSILON);
	};
}
