package interfazAlarma;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import alarmaPaquete.AlarmaHogar;
import javax.swing.JLabel;
import java.awt.Font;


public class InterfazAlarma {

	private JFrame frame;
	AlarmaHogar alarma;
	Simulador sim;
	String codigoIntrod="";
	JPanel pilotoColor;

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
		
		pilotoColor=new JPanel();
		pilotoColor.setBounds(303, 70, 64, 21);
		pilotoColor.setBackground(Color.red);
		frame.getContentPane().add(pilotoColor);
		
		alarma = new AlarmaHogar(pilotoColor);
		
		sim = new Simulador(alarma);
		sim.getFrame().setVisible(true);
		
		JPanel verde = new JPanel();
		verde.setBounds(303, 70, 64, 21);
		verde.setBackground(Color.green);
		frame.getContentPane().add(verde);

		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(90, 34, 144, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button_1 = new JButton("1");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="1";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_1.setBounds(61, 82, 51, 37);
		frame.getContentPane().add(button_1);
		
		JButton button_4 = new JButton("4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="4";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_4.setBounds(61, 130, 51, 37);
		frame.getContentPane().add(button_4);
		
		JButton button_7 = new JButton("7");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="7";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_7.setBounds(61, 178, 51, 37);
		frame.getContentPane().add(button_7);
		
		JButton button_2 = new JButton("2");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="2";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_2.setBounds(122, 82, 51, 37);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("5");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="5";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_5.setBounds(122, 130, 51, 37);
		frame.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("8");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="8";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_8.setBounds(122, 178, 51, 37);
		frame.getContentPane().add(button_8);
		
		JButton button_3 = new JButton("3");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="3";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_3.setBounds(183, 82, 51, 37);
		frame.getContentPane().add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="6";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_6.setBounds(183, 130, 51, 37);
		frame.getContentPane().add(button_6);
		
		JButton button_9 = new JButton("9");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				codigoIntrod+="9";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		button_9.setBounds(183, 178, 51, 37);
		frame.getContentPane().add(button_9);
		
		JButton btnAlarmaOn = new JButton("Alarma On");
		btnAlarmaOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				alarma.alarmaOn();
				codigoIntrod="";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		btnAlarmaOn.setBounds(279, 137, 114, 28);
		frame.getContentPane().add(btnAlarmaOn);
		
		JButton btnAlarmaOff = new JButton("Alarma Off");
		btnAlarmaOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				alarma.alarmaOff(codigoIntrod);
				codigoIntrod="";
				lblNewLabel.setText(codigoIntrod);
			}
		});
		btnAlarmaOff.setBounds(279, 182, 114, 28);
		frame.getContentPane().add(btnAlarmaOff);
		
	}
}
