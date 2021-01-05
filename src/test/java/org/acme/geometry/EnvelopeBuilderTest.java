package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;


public class EnvelopeBuilderTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testEnvelopeBuilder() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(new Coordinate(0.0,1.0));
		builder.insert(new Coordinate(2.0,0.0));
		builder.insert(new Coordinate(1.0,3.0));
		Envelope result = builder.build();
		
		Assert.assertEquals(result.getXMax(),2.0,EPSILON);
		Assert.assertEquals(result.getXMin(),0.0,EPSILON);
		Assert.assertEquals(result.getYMax(),3.0,EPSILON);
		Assert.assertEquals(result.getYMin(),0.0,EPSILON);
	};
}
