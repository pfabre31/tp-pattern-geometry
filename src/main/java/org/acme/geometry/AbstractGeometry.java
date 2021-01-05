package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGeometry implements Geometry {


	protected List<GeometryListener> listeners = new ArrayList<GeometryListener>();
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
	
	public void addListener(GeometryListener listener) {
		listeners.add(listener);
	};
	
	public void triggerChange() {
		for (GeometryListener listener : listeners)
			listener.onChange(this);
	};
	
	

}
