package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.Controladores.GestorPoliza;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOMedidasdeseguridad;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTOVehiculo;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Cuota;
import ar.TpDisenio2019.Modelo.Datosdehijo;
import ar.TpDisenio2019.Modelo.Factoresusados;
import ar.TpDisenio2019.Modelo.Formasdepago;
import ar.TpDisenio2019.Modelo.Kmporanio;
import ar.TpDisenio2019.Modelo.Medidasdeseguridad;
import ar.TpDisenio2019.Modelo.Medidasdeseguridadporc;
import ar.TpDisenio2019.Modelo.Modelo;
import ar.TpDisenio2019.Modelo.Numeropoliza;
import ar.TpDisenio2019.Modelo.Poliza;
import ar.TpDisenio2019.Modelo.Tipocobertura;
import ar.TpDisenio2019.Modelo.Vehiculo;

import javax.swing.border.EtchedBorder;

public class darDeAltaPoliza3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField apellido_textField;
	private JTextField nombre_textField;
	private JTextField textField_marca;
	private JTextField textField_modelo;
	private JTextField textField_motor;
	private JTextField textField_chasis;
	private JTextField textField_patente;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_sumaAsegurada;
	private JTextField nombre_textField1;
	private JTextField nombre_textField0;
	private JTextField nombre_textField3;
	private JTextField nombre_textField2;

	public darDeAltaPoliza3(DTOCliente dtoCliente, DTOPoliza dtoPoliza, DTOVehiculo dtoVehiculo, DTOMedidasdeseguridad dtoMedidasSeguridad, DTOCuota dtoCuota) {
		setTitle("P\u00F3liza a Generar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 100, 829, 85);
		panel_2.setBorder(new TitledBorder(null, "TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 191, 829, 148);
		panel_3.setBorder(new TitledBorder(null, "DATOS DEL VEH\u00CDCULO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		textField_marca = new JTextField();
		textField_marca.setEditable(false);
		textField_marca.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		
		JLabel lblModelo = new JLabel("Modelo");
		
		textField_modelo = new JTextField();
		textField_modelo.setEditable(false);
		textField_modelo.setColumns(10);
		
		JLabel lblMotor = new JLabel("Motor");
		
		textField_motor = new JTextField();
		textField_motor.setEditable(false);
		textField_motor.setColumns(10);
		
		JLabel lblChasis = new JLabel("Chasis");
		
		textField_chasis = new JTextField();
		textField_chasis.setEditable(false);
		textField_chasis.setColumns(10);
		
		JLabel lblPatente = new JLabel("Patente");
		
		textField_patente = new JTextField();
		textField_patente.setEditable(false);
		textField_patente.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(137)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblMarca)
							.addGap(18)
							.addComponent(textField_marca, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(lblMotor)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_motor, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(lblChasis)
								.addGap(18)
								.addComponent(textField_chasis, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))))
					.addGap(122)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblModelo)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_modelo, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblPatente)
							.addGap(18)
							.addComponent(textField_patente, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(135, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblModelo)
								.addComponent(textField_modelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPatente)
								.addComponent(textField_patente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_marca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMarca))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblChasis)
								.addComponent(textField_chasis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_motor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMotor))))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(5, 345, 829, 101);
		panel_4.setBorder(new TitledBorder(null, "VIGENCIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		JLabel lblFechaDeIniv = new JLabel("Fecha de Inicio");
		
		JLabel lblFechaDeFin = new JLabel("Fecha de Fin");
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(96)
					.addComponent(lblFechaDeIniv)
					.addGap(18)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(101)
					.addComponent(lblFechaDeFin)
					.addGap(18)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(123, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaDeFin)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFechaDeIniv)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "INFORMACI\u00D3N", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(5, 453, 829, 233);
		
		JLabel lblSumaAsegurada = new JLabel("Suma Asegurada");
		
		JLabel lblPremio = new JLabel("Premio");
		
		JLabel lblImpPorDescuento = new JLabel("Imp. por Descuento");
		
		JLabel lblltimoDaDe = new JLabel("\u00DAltimo d\u00EDa de pago");
		
		JLabel lblMontoTotalA = new JLabel("Monto total a abonar");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAceptar)
				{
					dispose();
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnCancelar)
				{	
					dispose();
				}
			}
		});
		
		textField_sumaAsegurada = new JTextField();
		textField_sumaAsegurada.setEditable(false);
		textField_sumaAsegurada.setColumns(10);
		
		nombre_textField1 = new JTextField();
		nombre_textField1.setEditable(false);
		nombre_textField1.setColumns(10);
		
		nombre_textField0 = new JTextField();
		nombre_textField0.setEditable(false);
		nombre_textField0.setColumns(10);
		
		nombre_textField3 = new JTextField();
		nombre_textField3.setEditable(false);
		nombre_textField3.setColumns(10);
		
		nombre_textField2 = new JTextField();
		nombre_textField2.setEditable(false);
		nombre_textField2.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMontoTotalA)
							.addGap(18)
							.addComponent(nombre_textField3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addGap(9)
									.addComponent(lblSumaAsegurada, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblImpPorDescuento, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_sumaAsegurada, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(nombre_textField1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))))
					.addGap(70)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblltimoDaDe)
						.addComponent(lblPremio))
					.addGap(18)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(nombre_textField0, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(nombre_textField2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(241))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap(470, Short.MAX_VALUE)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(148))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nombre_textField0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPremio))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblltimoDaDe)
								.addComponent(nombre_textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSumaAsegurada)
								.addComponent(textField_sumaAsegurada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblImpPorDescuento)
								.addComponent(nombre_textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nombre_textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMontoTotalA))))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");		
		
		apellido_textField = new JTextField();
		apellido_textField.setEditable(false);
		apellido_textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		
		JLabel lblNombre = new JLabel("Nombre");

		nombre_textField = new JTextField();
		nombre_textField.setEditable(false);
		nombre_textField.setColumns(10);
		
		if((dtoCliente != null) && (dtoVehiculo != null) && (dtoPoliza != null))
		{
			apellido_textField.setText(dtoCliente.getApellido());
			nombre_textField.setText(dtoCliente.getNombre());
			textField_marca.setText(dtoVehiculo.getIdModelo().getMarca().getMarca());
			textField_modelo.setText(dtoVehiculo.getIdModelo().getNombre());
			textField_chasis.setText(dtoVehiculo.getChasis());
			textField_patente.setText(dtoVehiculo.getPatente());
			textField_motor.setText(dtoVehiculo.getMotor());
			//textField_sumaAsegurada.setText(dtoPoliza.getSumaAsegurada().toString());
			//System.out.println("---------------");
			//System.out.println(dtoPoliza.getSumaAsegurada());
			
			Poliza poliza = new Poliza();
			Cuota cuota = new Cuota();
			Datosdehijo datosHijos = new Datosdehijo();
			Vehiculo vehiculo = new Vehiculo();
			Numeropoliza num = new Numeropoliza();
			Factoresusados factores = new Factoresusados();
			Medidasdeseguridadporc medidasPorc = new Medidasdeseguridadporc();
			
			Modelo modelo = new Modelo();
			Cliente cliente = new Cliente();
			Formasdepago formaDePago = new Formasdepago();
			Kmporanio kmxAnio = new Kmporanio();
			Medidasdeseguridad medidas = new Medidasdeseguridad();
			Tipocobertura cobertura = new Tipocobertura();
			
			modelo.setIdModelo(dtoVehiculo.getIdModelo().getIdModelo());
			vehiculo.setAnio(dtoVehiculo.getAnio());
			vehiculo.setChasis(dtoVehiculo.getChasis());
			vehiculo.setIdVehiculo(dtoVehiculo.getIdVehiculo());
			vehiculo.setModelo(modelo);
			vehiculo.setMotor(dtoVehiculo.getMotor());
			vehiculo.setPatente(dtoVehiculo.getPatente());
			
			cliente.setIdCliente(dtoPoliza.getCliente().getIdCliente());
			formaDePago.setIdFormasDePago(dtoPoliza.getFormasdepago().getIdFormasDePago());	
			
			System.out.println("-------------");
			System.out.println(formaDePago.getIdFormasDePago());
			System.out.println("-------------");
			
			kmxAnio.setIdKmPorAnio(dtoPoliza.getKmporanio().getIdKmPorAnio());			
			medidas.setIdMedidasSeguridad(dtoPoliza.getMedidasdeseguridad().getIdMedidasSeguridad());			
			cobertura.setIdTipoCobertura(dtoPoliza.getTipoCobertura().getIdTipoCobertura());
			
			poliza.setCliente(cliente);
			poliza.setFormasdepago(formaDePago);
			poliza.setKmporanio(kmxAnio);
			poliza.setMedidasdeseguridad(medidas);
			poliza.setNroSiniestro(dtoPoliza.getNroSiniestro());
			//poliza.setSumaAsegurada(sumaAsegurada);
			poliza.setTipocobertura(cobertura);
			poliza.setVehiculo(vehiculo);
			
			GestorPoliza.guardarVehiculo(vehiculo);
			//GestorPoliza.guardarModelo(modelo);
			//GestorPoliza.guardarCliente(cliente);
			//GestorPoliza.guardarFormaDePago(formaDePago);
			//GestorPoliza.guardarKm(kmxAnio);
			//GestorPoliza.guardarMedidas(medidas);
			//GestorPoliza.guardarCobertura(cobertura);
			GestorPoliza.guardarPoliza(poliza);
		}
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(127)
							.addComponent(lblApellido)
							.addGap(18)
							.addComponent(apellido_textField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblNombre)
							.addGap(18)
							.addComponent(nombre_textField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(135, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(nombre_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido)
						.addComponent(apellido_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.add(panel_2);
		contentPane.add(panel_3);
		contentPane.add(panel_4);
		contentPane.add(panel_5);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("jgj");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 834, 87);
		contentPane.add(panel);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 774, Short.MAX_VALUE)
				.addGap(0, 770, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(299, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 87, Short.MAX_VALUE)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
	}
}
