package commercialista;

public class Imprenditore extends Dipendenti{

	private int piva;
	private String nomesocieta;
	private int numerofattureannuee;
	
	public Imprenditore(){
		super();
		this.piva=00000;
		this.nomesocieta="ignota";
		this.numerofattureannuee=0;
	}
	
public Imprenditore(String nome, String cognome, String cfint,int piva, String nomesocieta, int num) {
		
	this.nome=nome;
	this.cognome=cognome;
	this.cf=cf;
	this.piva=piva;
	this.nomesocieta=nomesocieta;
    this.numerofattureannuee=num;
		
	}

public long parcella(){
	if(numerofattureannuee<=100 && numerofattureannuee>0){
		return 500;
	}else{
		int local=numerofattureannuee-100;
		int somma=0;
		for(int i=0; i<local; i++){
			
			somma=somma+1;
		}
		return 500+somma;
	}
}

}
