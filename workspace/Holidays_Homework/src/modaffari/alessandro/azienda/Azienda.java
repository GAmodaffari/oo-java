package modaffari.alessandro.azienda;

public class Azienda {

	
	private String ragioneSociale;
	private Dipendente[] array;
	
	public double sommaStipendi(){
               double somma=0;
			for(int i=0; i<this.array.length; i++){
				
				somma=somma+array[i].getcalcolastipendio();
				
			}
			return somma;
	}
	public Dipendente[] dipendenteMaxStipendi(){
		
		for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if(array[j].getcalcolastipendio() > array[j+1].getcalcolastipendio()) {
                    Dipendente k = array[j];
                    array[j] = array[j+1];
                    k = array[j+1];
                    flag=true; //Lo setto a true per indicare che � avvenuto uno scambio
                }
            }

            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
                             //non ci sono stati scambi, quindi il metodo pu� terminare
                             //poich� l' array risulta ordinato
        }
		return array;
	}
	
}
