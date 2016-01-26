
public class Gestione_contabile {
	
	private double somma;
	
	public double SommaStipendi(Dipendente array[]){
		for(int i=0; i<array.length; i++){
			
			this.somma=this.somma+array[i].getStipendio();
			
		}
		return somma;
	}
	public static void chiguadagnadipiu(Dipendente array[]){
		
		for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if(array[j].getStipendio() > array[j+1].getStipendio()) {
                    Dipendente k = array[j];
                    array[j] = array[j+1];
                    k = array[j+1];
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }

            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
                             //non ci sono stati scambi, quindi il metodo può terminare
                             //poiché l' array risulta ordinato
        }
		
	}

	public static void main(String[] args) {
		
		Contratto a = new Contratto(1000,"mensile");
		Contratto a1 = new Contratto(1200,"mensile");
		Contratto a2 = new Contratto(1150,"mensile");
		Contratto a3 = new Contratto(1050,"mensile");
		
		Gestione_contabile b = new Gestione_contabile();
		
		Dipendente c = new  Dipendente("alessandro","modaffari",a,10);
		Dipendente c1 = new  Dipendente("aleso","mdaffari",a1,10);
		Dipendente c2 = new  Dipendente("sandro","mffari",a2,10);
		Dipendente c3 = new  Dipendente("asandro","modaffi",a3,10);
		
		Dipendente[] general={c,c1,c2,c3};
		
		a.calcolastipendio(c);
		a1.calcolastipendio(c1);
		a2.calcolastipendio(c2);
		a3.calcolastipendio(c3);
		
		System.out.println(b.SommaStipendi(general));
		
		Gestione_contabile.chiguadagnadipiu(general);		
		
		for(int i = 0; i<general.length; i++){
			
			System.out.println(general[i].getNome());
		}

	}

}
