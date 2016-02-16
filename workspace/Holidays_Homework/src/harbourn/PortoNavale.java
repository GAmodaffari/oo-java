package harbourn;

public class PortoNavale {
	
	private String name;
	private int ships;
	protected double sizeSm;

	public PortoNavale() {
		
	}
	public double getSize(){
		 return this.sizeSm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShips() {
		return ships;
	}
	public void setShips(int ships) {
		this.ships = ships;
	}
	public void setSize(int size) {
		this.sizeSm = size;
	}
	
	
}
