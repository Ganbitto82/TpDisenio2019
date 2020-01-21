package ar.TpDisenio2019.Ui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;



import javax.swing.JLabel;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscaPoliza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_NroCliente;
	private JTextField textField_Apellido;
	private JTextField textField_TipoDoc;
	private JTextField textField_FechaPago;
	private JTextField textField_NumeroPoliza;
	private JTextField textField_Nombre;
	private JTextField textField_NumDoc;
	private JTextField textField_Monto;


	public BuscaPoliza() {

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
	
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 784, 83);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 784, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 94, 774, 191);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 23, 754, 91);
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"POLIZA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(281, 39, 158, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeroDePoliza = new JLabel("Numero de Poliza");
		lblNumeroDePoliza.setBounds(184, 42, 87, 14);
		panel_2.add(lblNumeroDePoliza);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(643, 145, 89, 23);
		panel_1.add(btnBuscar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 303, 764, 314);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_1 = new JLabel("Numero de Cliente");
		label_1.setBounds(102, 53, 98, 14);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setBounds(145, 119, 46, 14);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("Tipo de Documento");
		label_3.setBounds(102, 184, 107, 14);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Fecha Pago");
		label_4.setBounds(123, 245, 68, 14);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Numero de Poliza");
		label_5.setBounds(462, 53, 86, 14);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("Nombre");
		label_6.setBounds(511, 119, 37, 14);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Numero De Documento");
		label_7.setBounds(440, 184, 125, 14);
		panel_3.add(label_7);
		
		JLabel label_Monto = new JLabel("Monto");
		label_Monto.setBounds(519, 245, 46, 14);
		panel_3.add(label_Monto);
		
		textField_NroCliente = new JTextField();
		textField_NroCliente.setEditable(false);
		textField_NroCliente.setColumns(10);
		textField_NroCliente.setBounds(231, 50, 86, 20);
		panel_3.add(textField_NroCliente);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setEditable(false);
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(231, 116, 86, 20);
		panel_3.add(textField_Apellido);
		
		textField_TipoDoc = new JTextField();
		textField_TipoDoc.setEditable(false);
		textField_TipoDoc.setColumns(10);
		textField_TipoDoc.setBounds(231, 181, 86, 20);
		panel_3.add(textField_TipoDoc);
		
		textField_FechaPago = new JTextField();
		textField_FechaPago.setEditable(false);
		textField_FechaPago.setColumns(10);
		textField_FechaPago.setBounds(231, 242, 86, 20);
		panel_3.add(textField_FechaPago);
		
		textField_NumeroPoliza = new JTextField();
		textField_NumeroPoliza.setEditable(false);
		textField_NumeroPoliza.setColumns(10);
		textField_NumeroPoliza.setBounds(575, 50, 86, 20);
		panel_3.add(textField_NumeroPoliza);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setEditable(false);
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(575, 116, 86, 20);
		panel_3.add(textField_Nombre);
		
		textField_NumDoc = new JTextField();
		textField_NumDoc.setEditable(false);
		textField_NumDoc.setColumns(10);
		textField_NumDoc.setBounds(575, 181, 86, 20);
		panel_3.add(textField_NumDoc);
		
		textField_Monto = new JTextField();
		textField_Monto.setEditable(false);
		textField_Monto.setColumns(10);
		textField_Monto.setBounds(575, 242, 86, 20);
		panel_3.add(textField_Monto);

		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(508, 637, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(652, 637, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	
	
		

		
	}
}
