package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryWithCachedEnvelopeTest {
	
	@Test
	public void testCache() {
		Coordinate coord =	new Coordinate (0.0,0.0);
		Geometry g = new Point( coord );
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope();
		Envelope b = g.getEnvelope();
		Assert.assertSame(a,b);
	}
	
	@Test
	public void testTranslate() {
		Coordinate coord =	new Coordinate (0.0,0.0);
		Geometry g = new Point( coord );
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope();
		g.translate(1.0, 1.0);
		
		Envelope b = g.getEnvelope();
		Assert.assertNotSame(a,b);
	}

}
