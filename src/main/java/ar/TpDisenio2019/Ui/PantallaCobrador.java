package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.BevelBorder;

import ar.TpDisenio2019.Utilitario.ImagenProductor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaCobrador extends JFrame{

	private static final long serialVersionUID = -4324011734699041113L;

	public PantallaCobrador() {
		initialize();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaCobrador frame = new PantallaCobrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void initialize() {
	
		this.setTitle("El Asegurado");
		this.setBounds(50, 0, 800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagenProductor imagenProductor = new ImagenProductor();
		imagenProductor.setBounds(0, 0, 782, 337);
		
				
		JPanel encabezado = new JPanel();
		encabezado.setBounds(0, 0, 784, 87);
		encabezado.setToolTipText("Cobrador");
		encabezado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		encabezado.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_encabezado = new GroupLayout(encabezado);
		gl_encabezado.setHorizontalGroup(
			gl_encabezado.createParallelGroup(Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE)
				.addGroup(gl_encabezado.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_encabezado.setVerticalGroup(
			gl_encabezado.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_encabezado.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		encabezado.setLayout(gl_encabezado);
		
		JPanel botones = new JPanel();
		botones.setBackground(new Color(255, 0, 51));
		botones.setBounds(10, 105, 185, 87);
		
		JPanel imagenPanel = new JPanel();
		imagenPanel.setBounds(10, 87, 774, 574);
		
		imagenPanel.add(imagenProductor);
		imagenPanel.repaint();
		
		
		imagenPanel.setLayout(null);
		
						
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(encabezado);
		this.getContentPane().add(botones);
		botones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnRegistrarPagoPoliza = new JButton("<html>Registrar pago</br> poliza</html>");
		btnRegistrarPagoPoliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				RealizarPagoPoliza pago = new RealizarPagoPoliza();
				//.setVisible(true);
			}
		});
		btnRegistrarPagoPoliza.setBackground(new Color(255, 0, 51));
		btnRegistrarPagoPoliza.setForeground(new Color(255, 255, 255));
		botones.add(btnRegistrarPagoPoliza);
		
		JButton salir = new JButton();
		botones.add(salir);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == salir) {

					setVisible(false);
					dispose();
							
				}
			}
		});
		salir.setText("<html>Salir</html>");
		salir.setForeground(Color.WHITE);
		salir.setBackground(new Color(255, 0, 51));
		this.getContentPane().add(imagenPanel);
	}
}
