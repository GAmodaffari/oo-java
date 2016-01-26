package IMC_BMR;

public class Salute {
	
	private double mb;
	private double imc;
	private String clrischio;
	
	public double mb(Persona g){	
		
	   if(g.getsesso()=='m'){
		 mb=655+(13.8*g.getpeso())+(1.8*g.getaltezza())*(4.7*g.geteta());
	   }else{
		 mb=655+(9.6*g.getpeso())+(1.8*g.getaltezza())*(4.7*g.geteta());
	   }
        
		return mb;
	}
	public double realmb(Persona g){
		
		double n;
		if(g.getattivitafisica()=="sedentario"){
			
			n=(mb*20)/100;
			mb=mb+n;
		}
		if(g.getattivitafisica()=="moderatamente attivo"){
					
		    n=(mb*30)/100;
			mb=mb+n;
				}
		if(g.getattivitafisica()=="attivo"){
			
			n=(mb*40)/100;
			mb=mb+n;
		}
		if(g.getattivitafisica()=="molto attivo"){
			
		  n=(mb*50)/100;
			mb=mb+n;
		}
		
		return mb;
	}
	
	public String imc(Persona g){
		
		this.imc=g.getpeso()/Math.pow(g.getaltezzam(),2);

		if(imc<18.5){
			clrischio="sottopeso";	
		}
		else if(imc<=25){
			clrischio="normale";
		}
		else if(imc<30){
			clrischio="sovrappeso";
		}
		else if(imc>=30){
			clrischio="obeso";
		}
		return clrischio;
		
	
	}

}
