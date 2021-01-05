package org.acme.geometry;

public abstract class AbstractGeometry implements Geometry {


	@Override
	public abstract Geometry clone();
	
	@Override
	public Envelope getEnvelope() {
		// TODO Auto-generated method stub
		EnvelopeBuilder builder = new EnvelopeBuilder();
		
		accept(builder);
		return builder.build();
	};

	
	public String asText() {
		WktWriter writer = new WktWriter();
		return writer.write(this);
	};
	
	

}
