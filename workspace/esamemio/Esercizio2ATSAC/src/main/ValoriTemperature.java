package main;

public class ValoriTemperature {

	private int somma;
	private int Misure;
	private double massima;
	
	
	public int calcolaMedia() {
		return Math.round(somma / Misure);
	}
	
	
	public double getMax() {
		return massima;
	}
	public void setMax(double max) {
		this.massima = max;
	}
	public int getNumeroMisure() {
		return Misure;
	}
	public void setNumeroMisure(int numeroMisure) {
		this.Misure = numeroMisure;
	}
	
	public void add(double valore) {
		if (valore > massima) {
			massima = valore;
		}
		
		Misure++;
		somma += valore;
	}
}
