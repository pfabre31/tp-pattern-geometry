package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	@Test
	public void testIfNull(){
		//TODO
		Point p = new Point();
		Assert.assertFalse( p.getCoordinate() == null );
		
	}

}
