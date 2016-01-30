package harbourn;

public class Aereo extends Invasore {
	
	private int weaponsAlpha;
	private int weaponsBeta;
	

	public Aereo() {
		// TODO Auto-generated constructor stub
	}


	public int getWeaponsAlpha() {
		return weaponsAlpha;
	}


	public void setWeaponsAlpha(int weaponsAlpha) {
		this.weaponsAlpha = weaponsAlpha;
	}


	public int getWeaponsBeta() {
		return weaponsBeta;
	}


	public void setWeaponsBeta(int weaponsBeta) {
		this.weaponsBeta = weaponsBeta;
	}

	public double countIndexP(){
		return 1.5*(10*this.weaponsAlpha+25*this.weaponsBeta);
	}
}
