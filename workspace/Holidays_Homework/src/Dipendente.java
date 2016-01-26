
public class Dipendente {
	
	private String nome;
	private String cognome;
	private Contratto contratto;
	private int annianziani;
	
	public double getStipendio(){
		return contratto.getStipendio();
	}
	public double getannianziani(){
		return annianziani;
	}
	public String getNome(){
		return nome;
	}
	public Dipendente(String nome, String cognome,Contratto contratto, int annianziani){
		this.nome=nome;
		this.cognome=cognome;
		this.contratto=contratto;
		this.annianziani=annianziani;
	 
	}
}
