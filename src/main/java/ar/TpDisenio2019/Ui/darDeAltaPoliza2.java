package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class darDeAltaPoliza2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public darDeAltaPoliza2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 82, 564, 218);
		panel_1.setBorder(new TitledBorder(null, "EL CLIENTE INGRESADO NO EXISTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblDarDeAlta = new JLabel("Dar de Alta Cliente:");
		
		JButton btnAceptar = new JButton("Alta de Cliente");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(125)
					.addComponent(lblDarDeAlta)
					.addGap(18)
					.addComponent(btnAceptar)
					.addContainerGap(217, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(95, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDarDeAlta)
						.addComponent(btnAceptar))
					.addGap(93))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("jgj");
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 584, 71);
		contentPane.add(panel);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(202)
					.addComponent(label)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
	}

}
