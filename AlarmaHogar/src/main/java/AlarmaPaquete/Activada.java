package alarmaPaquete;

public class Activada extends Estado {
	
	public void entryAction(AlarmaHogar contexto) {
		contexto.getPiloto().enciendePiloto();
		activarSensores(contexto);
	}
	
	public void intruso(AlarmaHogar contexto) {
		contexto.setEstado(getDetecta());
		contexto.getEstado().entryAction(contexto);
	}
	
}
