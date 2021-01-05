package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {

	@Test
	public void testWritePoint() {
		
		Geometry g = new Point(new Coordinate(3.0,4.0));
		WktWriter writer = new WktWriter();
		Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
		
		Geometry g2 = new Point();
		Assert.assertEquals("POINT EMPTY", writer.write(g2));
		
	};
	
	@Test
	public void testWriteLineString() {
		
		Point p = new Point(new Coordinate(0.0,0.0));
		Point p1 = new Point(new Coordinate(1.0,1.0));
		List<Point> points = new ArrayList<Point>();
		points.add(p);
		points.add(p1);
		Geometry g = new LineString(points);
		

		WktWriter writer = new WktWriter();
		Assert.assertEquals("LINESTRING(0.0 0.0,1.0 1.0)", writer.write(g));
	};
}
