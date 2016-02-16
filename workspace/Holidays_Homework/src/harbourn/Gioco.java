package harbourn;

public class Gioco {
	
	private PortoNavale a;
	
	public Gioco(PortoNavale a) {
		this.a=a;
		
	}
	public void war(Invasore [] a){
		
		double totloss=0; double damage;
		
		for(int i=0; i<a.length; i++){
			
			totloss=totloss+a[i].countIndexP();
		}
		
		this.a.sizeSm=this.a.getSize()-totloss;
		
	}
public boolean destroyed(){
		
		boolean destroy=false;
		if(this.a.getSize()==0 || this.a.getSize()<0){
			destroy=true;
		}
		return destroy;
	}

}
