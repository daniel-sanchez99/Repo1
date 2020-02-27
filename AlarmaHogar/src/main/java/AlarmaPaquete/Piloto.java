package alarmaPaquete;

public class Piloto {
	
	public enum EstadoPiloto{ENCENDIDO, APAGADO, PARPADEANDO}
	
	private EstadoPiloto estadoPiloto=null;
	
	public void enciendePiloto() {
		estadoPiloto=EstadoPiloto.ENCENDIDO;
	}
	
	public void apagaPiloto() {
		estadoPiloto=EstadoPiloto.APAGADO;
	}
	
	public void parpadeaPiloto() {
		estadoPiloto=EstadoPiloto.PARPADEANDO;
	}

}
