package alarmaPaquete;

public abstract class Estado {
	
	private static Apagada apagada=new Apagada();
	private static EsperandoSalida esperando=new EsperandoSalida();
	private static Activada activada=new Activada();
	private static DetectaIntruso detecta=new DetectaIntruso();
	private static NotificaCentralita notifica=new NotificaCentralita();
	
	public static AlarmaHogar init(AlarmaHogar contexto) {
		apagada.entryAction(contexto);
		return contexto;
	}
	
	public Estado alarmaOn(AlarmaHogar contexto) {
		return esperando;
	}
	
	public Estado alarmaOff(AlarmaHogar contexto) {
		return apagada;
	}
	
	public Estado intruso(AlarmaHogar contexto) {
		return detecta;
	}
	
	public Estado off(AlarmaHogar contexto) {
		return apagada;
	}
	
	public void entryAction(AlarmaHogar contexto) {
		
	}
	
	public void exitAction(AlarmaHogar contexto) {
		
	}
	
	public void doAction(AlarmaHogar contexto) {
		
	}
}
