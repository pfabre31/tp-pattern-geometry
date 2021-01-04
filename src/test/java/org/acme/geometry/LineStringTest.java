package org.acme.geometry;

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


}
