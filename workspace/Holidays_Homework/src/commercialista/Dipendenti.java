package commercialista;

import modaffari.alessandro.azienda.Contratto;

public class Dipendenti {

	protected String nome;
	protected String cognome;
	protected String cf;
	
	
	public Dipendenti() {
		this.nome="pippo";
		this.cognome="palla";
		this.cf="mdfgnn96r26f112g";
	
	}
	public Dipendenti(String nome, String cognome, String cf) {
		
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		
	}
	public String getNome() {
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public String getCf(){
		return cf;
	}
	public long parcella(){
		return 50;
	}

}
