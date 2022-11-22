package br.com.fiap.scjr.rabbitProducer.form;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class DroneForm {

	@NonNull @Getter @Setter
    private int idDrone;
	@NonNull @Getter @Setter
    private int latitude;
	@NonNull @Getter @Setter
    private int longitude;
	@NonNull @Getter @Setter
    private int temperatura;
	@NonNull @Getter @Setter
    private int umidade;
	@NonNull @Getter @Setter
    private boolean rastreamento;
	public int getIdDrone() {
		return idDrone;
	}
	public void setIdDrone(int idDrone) {
		this.idDrone = idDrone;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getUmidade() {
		return umidade;
	}
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}
	public boolean isRastreamento() {
		return rastreamento;
	}
	public void setRastreamento(boolean rastreamento) {
		this.rastreamento = rastreamento;
	}
    
}
