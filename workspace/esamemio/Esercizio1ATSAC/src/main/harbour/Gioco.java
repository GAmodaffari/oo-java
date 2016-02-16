package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	private Porto p;
	
	public Gioco(Porto p) {
		this.p = p;
	}

	public void attacco(Invasore[] invasoriA) {
		double somma=0;
		
		for(Invasore i:invasoriA) {
			somma = somma + i.calcolaMQDistrutti();
		}
		/*for(int i=0;i<invasoriA.length; i++){
			
			somma= somma +invasoriA[i].calcolaMQDistrutti();
		}*/
		p.addMetriQuadriDistrutti(somma);
	}

	public boolean portoDistrutto() {
		System.out.println();
		if(p.getDimensioneSqMetersNonDistrutta() > 0)
			return false;
		else
			return true;
	}

}
