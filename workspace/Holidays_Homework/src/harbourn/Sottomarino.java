package harbourn;

public class Sottomarino extends Invasore{

	private int weapons;
	private double stazza;
	
	public Sottomarino() {
		// TODO Auto-generated constructor stub
	}

	public int getWeapons() {
		return weapons;
	}

	public void setWeapons(int weapons) {
		this.weapons = weapons;
	}

	public double getStazza() {
		return stazza;
	}

	public void setStazza(double stazza) {
		this.stazza = stazza;
	}
	
	public double countIndexP(){
		
		return 1.5*(this.stazza*this.weapons);
	}
	

}
