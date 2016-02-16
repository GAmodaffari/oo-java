package main.harbour;
/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Cacciabombardiere extends Invasore{
	
	private int nArmamentiAlpha;
	private int nArmamentitiBeta;
	
	public Cacciabombardiere(){
		
	}

	public void setnArmamentiAlpha(int i) {
		this.nArmamentiAlpha=i;
		
	}

	public void setnArmamentiBeta(int i) {
	 this.nArmamentitiBeta=i;		
	}
	

	public int getnArmamentiAlpha() {
		return nArmamentiAlpha;
	}

	public int getnArmamentitiBeta() {
		return nArmamentitiBeta;
	}

	public int potenzaFuoco() {
		
		// => (10 + 20) * 40
		int somma = this.nArmamentiAlpha + this.nArmamentitiBeta;
		
		return somma*40;
	}

}
