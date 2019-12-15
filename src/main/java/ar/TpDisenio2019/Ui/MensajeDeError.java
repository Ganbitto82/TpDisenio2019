package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MensajeDeError extends JFrame {

	private static final long serialVersionUID = 0001L;
	private final JLabel lblNewLabel = new JLabel("Error!!!");
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MensajeDeError frame = new MensajeDeError();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MensajeDeError() {
		
		setTitle("Advertencia");
		setBounds(100, 100, 420, 230);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBounds(161, 134, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				setVisible(false);
				dispose();
			}
		});
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(136, 56, 174, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(68, 41, 42, 59);
		lblNewLabel_1.setIcon(new ImageIcon(MensajeDeError.class.getResource("/Utilitario/Imagenes/iconoError.png")));
		getContentPane().add(lblNewLabel_1);


		setVisible(true);
		setLocationRelativeTo(null);
		
	}
}