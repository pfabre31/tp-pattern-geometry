package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		//TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testXYConstructor(){
		//TODO
		Coordinate c = new Coordinate(0.2,0.5);
		Assert.assertEquals(0.2, c.getX(), EPSILON);
		Assert.assertEquals(0.5, c.getY(), EPSILON);
	}
	
	@Test
	public void isEmpty(){
		//TODO
		Coordinate c = new Coordinate();
		Assert.assertFalse( c.isEmpty() );
		
	}


}
