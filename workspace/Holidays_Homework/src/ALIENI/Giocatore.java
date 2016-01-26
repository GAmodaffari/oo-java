package ALIENI;

public class Giocatore {

	private String nome;
	private static int salute;
	
	public Giocatore(){
		this.nome="Player";
		this.salute =100;
	}
	public Giocatore(String a, int b){
		this.nome=a;
		this.salute=b;
	}
	public int getSalute(){
		return salute;
	}
}
