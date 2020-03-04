package alarmaPaquete;

import java.awt.Color;

import javax.swing.JPanel;

public class AlarmaHogar {
	
	private int intervaloSalida=10;
	private int intervaloDesactivacion=10;
	private String codigoDesactivacion="5555";
	private Estado estado;
	private Piloto piloto;
	
	public AlarmaHogar(JPanel color) {
		this.piloto = new Piloto(color);
		estado=Estado.init(this);
	}
	
	
	public void alarmaOn() {
		estado.alarmaOn(this);
	}
	
	public void alarmaOff(String cod) {
		estado.alarmaOff(this, cod);
	}
	
	public void intruso() {
		estado.intruso(this);
	}
	
	public void off() {
		estado.off(this);
	}
	
	public void notificarCentralita() {
		estado.notificarCentralita(this);
	}
	
	public void desactivarSensores() {
		estado.desactivarSensores(this);
	}

	public void activarSensores() {
		estado.activarSensores(this);
	}

	
	//GETTERS Y SETTERS

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public int getIntervaloSalida() {
		return intervaloSalida;
	}

	public void setIntervaloSalida(int intervaloSalida) {
		this.intervaloSalida = intervaloSalida;
	}

	public int getIntervaloDesactivacion() {
		return intervaloDesactivacion;
	}

	public void setIntervaloDesactivacion(int intervaloDesactivacion) {
		this.intervaloDesactivacion = intervaloDesactivacion;
	}

	public String getCodigoDesactivacion() {
		return codigoDesactivacion;
	}

	public void setCodigoDesactivacion(String codigoDesactivacion) {
		this.codigoDesactivacion = codigoDesactivacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
}
