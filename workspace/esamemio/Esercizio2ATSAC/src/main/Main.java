package main;

public class Main {

	public static void main(String[] args) {
		
		ValoriTemperature v = new ValoriTemperature();
		
		GestioneErrore er = new GestioneErrore();
		
	GestioneSensori gestione = new GestioneSensori(v, er);
		
		TemperatureSensor st = new TemperatureSensor();
		st.setListener(gestione);
		 
		for(int i = 0; i < 1000; i++) {
			st.next();
		}
		
		System.out.println("Misura massima: " + v.getMax());
		System.out.println("Media delle misure: " + v.calcolaMedia());

	}

}
