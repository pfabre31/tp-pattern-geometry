package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		//TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}
	
	@Test
	public void testXYConstructor(){
		//TODO
		Coordinate c = new Coordinate(0.2,0.5);
		Assert.assertEquals(0.2, c.getX(), EPSILON);
		Assert.assertEquals(0.5, c.getY(), EPSILON);
	}
	


}
