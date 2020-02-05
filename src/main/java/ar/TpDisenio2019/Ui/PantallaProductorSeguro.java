package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.border.BevelBorder;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOMedidasdeseguridad;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTOVehiculo;
import ar.TpDisenio2019.Utilitario.ImagenProductor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaProductorSeguro extends JFrame{

	private static final long serialVersionUID = 1L;

	public PantallaProductorSeguro() {
		initialize();
	}

	private void initialize() {
		this.setTitle("El Asegurado");
		this.setBounds(50, 0, 800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ImagenProductor imagenProductor = new ImagenProductor();
		imagenProductor.setBounds(-11, 0, 793, 337);
		
				
		JPanel encabezado = new JPanel();
		encabezado.setBounds(0, 0, 784, 87);
		encabezado.setToolTipText("");
		encabezado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		encabezado.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_encabezado = new GroupLayout(encabezado);
		gl_encabezado.setHorizontalGroup(
			gl_encabezado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_encabezado.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(309, Short.MAX_VALUE))
		);
		gl_encabezado.setVerticalGroup(
			gl_encabezado.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_encabezado.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		encabezado.setLayout(gl_encabezado);
		
		JPanel botones = new JPanel();
		botones.setBackground(new Color(255, 0, 51));
		botones.setBounds(10, 98, 185, 302);
		
		JPanel imagenPanel = new JPanel();
		imagenPanel.setBounds(10, 87, 774, 574);
		
		imagenPanel.add(imagenProductor);
		imagenPanel.repaint();	
		
		imagenPanel.setLayout(null);
		
		JButton btnAltaPoliza = new JButton("Dar de Alta Poliza");
		btnAltaPoliza.setForeground(Color.WHITE);
		btnAltaPoliza.setBackground(new Color(255, 0, 51));
		
		btnAltaPoliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAltaPoliza) {

					DTOCliente dtoCliente = null;
					DTOPoliza dtoPoliza= null;
					DTOVehiculo dtoVehiculo = null;
					DTOCuota dtoCuota= null;
					DTOMedidasdeseguridad dtoMedidasSeguridad=null;
					
					darDeAltaPoliza darAltaPoliza = new darDeAltaPoliza(dtoCliente, dtoPoliza, dtoVehiculo, dtoCuota, dtoMedidasSeguridad);
					darAltaPoliza.setVisible(true);
					darAltaPoliza.setResizable(false);
					darAltaPoliza.setLocationRelativeTo(null);
				}
			}
		});
		
		JButton btnConsultarPliza = new JButton("Consultar Poliza");
		btnConsultarPliza.setForeground(Color.WHITE);
		btnConsultarPliza.setBackground(new Color(255, 0, 51));
		
		btnConsultarPliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConsultarPliza) {

							MensajeAdvertencia m = new MensajeAdvertencia();
							m.setVisible(true);
							m.setResizable(false);
							m.setLocationRelativeTo(null);
							
					}
				}

		});
		
		
		JButton btnGenerarPropuestasDe = new JButton();
		btnGenerarPropuestasDe.setText("<html><center>Generar Propuestas</br> de Renovacion</center></html>");
		btnGenerarPropuestasDe.setForeground(Color.WHITE);
		btnGenerarPropuestasDe.setBackground(new Color(255, 0, 51));
		
		btnGenerarPropuestasDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnGenerarPropuestasDe) {

							MensajeAdvertencia m = new MensajeAdvertencia();
							m.setVisible(true);
							m.setResizable(false);
							m.setLocationRelativeTo(null);
							
					}
				}

		});
		
		JButton btnDarDeAlta_1 = new JButton("Dar de Alta Cliente");
		btnDarDeAlta_1.setForeground(Color.WHITE);
		btnDarDeAlta_1.setBackground(new Color(255, 0, 51));
			
		btnDarDeAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnDarDeAlta_1) {

							MensajeAdvertencia m = new MensajeAdvertencia();
							m.setVisible(true);
							m.setResizable(false);
							m.setLocationRelativeTo(null);
							
					}
				}

		});		
		
		JButton btnConsultarCliente = new JButton("Consultar Cliente");
		btnConsultarCliente.setForeground(Color.WHITE);
		btnConsultarCliente.setBackground(new Color(255, 0, 51));
		
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConsultarCliente) {

							MensajeAdvertencia m = new MensajeAdvertencia();
							m.setVisible(true);
							m.setResizable(false);
							m.setLocationRelativeTo(null);
							
					}
				}

		});	
		
		JButton btnActualizarFactoresDe = new JButton();
		btnActualizarFactoresDe.setText("<html><center>Actualizar factores</br> de caracteristicas</center></html>");
		btnActualizarFactoresDe.setForeground(Color.WHITE);
		btnActualizarFactoresDe.setBackground(new Color(255, 0, 51));
		
		btnActualizarFactoresDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnActualizarFactoresDe) {

							MensajeAdvertencia m = new MensajeAdvertencia();
							m.setVisible(true);
							m.setResizable(false);
							m.setLocationRelativeTo(null);
							
					}
				}

		});		
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(encabezado);
		this.getContentPane().add(botones);
		botones.setLayout(new GridLayout(0, 1, 0, 0));
		botones.add(btnAltaPoliza);
		botones.add(btnConsultarPliza);
		botones.add(btnGenerarPropuestasDe);
		botones.add(btnDarDeAlta_1);
		botones.add(btnConsultarCliente);
		botones.add(btnActualizarFactoresDe);
		
		JButton button = new JButton("Salir");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(255, 0, 51));
		botones.add(button);
		this.getContentPane().add(imagenPanel);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {

					setVisible(false);
					dispose();
							
					}
				}

		});	
		
	}

}
