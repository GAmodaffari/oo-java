package ALIENI;

public class Alieno {
	
	private String tipo;
	private int danno;
	
	public Alieno(String a){
		
		this.tipo=a;
		
		if(tipo=="verde"){
			danno=5;
		}else if(tipo=="rosso"){
			danno=10;
		}else if(tipo=="giallo"){
			danno=2;
		}
		
	}
	public int getDanno(){
		return danno;
	}

}
