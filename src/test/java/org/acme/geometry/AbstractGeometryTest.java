package org.acme.geometry;

import org.junit.Test;

import org.junit.Assert;

public class AbstractGeometryTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void asTextTest() {
		Geometry p = new Point(new Coordinate(0.0,0.0));
		Assert.assertEquals("POINT(0.0 0.0)", ((AbstractGeometry)p).asText());
	};
}
