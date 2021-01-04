package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testIfNull(){
		//TODO
		Point p = new Point();
		Assert.assertFalse( p.getCoordinate() == null );
		
	}
	
	@Test
	public void testTranslate(){
		//TODO
		Point p = new Point(new Coordinate(0.0,0.0));
		p.translate(0.5, 0.5);
		Assert.assertEquals( p.getCoordinate().getX(),0.5, EPSILON );
		Assert.assertEquals( p.getCoordinate().getY(),0.5, EPSILON );
	}

}
