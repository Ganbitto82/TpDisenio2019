package ar.TpDisenio2019.Ui.DardeAltaPoliza;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.Controladores.PantallaBuscarCliente;





public class darDeAltaPoliza extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;


	/**
	 * Create the frame.
	 */
	public darDeAltaPoliza() {
		setTitle("Dar de alta P\u00F3liza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 283, 771, 416);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 94, 771, 63);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un Cliente");
		lblSeleccioneUnCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new PantallaBuscarCliente();
				
			}
		});

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblSeleccioneUnCliente, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBuscarCliente, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(480, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscarCliente)
						.addComponent(lblSeleccioneUnCliente))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(5, 163, 771, 114);
		panel_5.setBorder(new TitledBorder(null, "DATOS DEL CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNroCliente = new JLabel("Nro DTOCliente");
		lblNroCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		JLabel lblNobre = new JLabel("Nombre");
		lblNobre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		
		JLabel lblNroDocumento = new JLabel("Nro Documento");
		lblNroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		
		JLabel lblProvincia = new JLabel("DTOProvincia");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("DTOLocalidad");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblProvincia)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblTipo)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblNroCliente)
							.addGap(18)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblLocalidad)
								.addComponent(lblNroDocumento)
								.addComponent(lblApellido))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(56)
									.addComponent(lblNobre)
									.addGap(18)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(93)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(42))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNroCliente)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido)
						.addComponent(lblNobre)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNroDocumento))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblProvincia)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLocalidad)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "INGRESO DE DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{41, 81, 112, 44, 92, 118, 43, 0, 112, 33, 0};
		gbl_panel_3.rowHeights = new int[]{32, 32, 24, 32, 32, 32, 26, 78, 32, 32, 26, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblDomicilioDeRiesgo = new JLabel("DOMICILIO DE RIESGO");
		lblDomicilioDeRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblDomicilioDeRiesgo = new GridBagConstraints();
		gbc_lblDomicilioDeRiesgo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDomicilioDeRiesgo.gridwidth = 2;
		gbc_lblDomicilioDeRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDomicilioDeRiesgo.gridx = 1;
		gbc_lblDomicilioDeRiesgo.gridy = 0;
		panel_3.add(lblDomicilioDeRiesgo, gbc_lblDomicilioDeRiesgo);
		
		JLabel label_2 = new JLabel("DTOProvincia(*)");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 1;
		panel_3.add(label_2, gbc_label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.addItem("");
		comboBox.addItem("Santa Fe");
		comboBox.addItem("Cordoba");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 1;
		panel_3.add(comboBox, gbc_comboBox);
		
		JLabel label_3 = new JLabel("DTOLocalidad(*)");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 4;
		gbc_label_3.gridy = 1;
		panel_3.add(label_3, gbc_label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_1.addItem("");
		comboBox_1.addItem("Santo Tome");
		comboBox_1.addItem("Rosario");
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 5;
		gbc_comboBox_1.gridy = 1;
		panel_3.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblDatosDelVehculo = new JLabel("DATOS DEL VEH\u00CDCULO");
		lblDatosDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblDatosDelVehculo = new GridBagConstraints();
		gbc_lblDatosDelVehculo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDatosDelVehculo.gridwidth = 2;
		gbc_lblDatosDelVehculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosDelVehculo.gridx = 1;
		gbc_lblDatosDelVehculo.gridy = 2;
		panel_3.add(lblDatosDelVehculo, gbc_lblDatosDelVehculo);
		
		JLabel lblMarca = new JLabel("DTOMarca(*)");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.WEST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 1;
		gbc_lblMarca.gridy = 3;
		panel_3.add(lblMarca, gbc_lblMarca);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_2.addItem("");
		comboBox_2.addItem("Aston Martin");
		comboBox_2.addItem("Audi");
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 3;
		panel_3.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblModelo = new JLabel("DTOModelo(*)");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.WEST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 4;
		gbc_lblModelo.gridy = 3;
		panel_3.add(lblModelo, gbc_lblModelo);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.addItem("");
		comboBox_3.addItem("2019");
		comboBox_3.addItem("2009");
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 5;
		gbc_comboBox_3.gridy = 3;
		panel_3.add(comboBox_3, gbc_comboBox_3);
		
		JLabel label_7 = new JLabel("A\u00F1o del Veh\u00EDculo(*)");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 7;
		gbc_label_7.gridy = 3;
		panel_3.add(label_7, gbc_label_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setForeground(Color.BLACK);
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_4.addItem("");
		comboBox_4.addItem("2019");
		comboBox_4.addItem("2009");
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.gridx = 8;
		gbc_comboBox_4.gridy = 3;
		panel_3.add(comboBox_4, gbc_comboBox_4);
		
		JLabel label_9 = new JLabel("Motor(*)");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 4;
		panel_3.add(label_9, gbc_label_9);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 4;
		panel_3.add(textField_1, gbc_textField_1);
		
		JLabel label_8 = new JLabel("Km por A\u00F1o(*)");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 4;
		gbc_label_8.gridy = 4;
		panel_3.add(label_8, gbc_label_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		panel_3.add(textField, gbc_textField);
		
		JLabel label_10 = new JLabel("Chasis(*)");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 7;
		gbc_label_10.gridy = 4;
		panel_3.add(label_10, gbc_label_10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 8;
		gbc_textField_2.gridy = 4;
		panel_3.add(textField_2, gbc_textField_2);
		
		JLabel label_11 = new JLabel("Patente:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 5;
		panel_3.add(label_11, gbc_label_11);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		panel_3.add(textField_3, gbc_textField_3);
		
		JLabel label_12 = new JLabel("Suma Asegurada:");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.WEST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 4;
		gbc_label_12.gridy = 5;
		panel_3.add(label_12, gbc_label_12);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 5;
		panel_3.add(textField_4, gbc_textField_4);
		
		JLabel lblMedidasDeSeguridad = new JLabel("MEDIDAS DE SEGURIDAD");
		lblMedidasDeSeguridad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMedidasDeSeguridad = new GridBagConstraints();
		gbc_lblMedidasDeSeguridad.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMedidasDeSeguridad.gridwidth = 2;
		gbc_lblMedidasDeSeguridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedidasDeSeguridad.gridx = 1;
		gbc_lblMedidasDeSeguridad.gridy = 6;
		panel_3.add(lblMedidasDeSeguridad, gbc_lblMedidasDeSeguridad);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridwidth = 6;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 7;
		panel_3.add(panel_4, gbc_panel_4);
		
		JCheckBox checkBox = new JCheckBox("\u00BFSe guarda en garage?");
		checkBox.setForeground(Color.BLACK);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox.setBackground(Color.WHITE);
		
		JCheckBox checkBox_1 = new JCheckBox("\u00BFTiene alarma?");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_1.setBackground(Color.WHITE);
		
		JCheckBox checkBox_2 = new JCheckBox("\u00BFPosee tuercas antirrobo en las cuatro ruedas?");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_2.setBackground(Color.WHITE);
		
		JCheckBox checkBox_3 = new JCheckBox("\u00BFPosee dispositivo de rastreo vehicular?");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_3.setBackground(Color.WHITE);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox)
						.addComponent(checkBox_1))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox_2)
						.addComponent(checkBox_3))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(checkBox)
						.addComponent(checkBox_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkBox_2)
						.addComponent(checkBox_1))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_14 = new JLabel("Nro de Siniestros(*)");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.gridwidth = 2;
		gbc_label_14.anchor = GridBagConstraints.WEST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 1;
		gbc_label_14.gridy = 8;
		panel_3.add(label_14, gbc_label_14);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setForeground(Color.BLACK);
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_5.addItem("");
		comboBox_5.addItem("Niguno");
		comboBox_5.addItem("Uno");
		comboBox_5.addItem("Dos");
		comboBox_5.addItem("M�s de dos");
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.gridx = 5;
		gbc_comboBox_5.gridy = 8;
		panel_3.add(comboBox_5, gbc_comboBox_5);
		
		JLabel label_15 = new JLabel("Cantidad de Hijos entre 18 y 30 a\u00F1os:");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.WEST;
		gbc_label_15.gridwidth = 3;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 1;
		gbc_label_15.gridy = 9;
		panel_3.add(label_15, gbc_label_15);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 9;
		panel_3.add(textField_5, gbc_textField_5);
		
		JButton button = new JButton("Completar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nro = textField_5.getText();
				int numero = Integer.valueOf(nro);
				
				if(numero >= 18 && numero <= 30)
				{
					if(e.getSource() == button)
					{
						darDeAltaPoliza22 b = new darDeAltaPoliza22();
						b.setVisible(true);
						b.setResizable(false);
						b.setLocationRelativeTo(null);
					}
				}
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 5;
		gbc_button.gridy = 9;
		panel_3.add(button, gbc_button);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		JLabel label_16 = new JLabel("(*) Campos Obligatorios.");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.gridwidth = 2;
		gbc_label_16.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 10;
		panel_3.add(label_16, gbc_label_16);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button_1)
				{
				String kmxAnio = textField.getText();
				String motor = textField_1.getText();
				String chasis = textField_2.getText();
				String provincia = comboBox.getSelectedItem().toString();
				String localidad = comboBox_1.getSelectedItem().toString();
				String marca = comboBox_2.getSelectedItem().toString();
				String modelo = comboBox_3.getSelectedItem().toString();
				String anio = comboBox_4.getSelectedItem().toString();
				String nroSiniestro = comboBox_5.getSelectedItem().toString();
				
				if(kmxAnio.equals("") || motor.equals("") || chasis.equals("") || provincia.equals("") || localidad.equals("") || marca.equals("") || modelo.equals("") || anio.equals("") || nroSiniestro.equals("") )
				{
					if(kmxAnio.equals(""))
					{
						label_8.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_8.setForeground(Color.black);
					}
					if(motor.equals(""))
					{
						label_9.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_9.setForeground(Color.black);
					}
					if(chasis.equals(""))
					{
						label_10.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_10.setForeground(Color.black);
					}
					if(provincia.equals(""))
					{
						label_2.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_2.setForeground(Color.black);
					}
					if(localidad.equals(""))
					{
						label_3.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_3.setForeground(Color.black);
					}
					if(marca.equals(""))
					{
						lblMarca.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						lblMarca.setForeground(Color.black);
					}
					if(modelo.equals(""))
					{
						lblModelo.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						lblModelo.setForeground(Color.black);
					}
					if(anio.equals(""))
					{
						label_7.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_7.setForeground(Color.black);
					}
					if(nroSiniestro.equals(""))
					{
						label_14.setForeground(Color.red);
						label_16.setForeground(Color.red);
					}
					else 
					{
						label_14.setForeground(Color.black);
					}
				}
				else 
				{
					label_16.setForeground(Color.black);
					darDeAltaPoliza1 b = new darDeAltaPoliza1();
					b.setVisible(true);
					b.setResizable(false);
					b.setLocationRelativeTo(null);
				}
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 10;
		panel_3.add(button_1, gbc_button_1);
		
		JButton button_3 = new JButton("Cancelar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button_3)
				{
					hide();
				}
			}
		});
		contentPane.setLayout(null);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.NORTH;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.gridx = 8;
		gbc_button_3.gridy = 10;
		panel_3.add(button_3, gbc_button_3);
		panel_2.setLayout(gl_panel_2);
		contentPane.add(panel_2);
		contentPane.add(panel_5);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("jgj");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 784, 83);
		contentPane.add(panel);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
	}
}
