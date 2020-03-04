package alarmaPaquete;

import java.util.Timer;
import java.util.TimerTask;

public class DetectaIntruso extends Estado {
	
	protected Timer timer;
	protected Tarea tarea;
	private int intentos=3;
	
	public class Tarea extends TimerTask{
		
		AlarmaHogar alarma;

		public Tarea(AlarmaHogar contexto) {
			this.alarma=contexto;
		}
		
		public void run() {
			alarma.setEstado(getNotifica());
			alarma.getEstado().entryAction(alarma);
		}
	}
	
	public void entryAction(AlarmaHogar contexto) {
		contexto.getPiloto().parpadeaPiloto();
		timer=new Timer();
		tarea=new Tarea(contexto);
		timer.schedule(tarea, contexto.getIntervaloDesactivacion()*1000);
	}
	
	public void alarmaOff(AlarmaHogar contexto, String cod) {
		if(cod.equals(contexto.getCodigoDesactivacion()) && intentos>0) {
			contexto.setEstado(getApagada());
			contexto.getEstado().entryAction(contexto);
			timer.cancel();
		} else {
			intentos--;
		}
	}

}
