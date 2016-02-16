package main.harbour;


public abstract class Invasore {
	
	private String id;
	private String modello;

	public Invasore() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public double calcolaMQDistrutti(){
		return potenzaFuoco() * 2.5;
	}
	
	public abstract int potenzaFuoco();
}
