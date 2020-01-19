package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOPoliza;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class buscarCliente1 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField__NroCliente;
	private JTextField textField_Apellido;
	private JTextField textField_TipoDocumento;
	private JTextField textField_Nombre;
	private JTextField textField_NroDocumento;
	private JTextField textField_Calle;
	private JTextField textField_Numero;

	
	public buscarCliente1(DTOCliente dtoCliente, DTOPoliza dtoPoliza) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 794, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(323, Short.MAX_VALUE))
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
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS DEL CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_1 = new JLabel("Nro Cliente:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_2 = new JLabel("Apellido:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_3 = new JLabel("Tipo:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		long nroCliente = dtoCliente.getNroCliente();
		String strCliente =  Long.toString(nroCliente);
		
		textField__NroCliente = new JTextField();
		textField__NroCliente.setEditable(false);
		textField__NroCliente.setColumns(10);
		textField__NroCliente.setText(strCliente);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Apellido.setEditable(false);
		textField_Apellido.setColumns(10);
		textField_Apellido.setText(dtoCliente.getApellido());
		
		textField_TipoDocumento = new JTextField();
		textField_TipoDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_TipoDocumento.setEditable(false);
		textField_TipoDocumento.setColumns(10);
		textField_TipoDocumento.setText(dtoCliente.getTipodedocumento().getNombre());
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_5 = new JLabel("Nro Documento:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Nombre.setEditable(false);
		textField_Nombre.setColumns(10);
		textField_Nombre.setText(dtoCliente.getNombre());
		
		
				
		int nroDocumento=dtoCliente.getNroDocumento();
		String strnNroDocumento =Integer.toString(nroDocumento);
		textField_NroDocumento = new JTextField();
		textField_NroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_NroDocumento.setEditable(false);
		textField_NroDocumento.setColumns(10);
		textField_NroDocumento.setText( strnNroDocumento );
		
		JLabel lblDomicilio = new JLabel("DOMICILIO");
		lblDomicilio.setForeground(Color.BLACK);
		lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_7 = new JLabel("Calle:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_8 = new JLabel("Numero:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Calle = new JTextField();
		textField_Calle.setEditable(false);
		textField_Calle.setColumns(10);
		textField_Calle.setText(dtoCliente.getDireccion().getCalle());	
		
		int numeroDireccion=dtoCliente.getDireccion().getNumero();
		String strnNumeroDireccion =Integer.toString( numeroDireccion);
		textField_Numero = new JTextField();
		textField_Numero.setEditable(false);
		textField_Numero.setColumns(10);
		textField_Numero.setText(strnNumeroDireccion);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(99)
							.addComponent(textField_Calle, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(textField_Numero, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(69)
							.addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(103)
							.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblDomicilio, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDomicilio)
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_7))
						.addComponent(textField_Calle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8))
						.addComponent(textField_Numero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton button_Aceptar = new JButton("Aceptar");

		button_Aceptar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
              if(e.getSource()==button_Aceptar) {
				
            	dispose();
            /*	DTOVehiculo dtoVehiculo = null;
            	DTOMedidasdeseguridad dtoMedidasSeguridad = null;
            	DTOCuota dtoCuota = null;*/
            	darDeAltaPoliza d = new darDeAltaPoliza(dtoCliente);
				d.setVisible(true);
				d.setResizable(false);
				d.setLocationRelativeTo(null);
              }
			}
		});

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(button_Aceptar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 743, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_Aceptar)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
