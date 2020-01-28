package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;



import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOPoliza;



import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;


public class RealizarPagoPoliza extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField textField_NroPoliza;
	private JTextField txt_Marca;
	private JTextField txtModelo;
	private JTextField txtPatente;
	private JTextField nroCliente;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField textField_SumarAPagar;
	private JTextField txtDni;
	private JTextField textField_NroDocumento;
	private JTextField textField_FechaPago;
	private JTextField textField_Mes;
	private JTextField textField_Anio;
	private JTextField textField_Monto;
	private JTextField textField_FecheDesde;
	private JTextField textField_FechaHasta;
	
	private JScrollPane scrollPane;
	private String[] nombresDeLasColumnasDeLaTabla = { "Cuotas a Pagar", "Cuota/A\u00F1o", "Vencimiento", "Valor original",
			"Valor actual a pagar" };
	private Object[][] datosDeLaTabla;
	private JTable tablaCuota;
	

	private List<DTOCuota> listaDtoCuota = new ArrayList<DTOCuota>();
	private List<DTOCuota> listaFechaRecibo = new ArrayList<DTOCuota>();
	private List<DTOCuota> listadtocuotaSeleccionada= new ArrayList<DTOCuota>();

	public RealizarPagoPoliza(DTOPoliza dtopoliza) {
	

		this.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		this.setBounds(100, 0, 800, 730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(317, Short.MAX_VALUE).addComponent(label).addGap(310)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap(27, Short.MAX_VALUE).addComponent(label).addGap(25)));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JLabel lblSeleccionePoliza = new JLabel("Seleccione una Poliza");

		JButton btnBuscarPoliza = new JButton("BuscarPoliza");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(26).addComponent(lblSeleccionePoliza).addGap(35)
						.addComponent(btnBuscarPoliza).addContainerGap(504, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1
						.createSequentialGroup().addGap(26).addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSeleccionePoliza).addComponent(btnBuscarPoliza))
						.addContainerGap(34, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();

		JLabel label_7 = new JLabel("NRO DE P\u00D3LIZA:");
		label_7.setBounds(12, 197, 98, 14);
	

		textField_NroPoliza = new JTextField();
		textField_NroPoliza.setBounds(120, 194, 104, 20);
		textField_NroPoliza.setEditable(false);
		textField_NroPoliza.setColumns(10);
		textField_NroPoliza.setText(dtopoliza.getNroPoliza().toString());

		JLabel label_8 = new JLabel("VIGENCIA:");
		label_8.setBounds(381, 197, 67, 14);

		JLabel label_9 = new JLabel("Desde:");
		label_9.setBounds(458, 197, 43, 14);

		JLabel label_10 = new JLabel("Hasta:");
		label_10.setBounds(619, 197, 40, 14);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 232, 752, 63);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DEL VEH\u00CDCULO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_11 = new JLabel("Marca:");

		txt_Marca = new JTextField();
		txt_Marca.setEditable(false);
		txt_Marca.setColumns(10);
		
		txt_Marca.setText(dtopoliza.getVehiculo().getModelo().getMarca().getMarca());

		JLabel label_12 = new JLabel("Modelo:");

		txtModelo = new JTextField();
		txtModelo.setEditable(false);
		txtModelo.setColumns(10);
		
		txtModelo.setText(dtopoliza.getVehiculo().getModelo().getNombre());

		JLabel label_13 = new JLabel("Patente:");

		txtPatente = new JTextField();
		txtPatente.setEditable(false);
		txtPatente.setColumns(10);
		
		txtPatente.setText(dtopoliza.getVehiculo().getPatente());
		
		
		
		JLabel label_14 = new JLabel("Nro Cliente:");
		
	

		nroCliente = new JTextField();
		nroCliente.setEditable(false);
		nroCliente.setColumns(10);
		nroCliente.setText( dtopoliza.getCliente().getNroCliente().toString());

		JLabel label_15 = new JLabel("Apellido:");

		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		
		txtApellido.setText(dtopoliza.getCliente().getApellido());

		JLabel label_16 = new JLabel("Nombre:");

		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		
		txtNombre.setText(dtopoliza.getCliente().getNombre());  
		JLabel lblTipoDocumento = new JLabel("Tipo Documento:");

	
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		txtDni.setText(dtopoliza.getCliente().getTipodedocumento().getNombre());

		JLabel lblNroDocumento = new JLabel("Nro. Documento:");
		
		

		textField_NroDocumento = new JTextField();
		textField_NroDocumento.setEditable(false);
		textField_NroDocumento.setColumns(10);
		
		textField_NroDocumento.setText(dtopoliza.getCliente().getNroDocumento().toString());
		
		JLabel lblFechaDePago = new JLabel("Fecha de pago:");

		textField_FechaPago = new JTextField();
		textField_FechaPago.setEditable(false);
		textField_FechaPago.setColumns(10);

		JLabel lblMes = new JLabel("Mes:");

		textField_Mes = new JTextField();
		textField_Mes.setEditable(false);
		textField_Mes.setColumns(10);

		JLabel lblAo = new JLabel("A\u00F1o:");

		textField_Anio = new JTextField();
		textField_Anio.setEditable(false);
		textField_Anio.setColumns(10);

		JLabel lblMonto = new JLabel("Monto:");

		textField_Monto = new JTextField();
		textField_Monto.setEditable(false);
		textField_Monto.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Monto.setColumns(10);
		
		
		
		
		textField_FecheDesde = new JTextField();
		textField_FecheDesde.setBounds(505, 194, 86, 20);
		textField_FecheDesde.setEditable(false);
		textField_FecheDesde.setColumns(10);
		
		textField_FecheDesde.setText(dtopoliza.getFechaInicioVigencia().toString());
		
		textField_FechaHasta = new JTextField();
		textField_FechaHasta.setBounds(663, 194, 86, 20);
		textField_FechaHasta.setEnabled(true);
		textField_FechaHasta.setEditable(false);
		textField_FechaHasta.setColumns(10);
		
		textField_FechaHasta.setText(dtopoliza.getFechaFinVigencia().toString());
		
		
		JLabel lblSumaAPagarl = new JLabel("Suma a Pagar:");
		lblSumaAPagarl.setBounds(472, 436, 91, 15);
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField_SumarAPagar = new JTextField();
		textField_SumarAPagar.setBounds(567, 433, 116, 21);
		
		textField_SumarAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_SumarAPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_SumarAPagar.setEditable(false);
		textField_SumarAPagar.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 16, 715, 93);
		datosDeLaTabla = new Object[24][5];
		tablaCuota = new JTable(datosDeLaTabla, nombresDeLasColumnasDeLaTabla);
		tablaCuota.setCellSelectionEnabled(true);

		tablaCuota.getColumnModel().getColumn(2).setPreferredWidth(119);
		tablaCuota.getColumnModel().getColumn(3).setPreferredWidth(118);
		scrollPane.setViewportView(tablaCuota);
		
		
		listaDtoCuota=dtopoliza.getListadtocuota();
		
		
		for (DTOCuota Dtocuota : listaDtoCuota) {
			
			if( Dtocuota.getRecibo().getNroRecibo()!=null) {
				listaFechaRecibo.add(Dtocuota);	
			}
			
		}
		
		if (listaFechaRecibo.size()!= 0) {
			
			Date fechaMayor= listaFechaRecibo.get(0).getRecibo().getFecha();
			float ImporteTotal = 0; 
			
			for (int i = 1; i < listaFechaRecibo.size(); i++) {
				
				if (listaFechaRecibo.get(i).getRecibo().getFecha().compareTo(fechaMayor) == 1) 
					
					fechaMayor=listaFechaRecibo.get(i).getRecibo().getFecha();
									
						} 
			for (int i = 0; i < listaFechaRecibo.size(); i++) {
				if (fechaMayor.equals(listaFechaRecibo.get(i).getRecibo().getFecha())) 
					
					ImporteTotal= listaFechaRecibo.get(i).getRecibo().getImporteTotal();
						
			} 
			
		    String fechaUltimoPago= fechaMayor.toString();
		    String monto= String.valueOf(ImporteTotal);
		    String pesos="$";
			String resultado=  (pesos.concat(monto));
			textField_FechaPago.setText(fechaUltimoPago);
			textField_Monto.setText(resultado);
			
			Calendar mes = Calendar.getInstance();
			Calendar anio = Calendar.getInstance();
			
			mes.setTime(fechaMayor);
			anio.setTime(fechaMayor);
			
			int month = mes.get(Calendar.MONTH)+ 1;
			int year =  anio.get(Calendar.YEAR);
			
			String mesFechaMayor = Integer.toString(month);
			String anioFechaMayor = Integer.toString(year);
			
			textField_Mes.setText(mesFechaMayor);
			textField_Anio.setText(anioFechaMayor);
		
		}else { 
			
			
			textField_FechaPago.setText("   /   /  ");
			String pesos="$";
			String monto =" 0 " ;
			String resultado=  (pesos.concat(monto));
			textField_Monto.setText(resultado);
			textField_Mes.setText(" ");
			textField_Anio.setText(" ");
			
		}
		
		construirTabla(listaDtoCuota);

		
		
		
		
		
		JButton btnConfirmar = new JButton("Confirmar Pago");
		btnConfirmar.setBounds(494, 476, 172, 23);
		
		btnConfirmar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConfirmar) {

					
				  int [] rows= tablaCuota.getSelectedRows();
				
				  			 
					try {

						if ( rows == null || rows.length == 0)
							JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una cuota", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						else {

							 
							

							for (int i = 0; i <rows.length; i++) {
					  
								int  rowsSeleccionada=rows[i]+1;
								if( rowsSeleccionada== listaDtoCuota.get(i).getIdCuotas()) {
										
									
									listadtocuotaSeleccionada.add(listaDtoCuota.get(i));
								}
								}
							
						dtopoliza.setListadtocuotaSeleccionada(listadtocuotaSeleccionada);
						
				
						
						dispose();
						RealizarPagoPolizaParte2 rp2 = new RealizarPagoPolizaParte2(dtopoliza);
						rp2.setVisible(true);
						rp2.setResizable(false);
						rp2.setLocationRelativeTo(null);

						}

					} catch (Exception e1) {

					}
				}
			}
		});

	

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(676, 476, 75, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCancelar) {
					setVisible(false);
					dispose();
				}
			}
		});
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txt_Marca, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE).addGap(18)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(label_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtPatente, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_4
				.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(label_11)
										.addComponent(txt_Marca, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_13)
										.addComponent(txtPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_12).addComponent(txtModelo,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(16, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 6, 754, 95);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TITULAR DEL SEGURO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
						.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(18)
							.addComponent(label_16)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(16)
							.addComponent(lblTipoDocumento, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNroDocumento)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addGap(27))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipoDocumento)
								.addComponent(textField_NroDocumento)
								.addComponent(lblNroDocumento)
								.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(38))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_14))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_16)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
					.addGap(3))
		);
		panel_5.setLayout(gl_panel_5);

		
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 759, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 517, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 306, 754, 116);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CUOTAS PENDIENTES DE PAGO:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 112, 754, 71);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u00DALTIMO PAGO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
						.addComponent(lblFechaDePago, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_FechaPago, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblMes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_Mes, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblAo).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField_Anio, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblMonto, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_Monto,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(207, Short.MAX_VALUE)));
		gl_panel_7
				.setVerticalGroup(
						gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_7.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblFechaDePago)
												.addComponent(textField_FechaPago, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMes)
												.addComponent(textField_Mes, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblAo)
												.addComponent(textField_Anio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMonto).addComponent(textField_Monto,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_7.setLayout(gl_panel_7);
		panel_2.setLayout(null);
		panel_2.add(panel_5);
		panel_2.add(panel_7);
		panel_2.add(panel_4);
		panel_2.add(label_7);
		panel_2.add(textField_NroPoliza);
		panel_2.add(label_8);
		panel_2.add(label_9);
		panel_2.add(textField_FecheDesde);
		panel_2.add(label_10);
		panel_2.add(textField_FechaHasta);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(scrollPane);
		panel_2.add(lblSumaAPagarl);
		panel_2.add(textField_SumarAPagar);
		panel_2.add(btnConfirmar);
		panel_2.add(btnCancelar);
		this.getContentPane().setLayout(groupLayout);
	}

	private void construirTabla(List<DTOCuota> listaDtosCuota) {
		String[] nombresDeLasColumnasDeLaTabla = { "Cuotas a Pagar", "Cuota/A\u00F1o", "Vencimiento", "Valor original",
				"Valor actual a pagar" };
		Object[][] informacion = obtenerMatriz(listaDtosCuota);
		tablaCuota = new JTable(informacion, nombresDeLasColumnasDeLaTabla);
		scrollPane.setViewportView(tablaCuota);

	}

	private Object[][] obtenerMatriz(List<DTOCuota> listaDtosCuota) {
		datosDeLaTabla = new Object[listaDtosCuota.size()][5];
		Calendar anio = Calendar.getInstance();
		
        Calendar c = new GregorianCalendar();
		
		
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String fechaActual=annio.concat("-").concat(mes).concat("-").concat(dia);
		
		float resultado;
		
		for (int i = 0; i < listaDtosCuota.size(); i++) {
            			
			anio.setTime(listaDtosCuota.get(i).getVencimiento());
			int year =  anio.get(Calendar.YEAR);
			
		    String nroCuota= listaDtosCuota.get(i).getIdCuotas().toString();
			String anioCuota = Integer.toString(year);
			
			String nrocuota_anio=nroCuota.concat("/").concat(anioCuota);
			datosDeLaTabla[i][1] = nrocuota_anio+ "";
			
			datosDeLaTabla[i][2] = listaDtosCuota.get(i).getVencimiento() + "";
			
			datosDeLaTabla[i][3] = listaDtosCuota.get(i).getValorOriginal()+ "";
			
			if (fechaActual.compareTo(listaDtosCuota.get(i).getVencimiento().toString()) == 1) {
				
				resultado= listaDtosCuota.get(i).getValorOriginal() + listaDtosCuota.get(i).getRecargoPorMora() ;
				
				datosDeLaTabla[i][4] = resultado + "";
				}
			else
				{
				resultado= listaDtosCuota.get(i).getValorOriginal() - listaDtosCuota.get(i).getBonificacion() ;
				
				datosDeLaTabla[i][4] = resultado + "";
				
				}
					
			
		}
		return datosDeLaTabla;
	}
}
