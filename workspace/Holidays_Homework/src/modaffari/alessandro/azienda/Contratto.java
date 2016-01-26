package modaffari.alessandro.azienda;

public class Contratto {
	
	private double stipendio_base;
	private String tiponome;
	
	public double getStipendio_base(){
		return stipendio_base;
	}

	public Contratto(double stipendio_base, String tiponome){
		
		this.tiponome=tiponome;
		this.stipendio_base=stipendio_base;
		
	}
}
