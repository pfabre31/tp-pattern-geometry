package org.acme.geometry;

public class GeometryWithCachedEnvelope implements Geometry, GeometryListener {

	
	private Geometry original;
	private Envelope cachedEnvelope;
	public GeometryWithCachedEnvelope(Geometry original){
		this.original = original;
		original.addListener(this);

	};
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.original.getType();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		this.original.translate(dx, dy);
	}

	@Override
	public Geometry clone() {
		// TODO Auto-generated method stub
		return this.original.clone();
	}

	@Override
	public Envelope getEnvelope() {
		// TODO Auto-generated method stub
		if(this.cachedEnvelope == null)
			this.cachedEnvelope = this.original.getEnvelope();
		
		return this.cachedEnvelope;
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		// TODO Auto-generated method stub
		
	};
	
	@Override
	public void onChange(Geometry geometry) {
		
		this.cachedEnvelope = null;
		System.out.print( geometry.getType() + " Changed");
	};
	
	public void addListener(GeometryListener listener) {
		
	};
	

	
}
