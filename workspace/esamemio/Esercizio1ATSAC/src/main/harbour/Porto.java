package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Porto {
	
	private double DimensioneSqMeters;
	private double DimensioneSqMetersNonDistrutta;

	public void setDimensioneSqMeters(int i) {
		this.DimensioneSqMeters=i;
		this.DimensioneSqMetersNonDistrutta=i;
		
	}

	public double getDimensioneSqMeters() {
		return DimensioneSqMeters;
	}

	public double getDimensioneSqMetersNonDistrutta() {
		// TODO Auto-generated method stub
		return DimensioneSqMetersNonDistrutta;
	}

	public void addMetriQuadriDistrutti(double d) 
	{
		DimensioneSqMetersNonDistrutta = DimensioneSqMetersNonDistrutta - d;
		if(DimensioneSqMetersNonDistrutta < 0) {
			DimensioneSqMetersNonDistrutta = 0;
		}
		
	}

}
