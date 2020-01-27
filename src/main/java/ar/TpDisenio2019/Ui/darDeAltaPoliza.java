package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.DTO.DTOAniomodelo;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOKmporanio;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOMedidasdeseguridad;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.DTO.DTOVehiculo;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;
import ar.TpDisenio2019.Utilitario.ObtenerDtoDeUnCombo;
import ar.TpDisenio2019.Utilitario.Validaciones;

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

	private JCheckBox chbxGarage;
	private JCheckBox chbxAlarma;
	private JCheckBox chbxTuercas;
	private JCheckBox chbxRastreo;

	private JPanel pnl_BuscarCliente;
	private JPanel pnl_DatosDelCliente;
	private JPanel pnl_IngresoDatosGeneral;
	private JPanel pnl_IngresoDeDatos;

	private JComboBox<String> cbxModelo;
	private JComboBox<String> cbxMarca;
	private JComboBox<String> cbxAnioVehiculo;
	private JComboBox<String> cbxLocalidadRiesgo;
	private JComboBox<String> cbxProvinciaRiesgo;
	private JComboBox<String> comboBox_siniestro;

	private List<DTOMarca> dtoListaMarca;
	private List<DTOModelo> dtoListaModelo;
	private List<DTOProvincia> dtoListaProvincia;
	private List<DTOLocalidad> dtoListaLocalidad;
	private List<DTOSiniestro> dtoListaSiniestros;
