package IMC_BMR;

public class Persona {
	
	private String nome;
	private int eta;
	private String cognome;
	private double peso;
	private double altezzacm;
	private double altezzam;
	private char sesso;
	private String attivitaFisica;
	
	public Persona(){
		
	}
	public Persona(String nome,String cognome,int eta, double peso, double altezza,char sesso, String attivitaFisica){
		 this.nome=nome;
		this.eta=eta;
		this.cognome=cognome;
		this.peso=peso;
		this.altezzacm=altezza;
		this.sesso=sesso;
		this.attivitaFisica=attivitaFisica;
		
	}
	public int geteta(){
		return eta;
	}
	public double getpeso(){
		return peso;
	}
	public double getaltezza(){
		return altezzacm;
	}
	public double getaltezzam(){
		return altezzam;
	}
	public char getsesso(){
		return sesso;
	}
	public int seteta(int a){
		this.eta=a;
		return eta;
	}
	public double setpeso(double p){
		this.peso=p;
		return peso;
	}
	public double setaltezza(double a){
		this.altezzacm=a;
		return altezzacm;
	}
	public char setsesso(char s){
		this.sesso=s;
		return sesso;
	}
	public 	String setnome(String a){
		this.nome=a;
		return nome;
	}
	public String setcognome(String s){
		this.cognome=s;
		return cognome;
    }
	public String getattivitafisica(){
		return attivitaFisica;
	}
	public String setattivitafisica(String s){
		this.attivitaFisica=s;
		return attivitaFisica;
    }
	public double convertialtezza(){
		this.altezzam=this.altezzacm/100;
		return altezzam;
	}
	public static void main (String [] args){
		
		Persona p=new Persona("Alessandro","Modaffari",19,62,172,'m',"attivo");
		
		Salute a=new Salute();
		System.out.println(a.mb(p));
		System.out.println(a.realmb(p));
		p.convertialtezza();
		System.out.println(a.imc(p));
		
	}
}