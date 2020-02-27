package alarmaPaquete;

public class Apagada extends Estado {
	
	@Override
	public Estado alarmaOn(AlarmaHogar contexto) {
		this.exitAction(contexto);
		contexto.getPiloto().parpadeaPiloto();
		
	}
	
	@Override
	public void entryAction(AlarmaHogar contexto) {
		contexto.getPiloto().apagaPiloto();
	}
}
