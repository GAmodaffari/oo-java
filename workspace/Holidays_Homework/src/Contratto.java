
public class Contratto {
	
	private double stipendio_base;
	private String tiponome;
	private double stipendio;
	
	public double getStipendio_base(){
		return stipendio_base;
	}
	public double getStipendio(){
		return stipendio;
	}
	public double calcolastipendio(Dipendente a){
		
		double percentuale=(this.stipendio_base*0.5)/100;
		double local=stipendio_base;
		for(int i=0; i<a.getannianziani(); i++){
		
			local+=percentuale;
		}
		this.stipendio=local;
		return stipendio;
	}

	public Contratto(double stipendio_base, String tiponome){
		
		this.tiponome=tiponome;
		this.stipendio_base=stipendio_base;
		
	}
}
