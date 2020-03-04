package alarmaPaquete;

public class Apagada extends Estado {
	
	public void alarmaOn(AlarmaHogar contexto) {
		contexto.getPiloto().parpadeaPiloto();
		contexto.setEstado(getEsperando());
		contexto.getEstado().entryAction(contexto);
	}
	
	public void entryAction(AlarmaHogar contexto) {
		desactivarSensores(contexto);
		contexto.getPiloto().apagaPiloto();
	}
}
