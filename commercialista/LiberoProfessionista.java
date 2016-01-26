package commercialista;

public class LiberoProfessionista extends Dipendenti{
	
	private int piva;
	private int numfattureannuo;

	public LiberoProfessionista() {
		super();
		this.piva=00000;
		this.numfattureannuo=0;
		
	}
	public long parcella(){
		double local=0;
		for(int i =0; i<numfattureannuo; i++){
			
			local=local+0.5;
		}
		return Math.round(super.parcella()+local);
	}
}
