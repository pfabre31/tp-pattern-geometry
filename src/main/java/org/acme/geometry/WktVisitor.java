package org.acme.geometry;

public class WktVisitor implements GeometryVisitor {

	private StringBuilder buffer = new StringBuilder("");
	
	@Override
	public void visit(Point point) {
		// TODO Auto-generated method stub
		WktWriter writer = new WktWriter();
		buffer.append( writer.write(point) );
		

	}

	@Override
	public void visit(LineString linestring) {
		// TODO Auto-generated method stub
		WktWriter writer = new WktWriter();
		buffer.append( writer.write(linestring) );

	}
	
	public String getResult() {
		return buffer.toString();
	};
	
	

}
