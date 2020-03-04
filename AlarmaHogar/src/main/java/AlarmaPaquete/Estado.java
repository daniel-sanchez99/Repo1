package alarmaPaquete;

public abstract class Estado {
	
	private static Apagada apagada=new Apagada();
	private static EsperandoSalida esperando=new EsperandoSalida();
	private static Activada activada=new Activada();
	private static DetectaIntruso detecta=new DetectaIntruso();
	private static NotificaCentralita notifica=new NotificaCentralita();
	
	public static Estado init(AlarmaHogar contexto) {
		apagada.entryAction(contexto);
		return apagada;
	}
	
	public void alarmaOn(AlarmaHogar contexto) {};
	
	public void alarmaOff(AlarmaHogar contexto, String codigo) {};
	
	public void intruso(AlarmaHogar contexto) {};
	
	public void off(AlarmaHogar contexto) {};
	
	public void notificarCentralita(AlarmaHogar contexto) {};
	
	public void desactivarSensores(AlarmaHogar contexto) {};

	public void activarSensores(AlarmaHogar contexto) {};
	
	public void entryAction(AlarmaHogar contexto) {};
	
	public void exitAction(AlarmaHogar contexto) {};
	
	public void doAction(AlarmaHogar contexto) {};

	public static Apagada getApagada() {
		return apagada;
	}

	public static EsperandoSalida getEsperando() {
		return esperando;
	}

	public static Activada getActivada() {
		return activada;
	}

	public static DetectaIntruso getDetecta() {
		return detecta;
	}

	public static NotificaCentralita getNotifica() {
		return notifica;
	};
}
