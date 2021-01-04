package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		//TODO
		LineString l = new LineString();
		Assert.assertEquals( l.getNumPoints(), 0);
		
	}
	
	@Test
	public void testTranslate(){
		//TODO
		
		//Creating linestring
		
		Point p = new Point(new Coordinate(0.0,0.0));
		Point p1 = new Point(new Coordinate(1.0,1.0));
		List<Point> points = new ArrayList<Point>();
		points.add(p);
		points.add(p1);
		LineString l = new LineString(points);
	
		l.translate(0.5, 0.5);
		
		//Checking first point
		Assert.assertEquals( l.getPointN(0).getCoordinate().getX(),0.5, EPSILON );
		Assert.assertEquals( l.getPointN(0).getCoordinate().getY(),0.5, EPSILON );
		
		//Checking second point
		Assert.assertEquals( l.getPointN(1).getCoordinate().getX(),1.5, EPSILON );
		Assert.assertEquals( l.getPointN(1).getCoordinate().getY(),1.5, EPSILON );
	}


}
