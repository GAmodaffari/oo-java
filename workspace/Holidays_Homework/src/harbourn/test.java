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
		s.setWeapons(0);
		
		Aereo a = new Aereo();
		a.setWeaponsAlpha(5);
		a.setWeaponsBeta(0);
		
		Invasore [] i ={a,s};
		Gioco g = new Gioco(pn);
		
		int attacchi=0;
		
		while(!g.destroyed()){
			g.war(i);
		attacchi++;
		}
		System.out.println("Porto distrutto = "+g.destroyed());
		System.out.println("Numero di attachi: "+attacchi);

	}

}
