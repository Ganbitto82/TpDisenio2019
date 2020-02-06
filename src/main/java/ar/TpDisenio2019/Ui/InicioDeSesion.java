package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;

import ar.TpDisenio2019.Controladores.GestorOperador;
//import ar.TpDisenio2019.Controladores.GestorOperador;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.Modelo.Operador;
import ar.TpDisenio2019.Utilitario.KeyAdapterModificado;
import ar.TpDisenio2019.Utilitario.Validaciones;

public class InicioDeSesion extends JFrame {
	
	private DTOOperador dtoOperador = new DTOOperador();
	private static final long serialVersionUID = 0001L;
	private JTextField usuario_textField;
	private JPasswordField contrasenia_textField;
	                   
    
	public InicioDeSesion() {
		setTitle("Iniciar Sesi\u00F3n");
		setBounds(100, 100, 500, 380);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 107, 464, 145);
		getContentPane().add(panel);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));

		usuario_textField = new JTextField();
		usuario_textField.setColumns(10);
		
		//**********nombreUsuario
		
		usuario_textField.addFocusListener(new FocusAdapter()
		{
			public void focusLost(FocusEvent arg0)
			{
				String nombres = usuario_textField.getText();
				
				if(nombres.length() > 0)
				{				
					if(Validaciones.validarApellidoONombre(nombres) == false)
					{
						//labelAclaracionSobreNombres.setVisible(true);
					}
				}
			}
			
			public void focusGained(FocusEvent arg0)
			{
				//labelAclaracionSobreNombres.setVisible(false);
			}
		});
		
		usuario_textField.addKeyListener(new KeyAdapterModificado());
		
		usuario_textField.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent arg0)
			{
				String texto = usuario_textField.getText();
				usuario_textField.setText(texto.toUpperCase());
			}
			
		});

		JComboBox<String> Persona_comboBox = new JComboBox<String>();
		Persona_comboBox.setBackground(Color.WHITE);
		Persona_comboBox.setForeground(Color.BLACK);
		Persona_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Persona_comboBox.addItem(" --Seleccione-- ");
		Persona_comboBox.addItem("Productor de seguro");
		Persona_comboBox.addItem("Cobrador");
		Persona_comboBox.addItem("Gerencia");

		contrasenia_textField = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup().addGap(46).addGroup(gl_panel
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 55,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
						  		.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 70,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED))))
						.addGroup(Alignment.TRAILING,
								gl_panel.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblCargo).addGap(22)))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(contrasenia_textField, GroupLayout.PREFERRED_SIZE, 228,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(usuario_textField, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
						.addComponent(Persona_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(110, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(usuario_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsuario))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(contrasenia_textField, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblContrasea))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCargo).addComponent(
								Persona_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addContainerGap(36, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JPanel encabezado = new JPanel();
		encabezado.setBackground(new Color(255, 0, 51));
		encabezado.setBounds(0, 0, 484, 96);
		getContentPane().add(encabezado);

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));

		GroupLayout gl_encabezado = new GroupLayout(encabezado);
		gl_encabezado.setHorizontalGroup(gl_encabezado.createParallelGroup(Alignment.LEADING).addGroup(gl_encabezado
				.createSequentialGroup().addGap(164).addComponent(label).addContainerGap(163, Short.MAX_VALUE)));
		gl_encabezado.setVerticalGroup(gl_encabezado.createParallelGroup(Alignment.LEADING).addGroup(gl_encabezado
				.createSequentialGroup().addGap(33).addComponent(label).addContainerGap(38, Short.MAX_VALUE)));
		encabezado.setLayout(gl_encabezado);

		JPanel seccionBotones = new JPanel();
		seccionBotones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		seccionBotones.setBounds(10, 258, 464, 72);
		getContentPane().add(seccionBotones);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnIngresar) {
					String cargo = Persona_comboBox.getSelectedItem().toString();
					String usuario = usuario_textField.getText();
					@SuppressWarnings("deprecation")
					String contrasenia = contrasenia_textField.getText();
					
					if (cargo.equals("") || usuario.equals("") || contrasenia.equals("")) {
						if (cargo.equals(" --Seleccione-- ")) {
							lblCargo.setForeground(Color.red);
						} else {
							lblCargo.setForeground(Color.black);
						}
						if (usuario.equals("")) {
							lblUsuario.setForeground(Color.red);
						} else {
							lblUsuario.setForeground(Color.black);
						}
						if (contrasenia.equals("")) {
							lblContrasea.setForeground(Color.red);
						} else {
							lblContrasea.setForeground(Color.black);
						}
					}
					 else {
						 
						 Operador operador = new Operador();						 
						 operador.setNombre(usuario);
						 
						 GestorOperador.guardarOperador(operador);
						 DTOOperador dtoOperardoBusca= GestorOperador.buscarPorNombreOperador(operador.getNombre());
						 
						 dtoOperador.setIdOperador(dtoOperardoBusca.getIdOperador());
						 dtoOperador.setCargo(cargo);
						 dtoOperador.setcontrasenia(contrasenia);
						 dtoOperador.setNombre(usuario);
						 
						switch (cargo) {
						case "Productor de seguro": {

							PantallaProductorSeguro productor = new PantallaProductorSeguro();
							productor.setVisible(true);
							productor.setResizable(false);
							productor.setLocationRelativeTo(null);
							break;
						}
						case "Cobrador": {
							PantallaCobrador c = new PantallaCobrador(dtoOperador);
							c.setVisible(true);
							c.setResizable(false);
							c.setLocationRelativeTo(null);
							break;
						}
						case "Gerencia": {
							PantallaGerencia g = new PantallaGerencia();
							g.setVisible(true);
							g.setResizable(false);
							g.setLocationRelativeTo(null);
							break;
						}
						}

					}
				}

			}
		});

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();

			}
		});

		setVisible(true);
		setLocationRelativeTo(null);
	
		GroupLayout gl_seccionBotones = new GroupLayout(seccionBotones);
		gl_seccionBotones.setHorizontalGroup(gl_seccionBotones.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_seccionBotones.createSequentialGroup().addContainerGap(265, Short.MAX_VALUE)
						.addComponent(btnIngresar).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnCerrar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(23)));
		gl_seccionBotones
				.setVerticalGroup(
						gl_seccionBotones.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_seccionBotones.createSequentialGroup().addContainerGap(28, Short.MAX_VALUE)
										.addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 23,
												GroupLayout.PREFERRED_SIZE)
										.addGap(21))
								.addGroup(Alignment.LEADING, gl_seccionBotones.createSequentialGroup().addGap(24)
										.addComponent(btnCerrar).addContainerGap(21, Short.MAX_VALUE)));
		seccionBotones.setLayout(gl_seccionBotones);
	}
}
