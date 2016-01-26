package ALIENI;

public class Gioco {
	
	private Giocatore player;
	
	public Gioco(Giocatore a){
		this.player=a;
	}
	
	public int scontro(Alieno[] b){
		int somma=0;
		for(int i=0; i<b.length; i++){
			
			somma=somma+b[i].getDanno();
		}
		return this.player.getSalute()-somma;
		
	}
	public boolean giocatoreVivo(){
		boolean status=false;
		if(this.player.getSalute()>0){
			status =true;
		}else{
			status =false;
		}
		return status;
		
	}
	
	public static void main(String[] args) {
			
			
			Alieno a= new Alieno("verde");
			Alieno b= new Alieno ("rosso");
			Alieno c= new Alieno ("giallo");
			Alieno d= new Alieno ("rosso");
			
			Alieno gruppo[]={a,b,c,d};
			Giocatore player = new Giocatore();
	
			Gioco a1= new Gioco(player);// creo la partita;
			
				System.out.println("Vita gicatore = "+a1.scontro(gruppo));
				System.out.println("Il gicatore è vivo ? "+a1.giocatoreVivo());
	
	}

}