//	private List<DTOMedidasdeseguridad> dtoListaMedidas;

	private DTOModelo dtoModeloSeleccionado;
	private DTOMarca dtoMarcaSeleccionado;
	private DTOKmporanio dtoKmPorAnio = new DTOKmporanio();
	private DTOSiniestro dtoSiniestro = new DTOSiniestro();
	private DTOPoliza dtoPoliza = new DTOPoliza();
	private DTOMedidasdeseguridad dtoMedidasSeguridad = new DTOMedidasdeseguridad();
	private DTOCuota dtoCuota = new DTOCuota();
	private DTOVehiculo dtoVehiculo = new DTOVehiculo();

	private List<String> listaMarca = new ArrayList<>();
	private List<String> listaModelo = new ArrayList<>();
	private List<String> listaAnio = new ArrayList<>();
	private List<String> listaProvincia = new ArrayList<>();
	private List<String> listaLocalidad = new ArrayList<>();

	private int banderaValidacionMotor = 0;
	private int banderaValidacionKm = 0;
	private int banderaValidacionChasis = 0;
	private int banderaValidacionPatente = 0;
	private int banderaValidacionSumaAsegurada = 0;

	public darDeAltaPoliza(DTOCliente dtoCliente) {
		setTitle("Dar de alta P\u00F3liza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		pnl_IngresoDatosGeneral = new JPanel();
		pnl_IngresoDatosGeneral.setBounds(5, 283, 829, 416);

		/* SECTOR BUSCAR CLIENTE */
		pnl_BuscarCliente = new JPanel();
		pnl_BuscarCliente.setBounds(5, 94, 829, 63);
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
		gl_pnl_BuscarCliente.setHorizontalGroup(gl_pnl_BuscarCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_BuscarCliente.createSequentialGroup().addGap(23)
						.addComponent(lblSeleccioneUnCliente, GroupLayout.PREFERRED_SIZE, 116,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnBuscarCliente, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(480, Short.MAX_VALUE)));
		gl_pnl_BuscarCliente.setVerticalGroup(gl_pnl_BuscarCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_BuscarCliente.createSequentialGroup().addGap(20)
						.addGroup(gl_pnl_BuscarCliente.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBuscarCliente).addComponent(lblSeleccioneUnCliente))
						.addContainerGap(16, Short.MAX_VALUE)));
		pnl_BuscarCliente.setLayout(gl_pnl_BuscarCliente);

		/* Datos del DTOCliente */
		pnl_DatosDelCliente = new JPanel();
		pnl_DatosDelCliente.setBounds(5, 163, 829, 114);
		pnl_DatosDelCliente.setBorder(
				new TitledBorder(null, "DATOS DEL CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));

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
		gl_pnl_DatosDelCliente.setHorizontalGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnl_DatosDelCliente.createSequentialGroup().addGap(53)
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup().addComponent(lblProvincia)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(textField_Provincia, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup().addComponent(lblTipo)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup().addComponent(lblNroCliente)
										.addGap(18).addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
										.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblLocalidad).addComponent(lblNroDocumento)
												.addComponent(lblApellido))
										.addGap(18)
										.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
														.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(56).addComponent(lblNobre).addGap(18)
														.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(textField_Localidad, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup().addGap(93).addComponent(
										textField_NroDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(42)));
		gl_pnl_DatosDelCliente.setVerticalGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_DatosDelCliente.createSequentialGroup()
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNroCliente)
								.addComponent(textField__NroCliente, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApellido).addComponent(lblNobre)
								.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE).addComponent(lblTipo)
								.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNroDocumento))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblProvincia).addComponent(textField_Provincia,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnl_DatosDelCliente.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLocalidad).addComponent(textField_Localidad,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnl_DatosDelCliente.setLayout(gl_pnl_DatosDelCliente);

		/* INGRESO DE DATOS PARA LA PÓLIZA */
		pnl_IngresoDeDatos = new JPanel();
		pnl_IngresoDeDatos.setBorder(
				new TitledBorder(null, "INGRESO DE DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_pnl_IngresoDeDatos = new GridBagLayout();
		gbl_pnl_IngresoDeDatos.columnWidths = new int[] { 41, 81, 112, 18, 92, 118, 16, 122, 110, 13, 0 };
		gbl_pnl_IngresoDeDatos.rowHeights = new int[] { 32, 32, 24, 32, 32, 32, 26, 78, 32, 32, 26, 0 };
		gbl_pnl_IngresoDeDatos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnl_IngresoDeDatos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnl_IngresoDeDatos.setLayout(gbl_pnl_IngresoDeDatos);

		/* INGRESO DE DOMICILIO DE RIESGO */
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

		cbxProvinciaRiesgo = new JComboBox<String>();
		cbxProvinciaRiesgo.setEnabled(false);
		cbxProvinciaRiesgo.setBackground(Color.WHITE);
		cbxProvinciaRiesgo.setForeground(Color.BLACK);
		cbxProvinciaRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));

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

		cbxLocalidadRiesgo = new JComboBox<String>();
		cbxLocalidadRiesgo.setEnabled(false);
		cbxLocalidadRiesgo.setBackground(Color.WHITE);
		cbxLocalidadRiesgo.setForeground(Color.BLACK);
		cbxLocalidadRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 11));

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

		cbxMarca = new JComboBox<String>();
		cbxMarca.setEnabled(false);
		cbxMarca.setBackground(Color.WHITE);
		cbxMarca.setForeground(Color.BLACK);
		cbxMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
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

		cbxModelo = new JComboBox<String>();
		cbxModelo.setEnabled(false);
		cbxModelo.setForeground(Color.BLACK);
		cbxModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbxModelo.setBackground(Color.WHITE);
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

		cbxAnioVehiculo = new JComboBox<String>();
		cbxAnioVehiculo.setEnabled(false);
		cbxAnioVehiculo.setBackground(Color.WHITE);
		cbxAnioVehiculo.setForeground(Color.BLACK);
		cbxAnioVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_cbxAnioVehiculo = new GridBagConstraints();
		gbc_cbxAnioVehiculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxAnioVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_cbxAnioVehiculo.gridx = 8;
		gbc_cbxAnioVehiculo.gridy = 3;
		pnl_IngresoDeDatos.add(cbxAnioVehiculo, gbc_cbxAnioVehiculo);

		JLabel lblSiniestros = new JLabel("Nro de Siniestros(*)");
		lblSiniestros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblSiniestros = new GridBagConstraints();
		gbc_lblSiniestros.gridwidth = 2;
		gbc_lblSiniestros.anchor = GridBagConstraints.WEST;
		gbc_lblSiniestros.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiniestros.gridx = 1;
		gbc_lblSiniestros.gridy = 8;
		pnl_IngresoDeDatos.add(lblSiniestros, gbc_lblSiniestros);

		comboBox_siniestro = new JComboBox<String>();
		comboBox_siniestro.setEnabled(false);
		comboBox_siniestro.setForeground(Color.BLACK);
		comboBox_siniestro.setBackground(Color.WHITE);
		comboBox_siniestro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 8;
		pnl_IngresoDeDatos.add(comboBox_siniestro, gbc_comboBox);

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

		textField_Motor.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = textField_Motor.getText();
				textField_Motor.setText(texto.toUpperCase());
			}

		});

		textField_Motor.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String motor = textField_Motor.getText();

				if (motor.length() > 0) {
					if (Validaciones.validarMotor(motor) == true) {
						System.out.println("motor bien");
						banderaValidacionMotor = 0;
					} else {
						System.out.println("motor mal");
						banderaValidacionMotor++;
					}
				}
			}

		});

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

		textField_KmPorAnio.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String km = textField_KmPorAnio.getText();

				if (km.length() > 0) {
					if (Validaciones.validarKmPorAnio(km) == true) {
						System.out.println("Km bien");
						banderaValidacionKm = 0;
					} else {
						System.out.println("Km mal");
						banderaValidacionKm++;
					}
				}
			}
		});

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

		textField_Chasis.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String chasis = textField_Chasis.getText();

				if (chasis.length() > 0) {
					if (Validaciones.validarChasis(chasis) == true) {
						System.out.println("chasis bien");
						banderaValidacionChasis = 0;
					} else {
						System.out.println("chasis mal");
						banderaValidacionChasis++;
					}

				}
			}

		});

		textField_Chasis.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = textField_Chasis.getText();
				textField_Chasis.setText(texto.toUpperCase());
			}

		});

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

		textField_Patente.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String patente = textField_Patente.getText();

				if (patente.length() > 0) {
					if (Validaciones.validarPatente(patente) == true) {
						System.out.println("patente bien");
						banderaValidacionPatente = 0;
					} else {
						System.out.println("patente mal");
						banderaValidacionPatente++;
					}
				}
			}

		});

		textField_Patente.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = textField_Patente.getText();
				textField_Patente.setText(texto.toUpperCase());
			}

		});

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

		textField_SumaAsegurada.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String suma = textField_SumaAsegurada.getText();

				if (suma.length() > 0) {
					if (Validaciones.validarSumaAsegurada(suma) == true) {
						System.out.println("suma bien");
						banderaValidacionSumaAsegurada = 0;
					} else {
						System.out.println("suma mal");
						banderaValidacionSumaAsegurada++;
					}
				}
			}

		});

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

		chbxGarage = new JCheckBox("\u00BFSe guarda en garage?");
		chbxGarage.setEnabled(false);
		chbxGarage.setForeground(Color.BLACK);
		chbxGarage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxGarage.setBackground(Color.WHITE);

		chbxAlarma = new JCheckBox("\u00BFTiene alarma?");
		chbxAlarma.setForeground(Color.BLACK);
		chbxAlarma.setEnabled(false);
		chbxAlarma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxAlarma.setBackground(Color.WHITE);

		chbxTuercas = new JCheckBox("\u00BFPosee tuercas antirrobo en las cuatro ruedas?");
		chbxTuercas.setForeground(Color.BLACK);
		chbxTuercas.setEnabled(false);
		chbxTuercas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxTuercas.setBackground(Color.WHITE);

		chbxRastreo = new JCheckBox("\u00BFPosee dispositivo de rastreo vehicular?");
		chbxRastreo.setForeground(Color.BLACK);
		chbxRastreo.setEnabled(false);
		chbxRastreo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chbxRastreo.setBackground(Color.WHITE);
		GroupLayout gl_pnl_CheckMedidasSeguridad = new GroupLayout(pnl_CheckMedidasSeguridad);
		gl_pnl_CheckMedidasSeguridad
				.setHorizontalGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl_CheckMedidasSeguridad.createSequentialGroup().addGap(28)
								.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
										.addComponent(chbxGarage).addComponent(chbxAlarma))
								.addGap(18)
								.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.LEADING)
										.addComponent(chbxTuercas).addComponent(chbxRastreo))
								.addContainerGap(62, Short.MAX_VALUE)));
		gl_pnl_CheckMedidasSeguridad
				.setVerticalGroup(
						gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pnl_CheckMedidasSeguridad.createSequentialGroup()
										.addContainerGap(20, Short.MAX_VALUE)
										.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.TRAILING)
												.addComponent(chbxGarage).addComponent(chbxRastreo))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnl_CheckMedidasSeguridad.createParallelGroup(Alignment.BASELINE)
												.addComponent(chbxTuercas).addComponent(chbxAlarma))
										.addContainerGap()));
		pnl_CheckMedidasSeguridad.setLayout(gl_pnl_CheckMedidasSeguridad);

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

				if (numeroHijos >= 1 && numeroHijos <= 15) {
					if (e.getSource() == btnCompletarHijos) {
						ModHijos b = new ModHijos(dtoPoliza, numeroHijos);
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
		gl_pnl_IngresoDatosGeneral.setHorizontalGroup(gl_pnl_IngresoDatosGeneral.createParallelGroup(Alignment.LEADING)
				.addComponent(pnl_IngresoDeDatos, GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE));
		gl_pnl_IngresoDatosGeneral.setVerticalGroup(gl_pnl_IngresoDatosGeneral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_IngresoDatosGeneral.createSequentialGroup()
						.addComponent(pnl_IngresoDeDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JLabel lblCamposObligatorios = new JLabel("(*) Campos Obligatorios.");
		lblCamposObligatorios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblCamposObligatorios = new GridBagConstraints();
		gbc_lblCamposObligatorios.gridwidth = 2;
		gbc_lblCamposObligatorios.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCamposObligatorios.insets = new Insets(0, 0, 0, 5);
		gbc_lblCamposObligatorios.gridx = 1;
		gbc_lblCamposObligatorios.gridy = 10;
		pnl_IngresoDeDatos.add(lblCamposObligatorios, gbc_lblCamposObligatorios);

		if (dtoCliente != null) {

			btnBuscarCliente.setEnabled(false);

			long nroCliente = dtoCliente.getNroCliente();
			String strCliente = Long.toString(nroCliente);

			int nroDocumento = dtoCliente.getNroDocumento();
			String strnNroDocumento = Integer.toString(nroDocumento);

			textField__NroCliente.setText(strCliente);
			textField_Apellido.setText(dtoCliente.getApellido());
			textField_Nombre.setText(dtoCliente.getNombre());
			textField_TipoDocumento.setText(dtoCliente.getTipodedocumento().getNombre());
			textField_NroDocumento.setText(strnNroDocumento);
			System.out.println(dtoCliente.getDireccion().getLocalidad().getProvincia().getNombre());
			textField_Provincia.setText(dtoCliente.getDireccion().getLocalidad().getProvincia().getNombre());
			textField_Localidad.setText(dtoCliente.getDireccion().getLocalidad().getNombre());

			cbxProvinciaRiesgo.setEnabled(true);
			cbxLocalidadRiesgo.setEnabled(true);
			cbxModelo.setEnabled(true);
			cbxMarca.setEnabled(true);
			cbxAnioVehiculo.setEnabled(true);
			comboBox_siniestro.setEnabled(true);
			textField_Motor.setEnabled(true);
			textField_KmPorAnio.setEnabled(true);
			textField_Chasis.setEnabled(true);
			textField_Patente.setEnabled(true);
			textField_SumaAsegurada.setEnabled(true);
			textField_CantHijos.setEnabled(true);
			chbxGarage.setEnabled(true);
			chbxAlarma.setEnabled(true);
			chbxTuercas.setEnabled(true);
			chbxRastreo.setEnabled(true);
			btnCompletarHijos.setEnabled(true);

			cbxModelo.addItem(" --Seleccione-- ");
			cbxMarca.addItem(" --Seleccione-- ");
			cbxAnioVehiculo.addItem(" --Seleccione-- ");
			cbxProvinciaRiesgo.addItem(" --Seleccione-- ");
			cbxLocalidadRiesgo.addItem(" --Seleccione-- ");
			comboBox_siniestro.addItem(" --Seleccione-- ");

			dtoListaMarca = GestorListasDesplegables.obtenerDTOMarca();
			dtoListaModelo = GestorListasDesplegables.buscarDtosModelo();
			dtoListaProvincia = GestorListasDesplegables.obtenerDTOProvincia();
			dtoListaLocalidad = GestorListasDesplegables.buscarDtosLocalidad();
			dtoListaSiniestros = GestorListasDesplegables.buscarDtosSiniestros();

			for (DTOSiniestro siniestro : dtoListaSiniestros)
				comboBox_siniestro.addItem(siniestro.getCantidad().toString());

			for (DTOProvincia provincia : dtoListaProvincia)
				listaProvincia.add(provincia.getNombre());

			for (String provincia : listaProvincia)
				cbxProvinciaRiesgo.addItem(provincia);

			cbxProvinciaRiesgo.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					String itemProvincia = cbxProvinciaRiesgo.getSelectedItem().toString();

					if (itemProvincia.equals(" --Seleccione-- ")) {

						cbxLocalidadRiesgo.removeAllItems();
						cbxLocalidadRiesgo.addItem(" --Seleccione-- ");
						listaLocalidad.clear();
					} else {
						DTOProvincia dtoProvinciaSeleccionado = ObtenerDtoDeUnCombo.ObtenerDTOProvincia(itemProvincia,
								dtoListaProvincia);

						for (DTOLocalidad dtoLocalidad : dtoListaLocalidad) {

							if (dtoProvinciaSeleccionado.getIdProvincia() == dtoLocalidad.getProvincia()
									.getIdProvincia()) {
								listaLocalidad.add(dtoLocalidad.getNombre());
							}
							cbxLocalidadRiesgo.removeAllItems();

						}
						cbxLocalidadRiesgo.addItem(" --Seleccione-- ");
						for (String localidad : listaLocalidad)
							cbxLocalidadRiesgo.addItem(localidad);
						listaLocalidad.clear();
					}
				}
			});

			for (DTOMarca marca : dtoListaMarca)
				listaMarca.add(marca.getMarca());

			for (String marca : listaMarca)
				cbxMarca.addItem(marca);

			cbxMarca.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						String itemMarca = cbxMarca.getSelectedItem().toString();

						if (itemMarca.equals(" --Seleccione-- ")) {

							cbxModelo.removeAllItems();
							cbxModelo.addItem(" --Seleccione-- ");
							cbxAnioVehiculo.removeAllItems();
							cbxAnioVehiculo.addItem(" --Seleccione-- ");
							listaModelo.clear();
						}

						else {

							dtoMarcaSeleccionado = ObtenerDtoDeUnCombo.ObtenerDTOMarca(itemMarca, dtoListaMarca);

							for (DTOModelo dtoModelo : dtoListaModelo) {

								if (dtoMarcaSeleccionado.getIdMarca() == dtoModelo.getMarca().getIdMarca())
									listaModelo.add(dtoModelo.getNombre());
							}
							cbxModelo.removeAllItems();

							cbxModelo.addItem(" --Seleccione-- ");
							for (String modelo : listaModelo)
								cbxModelo.addItem(modelo);
							listaModelo.clear();
							listaAnio.clear();
						}
					}
				}
			});
			cbxModelo.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {

						String itemModelo = cbxModelo.getSelectedItem().toString();

						if (itemModelo.equals(" --Seleccione-- ")) {

							cbxAnioVehiculo.removeAllItems();
							cbxAnioVehiculo.addItem(" --Seleccione-- ");
						} else {

							dtoModeloSeleccionado = ObtenerDtoDeUnCombo.ObtenerDTOModelo(itemModelo, dtoListaModelo);
							Set<DTOAniomodelo> lista = dtoModeloSeleccionado.getAniomodelos();
							int idModeloSeleccionado = dtoModeloSeleccionado.getIdModelo();
							Calendar Anio = Calendar.getInstance();
							for (DTOAniomodelo l : lista) {

								if (l.getModelo().getIdModelo().equals(idModeloSeleccionado)) {
									// System.out.println(l.getModelo().getIdModelo());

									// System.out.println(l.getAniodevehiculo().getAnio());
									Anio.setTime(l.getAniodevehiculo().getAnio());
									int year = Anio.get(Calendar.YEAR);
									String anio = Integer.toString(year);
									listaAnio.add(anio);
								}
							}

							cbxAnioVehiculo.removeAllItems();

							cbxAnioVehiculo.addItem(" --Seleccione-- ");
							for (String anio : listaAnio)
								cbxAnioVehiculo.addItem(anio);
							listaAnio.clear();
						}
					}
				}
			});

			/*
			 * String garaje = chbxGarage.getLabel(); String alarma = chbxAlarma.getLabel();
			 * String tuecas = chbxTuercas.getLabel(); String rastreo =
			 * chbxRastreo.getLabel();
			 * 
			 * if(chbxGarage.isSelected() || chbxAlarma.isSelected() ||
			 * chbxTuercas.isSelected() || chbxRastreo.isSelected()) {
			 * if(chbxGarage.isSelected()) { dtoMedidasSeguridad.setNombre(garaje); }
			 * if(chbxAlarma.isSelected()) { dtoMedidasSeguridad.setNombre(alarma); }
			 * if(chbxTuercas.isSelected()) { dtoMedidasSeguridad.setNombre(tuecas); }
			 * if(chbxRastreo.isSelected()) { dtoMedidasSeguridad.setNombre(rastreo); }
			 * System.out.println(" ---------------------------- ");
			 * System.out.println(dtoMedidasSeguridad.getNombre()); }
			 */
		}
		;

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String kmxAnio = textField_KmPorAnio.getText();
				String patente = textField_Patente.getText();
				String motor = textField_Motor.getText();
				String chasis = textField_Chasis.getText();
				String provincia = cbxProvinciaRiesgo.getSelectedItem().toString();
				String localidad = cbxLocalidadRiesgo.getSelectedItem().toString();
				String marca = cbxMarca.getSelectedItem().toString();
				String modelo = cbxModelo.getSelectedItem().toString();
				String anio = cbxAnioVehiculo.getSelectedItem().toString();
				String nroSiniestro = comboBox_siniestro.getSelectedItem().toString();
				String sumaAsegurada = textField_SumaAsegurada.getText();
				String mensajeValidacion="";
				if (e.getSource() == btnAceptar) {

					if (kmxAnio.equals("") || motor.equals("") || chasis.equals("")
							|| provincia.equals(" --Seleccione-- ") || localidad.equals(" --Seleccione-- ")
							|| marca.equals(" --Seleccione-- ") || modelo.equals(" --Seleccione-- ")
							|| anio.equals(" --Seleccione-- ") || nroSiniestro.equals(" --Seleccione-- ")) {
						if (kmxAnio.equals("")) {
							lblKmPorAnio.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblKmPorAnio.setForeground(Color.black);
						}
						if (motor.equals("")) {
							lblMotor.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);

						} else {
							lblMotor.setForeground(Color.black);
						}
						if (chasis.equals("")) {
							lblChasis.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblChasis.setForeground(Color.black);
						}
						if (provincia.equals(" --Seleccione-- ")) {
							lblProvinciaRiesgo.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblProvinciaRiesgo.setForeground(Color.black);
						}
						if (localidad.equals(" --Seleccione-- ")) {
							lblLocalidadRiesgo.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblLocalidadRiesgo.setForeground(Color.black);
						}
						if (marca.equals(" --Seleccione-- ")) {
							lblMarca.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblMarca.setForeground(Color.black);
						}
						if (modelo.equals(" --Seleccione-- ")) {
							lblModelo.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblModelo.setForeground(Color.black);
						}
						if (anio.equals(" --Seleccione-- ")) {
							lblAnioVehiculo.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblAnioVehiculo.setForeground(Color.black);
						}
						if (nroSiniestro.equals(" --Seleccione-- ")) {
							lblSiniestros.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						} else {
							lblSiniestros.setForeground(Color.black);
						}
						if (sumaAsegurada.equals("")) {
							dtoPoliza.setSumaAsegurada(null);
							// System.out.println("----------------------");

						} else {
							float sumaA = Float.parseFloat(sumaAsegurada);
							dtoPoliza.setSumaAsegurada(sumaA);
							// System.out.println("----------------------");
							// System.out.println(sumaA);
						}
					} 
					else if(banderaValidacionMotor > 0 || banderaValidacionKm > 0 || banderaValidacionPatente > 0
							|| banderaValidacionSumaAsegurada > 0 || banderaValidacionChasis>0) {
						mensajeValidacion+=("Se han encontrado los siguientes errores: ");
						if (banderaValidacionMotor > 0) {
							lblMotor.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
							mensajeValidacion+=("\n\tFalla al ingresar un motor: ingrese menos de 10 caracteres.");
						} else {
							lblMotor.setForeground(Color.black);
						}
						if (banderaValidacionKm > 0) {
							lblKmPorAnio.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
							mensajeValidacion+=("\n\tFalla al ingresar los Km por año: ingrese sólo números.");
						} else {
							lblKmPorAnio.setForeground(Color.black);
						}
						if (banderaValidacionPatente > 0) {
							lblPatente.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
							mensajeValidacion+=("\n\tFalla al ingresar Patente: ingrese formato de patente válido.");

						} else {
							lblPatente.setForeground(Color.black);
						}
						if (banderaValidacionSumaAsegurada > 0) {
							lblSumaAsegurada.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
							mensajeValidacion+=("\n\tFalla al ingresar la suma asegurada: ingrese sólo números.");

						} else {
							lblSumaAsegurada.setForeground(Color.black);
						}
						
						if (banderaValidacionChasis > 0) {
							lblChasis.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
							mensajeValidacion+=("\n\tFalla al ingresar el Chasis: son 17 caracteres.");

						} else {
							lblSumaAsegurada.setForeground(Color.black);
						}
						//System.out.println(mensajeAux);
						System.out.println(mensajeValidacion);
						JOptionPane.showMessageDialog(null,mensajeValidacion,"ERROR EN EL INGRESO DE DATOS",JOptionPane.ERROR_MESSAGE);
						
						
					}
					else{
						int anioVehiculo = Integer.parseInt(anio);
						float km = Float.parseFloat(kmxAnio);

						dtoVehiculo.setAnio(anioVehiculo);
						dtoVehiculo.setChasis(chasis);
						// dtoVehiculo.setIdModelo(dtoModeloSeleccionado);
						dtoVehiculo.setIdVehiculo(1);
						dtoVehiculo.setMotor(motor);
						dtoVehiculo.setPatente(patente);

						dtoKmPorAnio.setPorcentaje(km);
						// dtoSiniestro.setCantidad(nroSiniestro);
						dtoPoliza.setCliente(dtoCliente);
						dtoPoliza.setKmporanio(dtoKmPorAnio);
						dtoPoliza.setMedidasdeseguridad(dtoMedidasSeguridad);
						dtoPoliza.setSiniestro(dtoSiniestro);
						dtoPoliza.setVehiculo(dtoVehiculo);

						lblCamposObligatorios.setForeground(Color.black);
						dispose();
						darDeAltaPoliza1 b = new darDeAltaPoliza1(dtoCliente, dtoPoliza, dtoVehiculo,
								dtoMedidasSeguridad, dtoCuota);
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
				if (e.getSource() == btnCancelar) {
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
		pnl_encabezado.setBounds(0, 0, 834, 83);
		contentPane.add(pnl_encabezado);

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_pnl_encabezado = new GroupLayout(pnl_encabezado);
		gl_pnl_encabezado.setHorizontalGroup(gl_pnl_encabezado.createParallelGroup(Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE).addGroup(gl_pnl_encabezado.createSequentialGroup().addGap(314)
						.addComponent(label).addContainerGap(296, Short.MAX_VALUE)));
		gl_pnl_encabezado.setVerticalGroup(gl_pnl_encabezado.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE).addGroup(gl_pnl_encabezado.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE).addComponent(label).addGap(25)));
		pnl_encabezado.setLayout(gl_pnl_encabezado);
	}
}
