package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testIsEmpty(){
		//TODO
		Coordinate c = Mockito.mock(Coordinate class);
		Mockito.when(c.isEmpty()).thenReturn(true);
		Point p = new Point();
		Assert.assertTrue( p.isEmpty() );
		
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
		
		Assert.assertNotSame(p1, p);
		Assert.assertSame(p1.getCoordinate(), p.getCoordinate());
		
	}

}
