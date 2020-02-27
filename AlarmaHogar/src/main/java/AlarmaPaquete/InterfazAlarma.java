package alarmaPaquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazAlarma {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAlarma window = new InterfazAlarma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazAlarma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(61, 82, 51, 37);
		frame.getContentPane().add(button_1);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(61, 130, 51, 37);
		frame.getContentPane().add(button_4);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(61, 178, 51, 37);
		frame.getContentPane().add(button_7);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(122, 82, 51, 37);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(122, 130, 51, 37);
		frame.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(122, 178, 51, 37);
		frame.getContentPane().add(button_8);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(183, 82, 51, 37);
		frame.getContentPane().add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(183, 130, 51, 37);
		frame.getContentPane().add(button_6);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(183, 178, 51, 37);
		frame.getContentPane().add(button_9);
		
		JButton btnAlarmaOn = new JButton("Alarma On");
		btnAlarmaOn.setBounds(279, 137, 114, 28);
		frame.getContentPane().add(btnAlarmaOn);
		
		JButton btnAlarmaOff = new JButton("Alarma Off");
		btnAlarmaOff.setBounds(279, 185, 114, 28);
		frame.getContentPane().add(btnAlarmaOff);
		
	}
}
