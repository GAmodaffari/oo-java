package main;

public class GestioneSensori implements TemperatureSensorListener {
	
	ValoriTemperature valori;
	GestioneErrore errori;
	
	public void onSuccess(double pressure) {
		valori.add(pressure);
	}
	
	public void onFailed(TemperatureSensorException exception) {
		errori.add(exception.getErrorcode());
	}

	
	public GestioneSensori(ValoriTemperature valori, GestioneErrore errori) {
		this.valori = valori;
		this.errori = errori;
	}
	
	
	public ValoriTemperature getValori() {
		return valori;
	}

	public void setValori(ValoriTemperature valori) {
		this.valori = valori;
	}

	public GestioneErrore getErrori() {
		return errori;
	}

	public void setErrori(GestioneErrore errori) {
		this.errori = errori;
	}

}
