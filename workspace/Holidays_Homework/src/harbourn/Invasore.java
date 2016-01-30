package harbourn;

public abstract class  Invasore {
	
	protected String id;
	protected String model;
	protected int indexP;

	public Invasore() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getIndexP() {
		return indexP;
	}

	public void setIndexP(int indexP) {
		this.indexP = indexP;
	}
	
	
	public abstract double countIndexP();
}
