package modaffari.alessandro.azienda;

public class Dipendente {
	
	private String nome;
	private String cognome;
	private Contratto contratto;
	private int anzianita;
	
public double getcalcolastipendio(){
	double stipendio=0;
	
		
		double percentuale=(contratto.getStipendio_base()*0.5)/100;
		
		for(int i=0; i<getanzianita(); i++){
		
			stipendio=stipendio+percentuale;
		}
	
		return stipendio;
	}

	public double getanzianita(){
		return anzianita;
	}
	public String getNome(){
		return nome;
	}
	public Dipendente(String nome, String cognome,Contratto contratto, int annianziani){
		this.nome=nome;
		this.cognome=cognome;
		this.contratto=contratto;
		this.anzianita=annianziani;
	 
	}
}
