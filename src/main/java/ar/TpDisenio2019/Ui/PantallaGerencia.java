package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

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

public class PantallaGerencia extends JFrame {

	private static final long serialVersionUID = 1L;

	public PantallaGerencia() {
		initialize();
	}

	private void initialize() {

		this.setTitle("El Asegurado");
		this.setBounds(50, 0, 800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		ImagenProductor imagenProductor = new ImagenProductor();
		imagenProductor.setBounds(0, 0, 782, 337);

		JPanel encabezado = new JPanel();
		encabezado.setBounds(0, 0, 784, 87);
		encabezado.setToolTipText("jgj");
		encabezado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		encabezado.setBackground(new Color(255, 0, 51));

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_encabezado = new GroupLayout(encabezado);
		gl_encabezado.setHorizontalGroup(gl_encabezado.createParallelGroup(Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE).addGroup(gl_encabezado.createSequentialGroup().addGap(314)
						.addComponent(label).addContainerGap(296, Short.MAX_VALUE)));
		gl_encabezado.setVerticalGroup(gl_encabezado.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE).addGroup(gl_encabezado.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE).addComponent(label).addGap(25)));
		encabezado.setLayout(gl_encabezado);

		JPanel botones = new JPanel();
		botones.setBackground(new Color(255, 0, 51));
		botones.setBounds(10, 105, 185, 181);

		JPanel imagenPanel = new JPanel();
		imagenPanel.setBounds(10, 87, 774, 574);

		imagenPanel.add(imagenProductor);
		imagenPanel.repaint();

		imagenPanel.setLayout(null);

		JButton btnListadoPropuestas = new JButton();
		btnListadoPropuestas
				.setText("<html><center>Generar listado</br> de propuestas</br> de renovacion</center></html>");
		btnListadoPropuestas.setForeground(Color.WHITE);
		btnListadoPropuestas.setBackground(new Color(255, 0, 51));

		btnListadoPropuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnListadoPropuestas) {

					MensajeAdvertencia m = new MensajeAdvertencia();
					m.setVisible(true);
					m.setResizable(false);
					m.setLocationRelativeTo(null);

				}
			}

		});

		JButton btnInformeResultado = new JButton();
		btnInformeResultado.setText("<html><center>Generar informe</br> de resultado</br> mensual</center></html>");
		btnInformeResultado.setForeground(Color.WHITE);
		btnInformeResultado.setBackground(new Color(255, 0, 51));

		btnInformeResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnInformeResultado) {

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
		botones.add(btnListadoPropuestas);
		botones.add(btnInformeResultado);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(255, 0, 51));
		botones.add(btnSalir);
		this.getContentPane().add(imagenPanel);

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnSalir) {

					setVisible(false);
					dispose();

				}
			}

		});
	}
}
