package alarmaPaquete;

public class AlarmaHogar {
	
	private int intervaloSalida=10;
	private int intervaloDesactivacion=10;
	private String codigoDesactivacion="1234";
	private Estado estado;
	private Piloto piloto = new Piloto();
	
	public void setState(Estado state) {
		this.estado=state;
	}
	
	public void notificarCentralita() {
		
	}
	
	public void desactivarSensores() {
		
	}

	public void activarSensores() {
	
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
}
