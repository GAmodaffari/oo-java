package main.harbour;
/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore{
	
	private int nArmamenti;
	private int  Stazza;
	
	
	public  Sottomarino(){
		
	}

	public void setnArmamenti(int i) {
		
		this.nArmamenti=i;
	}

	public void setStazza(int i) {
		
		this.Stazza=i;
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public int getStazza() {
		return Stazza;
	}

	public int potenzaFuoco() {
		
		// la potenza di fuoco è il
				// 25% del prodotto tra numero armamenti e stazza.
				// il valore è arrotondato all'intero più vicino.
		
		int local=0;
		
		local = Math.round(((this.nArmamenti* this.Stazza)*25)/100f);
		return local;
	}
	
}
