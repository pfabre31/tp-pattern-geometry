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
	
	@Test
	public void testClone(){
		//TODO
		Point p1 = new Point(new Coordinate(0.0,0.0));
		Point p = p1.clone();
		
		p.translate(0.5, 0.5);
		
		//Checking that p1 didn't translate
		Assert.assertEquals( p1.getCoordinate().getX(),0.0, EPSILON );
		Assert.assertEquals( p1.getCoordinate().getY(),0.0, EPSILON );
	}

}
