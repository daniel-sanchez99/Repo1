package alarmaPaquete;

public class NotificaCentralita extends Estado {

	public void entryAction(AlarmaHogar contexto) {
		contexto.notificarCentralita();
		contexto.getPiloto().enciendePiloto();
	}
	
	public void off(AlarmaHogar contexto) {
		contexto.setEstado(getApagada());
		contexto.getEstado().entryAction(contexto);
	}
	
}
