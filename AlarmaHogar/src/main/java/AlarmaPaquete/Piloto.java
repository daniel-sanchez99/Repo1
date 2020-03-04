package alarmaPaquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Piloto {
	
	public enum EstadoPiloto{ENCENDIDO, APAGADO, PARPADEANDO}
	
	JPanel color;
	Timer timer;
	
	private EstadoPiloto estadoPiloto=null;
	
	public Piloto(JPanel color) {
		this.color=color;
		timer=new Timer(500, new Tarea(color));
	}
	
	public EstadoPiloto getEstadoPiloto() {
		return estadoPiloto;
	}

	public void enciendePiloto() {
		estadoPiloto=EstadoPiloto.ENCENDIDO;
		timer.stop();
		color.setVisible(true);
		
	}
	
	public void apagaPiloto() {
		estadoPiloto=EstadoPiloto.APAGADO;
		timer.stop();
		color.setVisible(false);
	}
	
	public void parpadeaPiloto() {
		estadoPiloto=EstadoPiloto.PARPADEANDO;
		timer.start();	
	}

	
	public class Tarea implements ActionListener {
		
		private JPanel color;
		
		public Tarea(JPanel color) {
			this.color=color;
		}

		public void actionPerformed(ActionEvent e) {
			
			if(color.isVisible()) {
				color.setVisible(false);
			}else {
				color.setVisible(true);
			}
			
		}
	}
	

}
