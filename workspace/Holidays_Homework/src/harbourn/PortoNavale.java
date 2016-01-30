package harbourn;

public class PortoNavale {
	
	private String name;
	private int ships;
	protected double size;

	public PortoNavale() {
		
	}
	public double getSize(){
		 return this.size;
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
		this.size = size;
	}
	
	
}
