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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.Controladores.PantallaAgregarHijos;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;


public class darDeAltaPoliza extends JFrame {

	private static final long serialVersionUID = 4830170090194723214L;
	private JPanel contentPane;
	private JTextField textField_KmPorAnio;
	private JTextField textField_Motor;
	private JTextField textField_Chasis;
	private JTextField textField_Patente;
	private JTextField textField_SumaAsegurada;
	private JTextField textField_CantHijos;
	private JTextField textField__NroCliente;
	private JTextField textField_Apellido;
	private JTextField textField_Nombre;
	private JTextField textField_TipoDocumento;
	private JTextField textField_NroDocumento;
	private JTextField textField_Provincia;
	private JTextField textField_Localidad;

	private JPanel pnl_BuscarCliente;
	private JPanel pnl_DatosDelCliente;
	private JPanel pnl_IngresoDatosGeneral;
	private JPanel pnl_IngresoDeDatos;
	
	private List<DTOProvincia> dtoListaProvincia = new ArrayList();
//	private List<DTOLocalidad> dtoListaLocalidad = new ArrayList();
	private List<DTOSiniestro> dtoListaSiniestros = new ArrayList();

	private List<DTODatosdehijo> listaDTOHijos = new ArrayList<DTODatosdehijo>();

	public darDeAltaPoliza(DTOCliente dtoCliente) {
		setTitle("Dar de alta P\u00F3liza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		pnl_IngresoDatosGeneral = new JPanel();
		pnl_IngresoDatosGeneral.setBounds(5, 283, 771, 416);
		
		/*SECTOR BUSCAR CLIENTE*/
		pnl_BuscarCliente = new JPanel();
		pnl_BuscarCliente.setBounds(5, 94, 771, 63);
		pnl_BuscarCliente.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un Cliente");
		lblSeleccioneUnCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == btnBuscarCliente) {
					
					dispose();
					buscarCliente m = new buscarCliente();
					m.setVisible(true);
					m.setResizable(false);
					m.setLocationRelativeTo(null);
									
				}
			}
			
		});
		
		
		GroupLayout gl_pnl_BuscarCliente = new GroupLayout(pnl_BuscarCliente);
		gl_pnl_BuscarCliente.setHorizontalGroup(
			gl_pnl_BuscarCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_BuscarCliente.createSequentialGroup()
					.addGap(23)
					.addComponent(lblSeleccioneUnCliente, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBuscarCliente, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(480, Short.MAX_VALUE))
		);
		gl_pnl_BuscarCliente.setVerticalGroup(
			gl_pnl_BuscarCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_BuscarCliente.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_pnl_BuscarCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscarCliente)
						.addComponent(lblSeleccioneUnCliente))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		pnl_BuscarCliente.setLayout(gl_pnl_BuscarCliente);
		
		/*Datos del DTOCliente*/
		pnl_DatosDelCliente = new JPanel();
		pnl_DatosDelCliente.setBounds(5, 163, 771, 114);
		pnl_DatosDelCliente.setBorder(new TitledBorder(null, "DATOS DEL CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNroCliente = new JLabel("Nro Cliente");
		lblNroCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField__NroCliente = new JTextField();
		textField__NroCliente.setEditable(false);
		textField__NroCliente.setColumns(10);		
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Apellido = new JTextField();
		textField_Apellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Apellido.setEditable(false);
		textField_Apellido.setColumns(10);
		
		JLabel lblNobre = new JLabel("Nombre");
		lblNobre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Nombre.setEditable(false);
		textField_Nombre.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_TipoDocumento = new JTextField();
		textField_TipoDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_TipoDocumento.setEditable(false);
		textField_TipoDocumento.setColumns(10);
		
		JLabel lblNroDocumento = new JLabel("Nro Documento");
		lblNroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_NroDocumento = new JTextField();
		textField_NroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_NroDocumento.setEditable(false);
		textField_NroDocumento.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Provincia = new JTextField();
		textField_Provincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Provincia.setEditable(false);
		textField_Provincia.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Localidad = new JTextField();
		textField_Localidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Localidad.setEditable(false);
		textField_Localidad.setColumns(10);
		
		GroupLayout gl_pnl_DatosDelCliente = new GroupLayout(pnl_DatosDelCliente);
		gl_pnl_DatosDelCliente.setHorizontalGroup(
			gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnl_DatosDelCliente.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
							.addComponent(lblProvincia)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_Provincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
							.addComponent(lblTipo)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
							.addComponent(lblNroCliente)
							.addGap(18)
							.addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
							.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblLocalidad)
								.addComponent(lblNroDocumento)
								.addComponent(lblApellido))
							.addGap(18)
							.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
									.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(56)
									.addComponent(lblNobre)
									.addGap(18)
									.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_Localidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
							.addGap(93)
							.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(42))
		);
		gl_pnl_DatosDelCliente.setVerticalGroup(
			gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
					.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNroCliente)
						.addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido)
						.addComponent(lblNobre)
						.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo)
						.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNroDocumento))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblProvincia)
							.addComponent(textField_Provincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLocalidad)
							.addComponent(textField_Localidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnl_DatosDelCliente.setLayout(gl_pnl_DatosDelCliente);
		
		/*INGRESO DE DATOS PARA LA PÓLIZA*/
		pnl_IngresoDeDatos = new JPanel();
		pnl_IngresoDeDatos.setBorder(new TitledBorder(null, "INGRESO DE DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_pnl_IngresoDeDatos = new GridBagLayout();
		gbl_pnl_IngresoDeDatos.columnWidths = new int[]{41, 81, 112, 44, 92, 118, 43, 0, 112, 33, 0};
		gbl_pnl_IngresoDeDatos.rowHeights = new int[]{32, 32, 24, 32, 32, 32, 26, 78, 32, 32, 26, 0};
		gbl_pnl_IngresoDeDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnl_IngresoDeDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnl_IngresoDeDatos.setLayout(gbl_pnl_IngresoDeDatos);
		
		/*INGRESO DE DOMICILIO DE RIESGO*/
		JLabel lblDomicilioDeRiesgo = new JLabel("DOMICILIO DE RIESGO");
		lblDomicilioDeRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblDomicilioDeRiesgo = new GridBagConstraints();
		gbc_lblDomicilioDeRiesgo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDomicilioDeRiesgo.gridwidth = 2;
		gbc_lblDomicilioDeRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDomicilioDeRiesgo.gridx = 1;
		gbc_lblDomicilioDeRiesgo.gridy = 0;
		pnl_IngresoDeDatos.add(lblDomicilioDeRiesgo, gbc_lblDomicilioDeRiesgo);
		
		JLabel lblProvinciaRiesgo = new JLabel("Provincia(*)");
		lblProvinciaRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblProvinciaRiesgo = new GridBagConstraints();
		gbc_lblProvinciaRiesgo.anchor = GridBagConstraints.WEST;
		gbc_lblProvinciaRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvinciaRiesgo.gridx = 1;
		gbc_lblProvinciaRiesgo.gridy = 1;
		pnl_IngresoDeDatos.add(lblProvinciaRiesgo, gbc_lblProvinciaRiesgo);
		
		JComboBox<String> cbxProvinciaRiesgo = new JComboBox<String>();
		cbxProvinciaRiesgo.setEnabled(false);
		cbxProvinciaRiesgo.setBackground(Color.WHITE);
		cbxProvinciaRiesgo.setForeground(Color.BLACK);
		cbxProvinciaRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxProvinciaRiesgo.addItem("");
		
		dtoListaProvincia= GestorListasDesplegables.buscarDtosProvincia();
		
		for(DTOProvincia provinciaRiesgo :  dtoListaProvincia) 
		
			cbxProvinciaRiesgo .addItem(provinciaRiesgo.getNombre().toString());
		
		cbxProvinciaRiesgo.setSelectedItem(null);

		GridBagConstraints gbc_cbxProvinciaRiesgo = new GridBagConstraints();
		gbc_cbxProvinciaRiesgo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxProvinciaRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_cbxProvinciaRiesgo.gridx = 2;
		gbc_cbxProvinciaRiesgo.gridy = 1;
		pnl_IngresoDeDatos.add(cbxProvinciaRiesgo, gbc_cbxProvinciaRiesgo);
		
		JLabel lblLocalidadRiesgo = new JLabel("Localidad(*)");
		lblLocalidadRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblLocalidadRiesgo = new GridBagConstraints();
		gbc_lblLocalidadRiesgo.anchor = GridBagConstraints.WEST;
		gbc_lblLocalidadRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidadRiesgo.gridx = 4;
		gbc_lblLocalidadRiesgo.gridy = 1;
		pnl_IngresoDeDatos.add(lblLocalidadRiesgo, gbc_lblLocalidadRiesgo);
		
		/* LOCALIDAD DE RIESGO */
		JComboBox<String> cbxLocalidadRiesgo = new JComboBox<String>();
		cbxLocalidadRiesgo.setEnabled(false);
		cbxLocalidadRiesgo.setBackground(Color.WHITE);
		cbxLocalidadRiesgo.setForeground(Color.BLACK);
		cbxLocalidadRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxLocalidadRiesgo.addItem("");
		
	/*	dtoListaLocalidad = GestorListasDesplegables.buscarDtosLocalidad(prov);
		
		for(DTOLocalidad localidad :  dtoListaLocalidad) 
		
			cbxLocalidadRiesgo.addItem(localidad.getNombre().toString());
		
		cbxLocalidadRiesgo.setSelectedItem(null);*/
				
		GridBagConstraints gbc_cbxLocalidadRiesgo = new GridBagConstraints();
		gbc_cbxLocalidadRiesgo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxLocalidadRiesgo.insets = new Insets(0, 0, 5, 5);
		gbc_cbxLocalidadRiesgo.gridx = 5;
		gbc_cbxLocalidadRiesgo.gridy = 1;
		pnl_IngresoDeDatos.add(cbxLocalidadRiesgo, gbc_cbxLocalidadRiesgo);
		
		JLabel lblDatosDelVehculo = new JLabel("DATOS DEL VEH\u00CDCULO");
		lblDatosDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblDatosDelVehculo = new GridBagConstraints();
		gbc_lblDatosDelVehculo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDatosDelVehculo.gridwidth = 2;
		gbc_lblDatosDelVehculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosDelVehculo.gridx = 1;
		gbc_lblDatosDelVehculo.gridy = 2;
		pnl_IngresoDeDatos.add(lblDatosDelVehculo, gbc_lblDatosDelVehculo);
		
		JLabel lblMarca = new JLabel("Marca(*)");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.WEST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 1;
		gbc_lblMarca.gridy = 3;
		pnl_IngresoDeDatos.add(lblMarca, gbc_lblMarca);
		
		JComboBox<String> cbxMarca = new JComboBox<String>();
		cbxMarca.setEnabled(false);
		cbxMarca.setBackground(Color.WHITE);
		cbxMarca.setForeground(Color.BLACK);
		cbxMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxMarca.addItem("");
		GridBagConstraints gbc_cbxMarca = new GridBagConstraints();
		gbc_cbxMarca.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxMarca.insets = new Insets(0, 0, 5, 5);
		gbc_cbxMarca.gridx = 2;
		gbc_cbxMarca.gridy = 3;
		pnl_IngresoDeDatos.add(cbxMarca, gbc_cbxMarca);
		
		JLabel lblModelo = new JLabel("Modelo(*)");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.WEST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 4;
		gbc_lblModelo.gridy = 3;
		pnl_IngresoDeDatos.add(lblModelo, gbc_lblModelo);
		
		JComboBox<String> cbxModelo = new JComboBox<String>();
		cbxModelo.setEnabled(false);
		cbxModelo.setForeground(Color.BLACK);
		cbxModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxModelo.setBackground(Color.WHITE);
		cbxModelo.addItem("");
		GridBagConstraints gbc_cbxModelo = new GridBagConstraints();
		gbc_cbxModelo.insets = new Insets(0, 0, 5, 5);
		gbc_cbxModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxModelo.gridx = 5;
		gbc_cbxModelo.gridy = 3;
		pnl_IngresoDeDatos.add(cbxModelo, gbc_cbxModelo);
		
		JLabel lblAnioVehiculo = new JLabel("A\u00F1o del Veh\u00EDculo(*)");
		lblAnioVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblAnioVehiculo = new GridBagConstraints();
		gbc_lblAnioVehiculo.anchor = GridBagConstraints.WEST;
		gbc_lblAnioVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnioVehiculo.gridx = 7;
		gbc_lblAnioVehiculo.gridy = 3;
		pnl_IngresoDeDatos.add(lblAnioVehiculo, gbc_lblAnioVehiculo);
		
		JComboBox<String> cbxAnioVehiculo = new JComboBox<String>();
		cbxAnioVehiculo.setEnabled(false);
		cbxAnioVehiculo.setBackground(Color.WHITE);
		cbxAnioVehiculo.setForeground(Color.BLACK);
		cbxAnioVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxAnioVehiculo.addItem("");
		GridBagConstraints gbc_cbxAnioVehiculo = new GridBagConstraints();
		gbc_cbxAnioVehiculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxAnioVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_cbxAnioVehiculo.gridx = 8;
		gbc_cbxAnioVehiculo.gridy = 3;
		pnl_IngresoDeDatos.add(cbxAnioVehiculo, gbc_cbxAnioVehiculo);
		
		JLabel lblMotor = new JLabel("Motor(*)");
		lblMotor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMotor = new GridBagConstraints();
		gbc_lblMotor.anchor = GridBagConstraints.WEST;
		gbc_lblMotor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotor.gridx = 1;
		gbc_lblMotor.gridy = 4;
		pnl_IngresoDeDatos.add(lblMotor, gbc_lblMotor);
		
		textField_Motor = new JTextField();
		textField_Motor.setEnabled(false);
		textField_Motor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Motor.setColumns(10);
		GridBagConstraints gbc_textField_Motor = new GridBagConstraints();
		gbc_textField_Motor.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Motor.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Motor.gridx = 2;
		gbc_textField_Motor.gridy = 4;
		pnl_IngresoDeDatos.add(textField_Motor, gbc_textField_Motor);
		
		JLabel lblKmPorAnio = new JLabel("Km por A\u00F1o(*)");
		lblKmPorAnio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblKmPorAnio = new GridBagConstraints();
		gbc_lblKmPorAnio.anchor = GridBagConstraints.WEST;
		gbc_lblKmPorAnio.insets = new Insets(0, 0, 5, 5);
		gbc_lblKmPorAnio.gridx = 4;
		gbc_lblKmPorAnio.gridy = 4;
		pnl_IngresoDeDatos.add(lblKmPorAnio, gbc_lblKmPorAnio);
		
		textField_KmPorAnio = new JTextField();
		textField_KmPorAnio.setEnabled(false);
		textField_KmPorAnio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_KmPorAnio.setColumns(10);
		GridBagConstraints gbc_textField_KmPorAnio = new GridBagConstraints();
		gbc_textField_KmPorAnio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_KmPorAnio.insets = new Insets(0, 0, 5, 5);
		gbc_textField_KmPorAnio.gridx = 5;
		gbc_textField_KmPorAnio.gridy = 4;
		pnl_IngresoDeDatos.add(textField_KmPorAnio, gbc_textField_KmPorAnio);
		
		JLabel lblChasis = new JLabel("Chasis(*)");
		lblChasis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblChasis = new GridBagConstraints();
		gbc_lblChasis.anchor = GridBagConstraints.WEST;
		gbc_lblChasis.insets = new Insets(0, 0, 5, 5);
		gbc_lblChasis.gridx = 7;
		gbc_lblChasis.gridy = 4;
		pnl_IngresoDeDatos.add(lblChasis, gbc_lblChasis);
		
		textField_Chasis = new JTextField();
		textField_Chasis.setEnabled(false);
		textField_Chasis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Chasis.setColumns(10);
		GridBagConstraints gbc_textField_Chasis = new GridBagConstraints();
		gbc_textField_Chasis.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Chasis.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Chasis.gridx = 8;
		gbc_textField_Chasis.gridy = 4;
		pnl_IngresoDeDatos.add(textField_Chasis, gbc_textField_Chasis);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPatente = new GridBagConstraints();
		gbc_lblPatente.anchor = GridBagConstraints.WEST;
		gbc_lblPatente.insets = new Insets(0, 0, 5, 5);
		gbc_lblPatente.gridx = 1;
		gbc_lblPatente.gridy = 5;
		pnl_IngresoDeDatos.add(lblPatente, gbc_lblPatente);
		
		textField_Patente = new JTextField();
		textField_Patente.setEnabled(false);
		textField_Patente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Patente.setColumns(10);
		GridBagConstraints gbc_textField_Patente = new GridBagConstraints();
		gbc_textField_Patente.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Patente.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Patente.gridx = 2;
		gbc_textField_Patente.gridy = 5;
		pnl_IngresoDeDatos.add(textField_Patente, gbc_textField_Patente);
		
		JLabel lblSumaAsegurada = new JLabel("Suma Asegurada:");
		lblSumaAsegurada.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblSumaAsegurada = new GridBagConstraints();
		gbc_lblSumaAsegurada.anchor = GridBagConstraints.WEST;
		gbc_lblSumaAsegurada.insets = new Insets(0, 0, 5, 5);
		gbc_lblSumaAsegurada.gridx = 4;
		gbc_lblSumaAsegurada.gridy = 5;
		pnl_IngresoDeDatos.add(lblSumaAsegurada, gbc_lblSumaAsegurada);
		
		textField_SumaAsegurada = new JTextField();
		textField_SumaAsegurada.setEnabled(false);
		textField_SumaAsegurada.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_SumaAsegurada.setColumns(10);
		GridBagConstraints gbc_textField_SumaAsegurada = new GridBagConstraints();
		gbc_textField_SumaAsegurada.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_SumaAsegurada.insets = new Insets(0, 0, 5, 5);
		gbc_textField_SumaAsegurada.gridx = 5;
		gbc_textField_SumaAsegurada.gridy = 5;
		pnl_IngresoDeDatos.add(textField_SumaAsegurada, gbc_textField_SumaAsegurada);
		
		JLabel lblMedidasDeSeguridad = new JLabel("MEDIDAS DE SEGURIDAD");
		lblMedidasDeSeguridad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMedidasDeSeguridad = new GridBagConstraints();
		gbc_lblMedidasDeSeguridad.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMedidasDeSeguridad.gridwidth = 2;
		gbc_lblMedidasDeSeguridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedidasDeSeguridad.gridx = 1;
		gbc_lblMedidasDeSeguridad.gridy = 6;
		pnl_IngresoDeDatos.add(lblMedidasDeSeguridad, gbc_lblMedidasDeSeguridad);
		
		JPanel pnl_CheckMedidasSeguridad = new JPanel();
		pnl_CheckMedidasSeguridad.setForeground(Color.WHITE);
		pnl_CheckMedidasSeguridad.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl_CheckMedidasSeguridad.setBackground(Color.WHITE);
		GridBagConstraints gbc_pnl_CheckMedidasSeguridad = new GridBagConstraints();
		gbc_pnl_CheckMedidasSeguridad.fill = GridBagConstraints.BOTH;
		gbc_pnl_CheckMedidasSeguridad.gridwidth = 6;
		gbc_pnl_CheckMedidasSeguridad.insets = new Insets(0, 0, 5, 5);
		gbc_pnl_CheckMedidasSeguridad.gridx = 2;
		gbc_pnl_CheckMedidasSeguridad.gridy = 7;
		pnl_IngresoDeDatos.add(pnl_CheckMedidasSeguridad, gbc_pnl_CheckMedidasSeguridad);
		
		JCheckBox chbxGarage = new JCheckBox("\u00BFSe guarda en garage?");
		chbxGarage.setEnabled(false);
		chbxGarage.setForeground(Color.BLACK);
		chbxGarage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxGarage.setBackground(Color.WHITE);
		
		JCheckBox chbxAlarma = new JCheckBox("\u00BFTiene alarma?");
		chbxAlarma.setEnabled(false);
		chbxAlarma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxAlarma.setBackground(Color.WHITE);
		
		JCheckBox chbxTuercas = new JCheckBox("\u00BFPosee tuercas antirrobo en las cuatro ruedas?");
		chbxTuercas.setEnabled(false);
		chbxTuercas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxTuercas.setBackground(Color.WHITE);
		
		JCheckBox chbxRastreo = new JCheckBox("\u00BFPosee dispositivo de rastreo vehicular?");
		chbxRastreo.setEnabled(false);
		chbxRastreo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxRastreo.setBackground(Color.WHITE);
		GroupLayout gl_pnl_CheckMedidasSeguridad = new GroupLayout(pnl_CheckMedidasSeguridad);
		gl_pnl_CheckMedidasSeguridad.setHorizontalGroup(
			gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_CheckMedidasSeguridad.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
						.addComponent(chbxGarage)
						.addComponent(chbxAlarma))
					.addGap(18)
					.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
						.addComponent(chbxTuercas)
						.addComponent(chbxRastreo))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_pnl_CheckMedidasSeguridad.setVerticalGroup(
			gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnl_CheckMedidasSeguridad.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.TRAILING)
						.addComponent(chbxGarage)
						.addComponent(chbxRastreo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.BASELINE)
						.addComponent(chbxTuercas)
						.addComponent(chbxAlarma))
					.addContainerGap())
		);
		pnl_CheckMedidasSeguridad.setLayout(gl_pnl_CheckMedidasSeguridad);
		
		JLabel lblSiniestros = new JLabel("Nro de Siniestros(*)");
		lblSiniestros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblSiniestros = new GridBagConstraints();
		gbc_lblSiniestros.gridwidth = 2;
		gbc_lblSiniestros.anchor = GridBagConstraints.WEST;
		gbc_lblSiniestros.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiniestros.gridx = 1;
		gbc_lblSiniestros.gridy = 8;
		pnl_IngresoDeDatos.add(lblSiniestros, gbc_lblSiniestros);
		
		JComboBox<String> cbxSiniestros = new JComboBox<String>();
		cbxSiniestros.setEnabled(false);
		cbxSiniestros.setBackground(Color.WHITE);
		cbxSiniestros.setForeground(Color.BLACK);
		cbxSiniestros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxSiniestros.addItem("");
		
		dtoListaSiniestros = GestorListasDesplegables.buscarDtosSiniestros();
		
		for(DTOSiniestro siniestro :  dtoListaSiniestros) 
		
			cbxSiniestros.addItem(siniestro.getCantidad().toString());
		
		cbxSiniestros.setSelectedItem(null);
		
		GridBagConstraints gbc_cbxSiniestros = new GridBagConstraints();
		gbc_cbxSiniestros.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxSiniestros.insets = new Insets(0, 0, 5, 5);
		gbc_cbxSiniestros.gridx = 5;
		gbc_cbxSiniestros.gridy = 8;
		pnl_IngresoDeDatos.add(cbxSiniestros, gbc_cbxSiniestros);
		
		JLabel lblCantHijos = new JLabel("Cantidad de Hijos entre 18 y 30 a\u00F1os:");
		lblCantHijos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblCantHijos = new GridBagConstraints();
		gbc_lblCantHijos.anchor = GridBagConstraints.WEST;
		gbc_lblCantHijos.gridwidth = 3;
		gbc_lblCantHijos.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantHijos.gridx = 1;
		gbc_lblCantHijos.gridy = 9;
		pnl_IngresoDeDatos.add(lblCantHijos, gbc_lblCantHijos);
		
		textField_CantHijos = new JTextField();
		textField_CantHijos.setEnabled(false);
		textField_CantHijos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_CantHijos.setColumns(10);
		GridBagConstraints gbc_textField_CantHijos = new GridBagConstraints();
		gbc_textField_CantHijos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CantHijos.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CantHijos.gridx = 4;
		gbc_textField_CantHijos.gridy = 9;
		pnl_IngresoDeDatos.add(textField_CantHijos, gbc_textField_CantHijos);
		
						
		JButton btnCompletarHijos = new JButton("Completar");
		btnCompletarHijos.setEnabled(false);
		btnCompletarHijos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroHijos = textField_CantHijos.getText();
				int numeroHijos = Integer.valueOf(nroHijos);
				
				new PantallaAgregarHijos(numeroHijos);

				if(numeroHijos >= 18 && numeroHijos <= 30)
				{
					if(e.getSource() == btnCompletarHijos)
					{
						ModHijos b = new ModHijos(numeroHijos);
						b.setVisible(true);
						b.setResizable(false);
						b.setLocationRelativeTo(null);
					}
				}
				
			}
		});
		btnCompletarHijos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_btnCompletarHijos = new GridBagConstraints();
		gbc_btnCompletarHijos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCompletarHijos.insets = new Insets(0, 0, 5, 5);
		gbc_btnCompletarHijos.gridx = 5;
		gbc_btnCompletarHijos.gridy = 9;
		pnl_IngresoDeDatos.add(btnCompletarHijos, gbc_btnCompletarHijos);
		GroupLayout gl_pnl_IngresoDatosGeneral = new GroupLayout(pnl_IngresoDatosGeneral);
		gl_pnl_IngresoDatosGeneral.setHorizontalGroup(
			gl_pnl_IngresoDatosGeneral.createParallelGroup(Alignment.TRAILING)
				.addComponent(pnl_IngresoDeDatos, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
		);
		gl_pnl_IngresoDatosGeneral.setVerticalGroup(
			gl_pnl_IngresoDatosGeneral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_IngresoDatosGeneral.createSequentialGroup()
					.addComponent(pnl_IngresoDeDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		JLabel lblCamposObligatorios = new JLabel("(*) Campos Obligatorios.");
		lblCamposObligatorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblCamposObligatorios = new GridBagConstraints();
		gbc_lblCamposObligatorios.gridwidth = 2;
		gbc_lblCamposObligatorios.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCamposObligatorios.insets = new Insets(0, 0, 0, 5);
		gbc_lblCamposObligatorios.gridx = 1;
		gbc_lblCamposObligatorios.gridy = 10;
		pnl_IngresoDeDatos.add(lblCamposObligatorios, gbc_lblCamposObligatorios);
		
		if (dtoCliente!=null) {
			
			long nroCliente=dtoCliente.getNroCliente();
			String strCliente = Long.toString(nroCliente);
			
			textField__NroCliente.setText(strCliente );
					
			textField_Apellido.setText(dtoCliente.getApellido());	
			
			textField_Nombre.setText(dtoCliente.getNombre());
			
			textField_TipoDocumento.setText(dtoCliente.getTipodedocumento().getNombre());
			
			int nroDocumento=dtoCliente.getNroDocumento();
			String strnNroDocumento =Integer.toString(nroDocumento);
			
			textField_NroDocumento.setText( strnNroDocumento );
					
			textField_Provincia.setText(dtoCliente.getDireccion().getLocalidad().getProvincia().getNombre());
			
			textField_Localidad.setText(dtoCliente.getDireccion().getLocalidad().getNombre());
			
			cbxProvinciaRiesgo.setEnabled(true);
			cbxLocalidadRiesgo.setEnabled(true);
			cbxMarca.setEnabled(true);
			cbxModelo.setEnabled(true);
			cbxAnioVehiculo.setEnabled(true);
			textField_Motor.setEnabled(true);
			textField_KmPorAnio.setEnabled(true);
			textField_Chasis.setEnabled(true);
			textField_Patente.setEnabled(true);
			textField_SumaAsegurada.setEnabled(true);
			chbxGarage.setEnabled(true);
			chbxAlarma.setEnabled(true);
			chbxTuercas.setEnabled(true);
			chbxRastreo.setEnabled(true);
			cbxSiniestros.setEnabled(true);
			textField_CantHijos.setEnabled(true);
			btnCompletarHijos.setEnabled(true);

		};
		if(cbxProvinciaRiesgo.getSelectedIndex() == -1)
		{
			System.out.printf("Seleccione provincia");
		}
		else
		{
			System.out.printf(cbxProvinciaRiesgo.getSelectedItem().toString());
		}

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kmxAnio = textField_KmPorAnio.getText();
				String motor = textField_Motor.getText();
				String chasis = textField_Chasis.getText();
				String provincia = cbxProvinciaRiesgo.getSelectedItem().toString();
				String localidad = cbxLocalidadRiesgo.getSelectedItem().toString();
				String marca = cbxMarca.getSelectedItem().toString();
				String modelo = cbxModelo.getSelectedItem().toString();
				String anio = cbxAnioVehiculo.getSelectedItem().toString();
				String nroSiniestro = cbxSiniestros.getSelectedItem().toString();
				
				if(e.getSource() == btnAceptar)
				{
				
					/*if((cbxProvinciaRiesgo.getSelectedIndex() != -1) )
					{
						System.out.printf("Provincia seleccionada");
					
					}*/
				if(kmxAnio.equals("") || motor.equals("") || chasis.equals("") || provincia.equals("") || localidad.equals("") || marca.equals("") || modelo.equals("") || anio.equals("") || nroSiniestro.equals("") )
				{
					if(kmxAnio.equals(""))
					{
						lblKmPorAnio.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblKmPorAnio.setForeground(Color.black);
					}
					if(motor.equals(""))
					{
						lblMotor.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblMotor.setForeground(Color.black);
					}
					if(chasis.equals(""))
					{
						lblChasis.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblChasis.setForeground(Color.black);
					}
					if(provincia.equals(""))
					{
						lblProvinciaRiesgo.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblProvinciaRiesgo.setForeground(Color.black);
					}
					if(localidad.equals(""))
					{
						lblLocalidadRiesgo.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblLocalidadRiesgo.setForeground(Color.black);
					}
					if(marca.equals(""))
					{
						lblMarca.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblMarca.setForeground(Color.black);
					}
					if(modelo.equals(""))
					{
						lblModelo.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblModelo.setForeground(Color.black);
					}
					if(anio.equals(""))
					{
						lblAnioVehiculo.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblAnioVehiculo.setForeground(Color.black);
					}
					if(nroSiniestro.equals(""))
					{
						lblSiniestros.setForeground(Color.red);
						lblCamposObligatorios.setForeground(Color.red);
					}
					else 
					{
						lblSiniestros.setForeground(Color.black);
					}
				}
				else 
				{
					lblCamposObligatorios.setForeground(Color.black);
					darDeAltaPoliza1 b = new darDeAltaPoliza1();
					b.setVisible(true);
					b.setResizable(false);
					b.setLocationRelativeTo(null);
				}
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.NORTH;
		gbc_btnAceptar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 7;
		gbc_btnAceptar.gridy = 10;
		pnl_IngresoDeDatos.add(btnAceptar, gbc_btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCancelar)
				{
					dispose();
				}
			}
		});
		contentPane.setLayout(null);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.NORTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 8;
		gbc_btnCancelar.gridy = 10;
		pnl_IngresoDeDatos.add(btnCancelar, gbc_btnCancelar);
		pnl_IngresoDatosGeneral.setLayout(gl_pnl_IngresoDatosGeneral);
		contentPane.add(pnl_IngresoDatosGeneral);
		contentPane.add(pnl_DatosDelCliente);
		contentPane.add(pnl_BuscarCliente);
		
		JPanel pnl_encabezado = new JPanel();
		pnl_encabezado.setToolTipText("jgj");
		pnl_encabezado.setBackground(new Color(255, 0, 51));
		pnl_encabezado.setBounds(0, 0, 784, 83);
		contentPane.add(pnl_encabezado);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_pnl_encabezado = new GroupLayout(pnl_encabezado);
		gl_pnl_encabezado.setHorizontalGroup(
			gl_pnl_encabezado.createParallelGroup(Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE)
				.addGroup(gl_pnl_encabezado.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_pnl_encabezado.setVerticalGroup(
			gl_pnl_encabezado.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_pnl_encabezado.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		pnl_encabezado.setLayout(gl_pnl_encabezado);
	}
}
