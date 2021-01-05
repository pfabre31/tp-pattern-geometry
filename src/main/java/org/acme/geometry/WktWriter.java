package org.acme.geometry;

public class WktWriter {
	
	public String write (Geometry g) {
		
		String output = "";
		output += g.getType();
		if (g.isEmpty())
			output += " EMPTY";
		else {
			if ( g instanceof Point ){
			    Point point = (Point)g;
			    output += "(";
				output += point.getCoordinate().getX();
				output += " ";
				output += point.getCoordinate().getY();
				output += ")";
				
			    // traiter le cas Point
			}else if ( g instanceof LineString ){
				output += "(";
			    LineString lineString = (LineString)g;
			    
			    for (int i = 0; i < lineString.getNumPoints(); i++) {
			    	
					output += lineString.getPointN(i).getCoordinate().getX();
					output += " ";
					output += lineString.getPointN(i).getCoordinate().getY();
					output += ",";
					
					if (i == lineString.getNumPoints() - 1 ) {
						output = output.substring(0, output.length() - 1);
						output += ")";
					}

			    };
			    
			}else{
			    throw new RuntimeException("geometry type not supported");
			}
		}

		
		return output;
		
		
	};
}
