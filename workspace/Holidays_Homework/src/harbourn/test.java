package harbourn;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		PortoNavale pn = new PortoNavale();
		pn.setSize(200);
		
		Sottomarino s = new Sottomarino();
		s.setStazza(10);
		s.setWeapons(3);
		
		Aereo a = new Aereo();
		a.setWeaponsAlpha(5);
		a.setWeaponsBeta(2);
		
		Invasore [] i ={a,s};
		Gioco g = new Gioco(pn);
		for(int j=0; j<pn.getSize(); j++){
		g.war(i[j]);
		}
		System.out.println(g.destroyed());

	}

}
