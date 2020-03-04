package alarmaPaquete;

import java.util.Timer;
import java.util.TimerTask;

public class EsperandoSalida extends Estado {
	
	protected Timer timer;
	protected Tarea tarea;
	
	public class Tarea extends TimerTask{
		
		AlarmaHogar alarma;

		public Tarea(AlarmaHogar contexto) {
			this.alarma=contexto;
		}
		
		public void run() {
			alarma.setEstado(getActivada());
			alarma.getEstado().entryAction(alarma);
		}
	}
	
	public void entryAction(AlarmaHogar contexto) {
		timer=new Timer();
		tarea=new Tarea(contexto);
		timer.schedule(tarea, contexto.getIntervaloSalida()*1000);
	}
	
	public void alarmaOff(AlarmaHogar contexto, String cod) {
		if(cod.equals(contexto.getCodigoDesactivacion())) {
			contexto.setEstado(getApagada());
			contexto.getEstado().entryAction(contexto);
			timer.cancel();
		} else {}
	}

}
