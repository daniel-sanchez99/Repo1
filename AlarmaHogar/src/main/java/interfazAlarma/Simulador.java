package interfazAlarma;

import javax.swing.JFrame;

import alarmaPaquete.AlarmaHogar;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Simulador {

	private JFrame frame;
	private AlarmaHogar alarm;

	/**
	 * Create the application.
	 */
	public Simulador(AlarmaHogar alarma) {
		this.alarm=alarma;
		initialize();
	}
	
	public JFrame getFrame(){
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 371, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Intruso");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				alarm.intruso();
			}
		});
		btnNewButton.setBounds(91, 31, 171, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Off");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				alarm.off();
			}
		});
		button.setBounds(91, 103, 171, 61);
		frame.getContentPane().add(button);
	}
}
