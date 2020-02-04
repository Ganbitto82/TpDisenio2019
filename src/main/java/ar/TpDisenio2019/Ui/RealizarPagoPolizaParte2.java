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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.Controladores.GestorBDPoliza;
import ar.TpDisenio2019.Controladores.GestorOperador;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.Modelo.Recibo;
import ar.TpDisenio2019.Utilitario.Validaciones;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;


public class RealizarPagoPolizaParte2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_NroPoliza;
	private JTextField txt_Marca;
	private JTextField txt_Modelo;
	private JTextField txtPatente;
	private JTextField nroCliente;
	private JTextField txt_Apellido;
	private JTextField txt_Nombre;
	private JTextField textField_SumaAPagar;

	private JTextField textField_ClientePaga;
	private JTextField textField_VueloAlCliente;
	private JTextField textField_Desde;
	private JTextField textField_Hasta;
	
	private JScrollPane scrollPane;
	private String[] nombresDeLasColumnasDeLaTabla = {  "Cuota/A\u00F1o", "Vencimiento", "Valor original",
			"Valor actual a pagar" };
	private Object[][] datosDeLaTabla;
	private JTable tablaCuota;
    private float sumaTOTAL=0;  
    private float pagoDeCliente ;
    private float recargoPorMoraAcumulado=0;
    private float bonificacionAcumulado=0;
    private String ClientePaga ; 
    private DTORecibo dtoRecibo= new DTORecibo();
    private Date fechaDelDia;
    private float interes,descuentos;
    private List<DTOCuota> listasel= new ArrayList<DTOCuota>();	
    private List<DTOCuota> listaselCopia= new ArrayList<DTOCuota>();	
	public RealizarPagoPolizaParte2(DTOPoliza dtopoliza, DTOOperador dtoOperador) {
		
		
		this.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		this.setBounds(100, 0, 800, 730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_panel.createSequentialGroup().addGap(314).addComponent(label).addContainerGap(313,
						Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap(31, Short.MAX_VALUE).addComponent(label).addGap(21)));
		panel.setLayout(gl_panel);
		
		 

		JPanel panel_2 = new JPanel();
		

		JLabel lbl_NroPoliza = new JLabel("NRO DE P\u00D3LIZA:");

		textField_NroPoliza = new JTextField();
		textField_NroPoliza.setEditable(false);
		textField_NroPoliza.setColumns(10);
		
		textField_NroPoliza.setText(dtopoliza.getNroPoliza().toString());
		

		JLabel lblVigencia = new JLabel("VIGENCIA:");

		JLabel lbl_Desde = new JLabel("Desde:");

		JLabel lbl_Hasta = new JLabel("Hasta:");

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DEL VEH\u00CDCULO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel lbl_Marca = new JLabel("Marca:");

		txt_Marca = new JTextField();
		txt_Marca.setEditable(false);
		txt_Marca.setColumns(10);
		
		txt_Marca.setText(dtopoliza.getVehiculo().getModelo().getMarca().getMarca());

		JLabel lbl_Modelo = new JLabel("Modelo:");

		txt_Modelo = new JTextField();
		txt_Modelo.setEditable(false);
		txt_Modelo.setColumns(10);
         
		txt_Modelo.setText(dtopoliza.getVehiculo().getModelo().getNombre());
		
		JLabel label_Patente = new JLabel("Patente:");

		txtPatente = new JTextField();
		txtPatente.setEditable(false);
		txtPatente.setColumns(10);
		
		txtPatente.setText(dtopoliza.getVehiculo().getPatente());
		
		JLabel lblNroCliente = new JLabel("Nro Cliente:");

		long numCliente = dtopoliza.getCliente().getNroCliente();
		String strCliente = Long.toString(numCliente);
		
		nroCliente = new JTextField();
		nroCliente.setEditable(false);
		nroCliente.setColumns(10);
		
		nroCliente.setText( strCliente );

		JLabel label_Apellido = new JLabel("Apellido:");

		txt_Apellido = new JTextField();
		txt_Apellido.setEditable(false);
		txt_Apellido.setColumns(10);
		
		txt_Apellido.setText(dtopoliza.getCliente().getApellido());

		JLabel label_Nombre = new JLabel("Nombre:");

		txt_Nombre = new JTextField();
		txt_Nombre.setEditable(false);
		txt_Nombre.setColumns(10);
		
		txt_Nombre.setText(dtopoliza.getCliente().getNombre());
		
		JLabel lblSumaAPagarl = new JLabel("Suma a Pagar:");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblVueltoAlCliente = new JLabel("Vuelto al Cliente:");
		lblVueltoAlCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_Desde = new JTextField();
		textField_Desde.setEditable(false);
		textField_Desde.setColumns(10);
		
		textField_Desde.setText(dtopoliza.getFechaInicioVigencia().toString());
		
		textField_Hasta = new JTextField();
		textField_Hasta.setEditable(false);
		textField_Hasta.setColumns(10);
		textField_Hasta.setText(dtopoliza.getFechaFinVigencia().toString());
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 16, 715, 93);
		datosDeLaTabla = new Object[24][5];
		tablaCuota = new JTable(datosDeLaTabla, nombresDeLasColumnasDeLaTabla);
		tablaCuota.setCellSelectionEnabled(true);

		tablaCuota.getColumnModel().getColumn(2).setPreferredWidth(119);
		tablaCuota.getColumnModel().getColumn(3).setPreferredWidth(118);
		scrollPane.setViewportView(tablaCuota);
		
					
		Float tasaDeInteres = dtopoliza.getParametrosgenerales().getTasaDeInteres();
		Float tasaDeDescuento = dtopoliza.getParametrosgenerales().getTasaDeDescuento();
		
		interes= (tasaDeInteres/100)*dtopoliza.getCuota().getValorOriginal();
		descuentos=(tasaDeDescuento/100)*dtopoliza.getCuota().getValorOriginal();
		
		
		
		listasel = dtopoliza.getListadtocuotaSeleccionada();
		listaselCopia=listasel;
	
		
		construirTabla(listaselCopia);
		
	
		
				
		textField_SumaAPagar = new JTextField();
		textField_SumaAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_SumaAPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_SumaAPagar.setEditable(false);
		textField_SumaAPagar.setColumns(10);
		
		String suma=String. valueOf(sumaTOTAL);
		
		dtopoliza.setSumaTotal(sumaTOTAL);
		dtopoliza.setBonificacionAcumulado(bonificacionAcumulado);
		dtopoliza.setRecargoPorMoraAcumulado(recargoPorMoraAcumulado);
		
		textField_SumaAPagar.setText(suma);
		
		
		textField_ClientePaga = new JTextField();
		textField_ClientePaga.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_ClientePaga.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_ClientePaga.setColumns(10);
		
		textField_VueloAlCliente = new JTextField();
		textField_VueloAlCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_VueloAlCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_VueloAlCliente.setEditable(false);
		textField_VueloAlCliente.setColumns(10);
		
		textField_ClientePaga .addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				ClientePaga = textField_ClientePaga.getText();

				 if (ClientePaga.compareTo(" ") != 0) {
						if (Validaciones.validarValorIngresado(ClientePaga) != true) {
							
							textField_VueloAlCliente.setText("");
						
					  		  }
				
			}
			}
			public void focusGained(FocusEvent arg0) {
				
				
			}
		});
	
	
		textField_ClientePaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == textField_ClientePaga) {
					
					ClientePaga = textField_ClientePaga.getText();
                    if (Validaciones.validarValorIngresado(ClientePaga) != true) {
                    	JOptionPane.showMessageDialog(null, "OPERACION INVALIDA", "Advertencia",
								JOptionPane.WARNING_MESSAGE);
                    	textField_VueloAlCliente.setText("");
                    	textField_ClientePaga.setText(" ");
						
					  		  }
                    else {
                    	
                    	if (ClientePaga.isEmpty() )
						pagoDeCliente=0; 
					else 
						
						pagoDeCliente= Float.parseFloat(ClientePaga);
					
					if (pagoDeCliente < sumaTOTAL) {
						
						ClientePaga = textField_ClientePaga.getText();
						JOptionPane.showMessageDialog(null, "El valor ingresado debe ser igual o mayor a la suma a pagar", "Advertencia",
								JOptionPane.WARNING_MESSAGE);
						textField_ClientePaga.setText("");
					}
					
					else {
						float vuelto = calculo(pagoDeCliente,sumaTOTAL );
					
						
					String vueltoString=String.valueOf(vuelto);  
					
					textField_VueloAlCliente.setText(vueltoString);
					}
					}
					
								
					
					
					
				}
			}
		});

		JPanel panel_6 = new JPanel();

		JLabel lblClientePaga = new JLabel("Cliente Paga:");
		lblClientePaga.setFont(new Font("Tahoma", Font.BOLD, 12));

		JButton btnRegistrarPago = new JButton("Registrar Pago");

		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(lbl_Marca, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txt_Marca, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE).addGap(18)
						.addComponent(lbl_Modelo, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txt_Modelo, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(label_Patente, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtPatente, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_4
				.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(lbl_Marca)
										.addComponent(txt_Marca, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_Patente)
										.addComponent(txtPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl_Modelo).addComponent(txt_Modelo,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(16, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TITULAR DEL SEGURO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(6)
						.addComponent(lblNroCliente, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(label_Apellido).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txt_Apellido, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE).addGap(33)
						.addComponent(label_Nombre).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txt_Nombre, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGap(20)));
		gl_panel_5
				.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(lblNroCliente)
										.addComponent(txt_Nombre, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_Nombre)
										.addComponent(txt_Apellido, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_Apellido).addComponent(nroCliente, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(16, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel label_1 = new JLabel("Seleccione una Poliza");
		
		btnRegistrarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnRegistrarPago) {
				
				String ClientePaga = textField_ClientePaga.getText();
				
				if(ClientePaga.isEmpty()|| ClientePaga.equals("") ) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un valor a pagar", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}
									
				else {
					
					
					DTOOperador dtoOperardoBusca= GestorOperador.buscarPorNombreOperador(dtoOperador.getNombre());
										
					try {
					 fechaDelDia = calcularFecha();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
										
					int horaDelDia= crearHoraDelDia();
					
					for(int i=0; i < listasel.size();i ++) {
						
						dtoRecibo.setIdRecibo(listasel.get(i).getIdCuotas());
								
						dtoRecibo.setOperador(dtoOperardoBusca);
										
						dtoRecibo.setNroRecibo(listasel.get(i).getIdCuotas());
					
						
						dtoRecibo.setFecha(fechaDelDia);
						dtoRecibo.setHora(horaDelDia);						
						dtoRecibo.setUltimoDiaDePago(listasel.get(i).getVencimiento());
						
						if(listasel.get(i).getValorOriginal() < listasel.get(i).getValorPorMora())
						{
							dtoRecibo.setImporteTotal(listasel.get(i).getValorPorMora());
							
							
						}else 
						
						{    dtoRecibo.setImporteTotal(listasel.get(i).getValorPorMora()); } 
						
						
						
						GestorBDPoliza.guardarRecibo(dtoRecibo);
						
						listasel.get(i).setRecibo(dtoRecibo);
						listasel.get(i).setCuotasPagas(listasel.size());
						listasel.get(i).setRecargoPorMora(interes);
						listasel.get(i).setBonificacion(descuentos);
						
						if(listasel.get(i).getValorOriginal() < listasel.get(i).getValorPorMora())
						{
							listasel.get(i).setValorTotalaPagar(listasel.get(i).getValorPorMora());
							
							
														
						}else 
						
						{    
							listasel.get(i).setValorTotalaPagar(listasel.get(i).getValorPorMora());
							
							
							
						} 
						
											
						
						if(listasel.get(i).getValorOriginal() < listasel.get(i).getValorPorMora())
						{
							listasel.get(i).setValorPorMora(listasel.get(i).getValorPorMora());
							
						}else 
						
						{   listasel.get(i).setValorPorMora(0f); }
						
						
																	
					}
					
					
					for(int i=0; i < listasel.size();i ++) {
						
						
						GestorBDPoliza.guardarDTOCuota(listasel.get(i));			
						
					}
					
					
					dispose();				
					RealizarPagoPolizaParte3 pago = new RealizarPagoPolizaParte3(dtopoliza,dtoOperador);
					pago.setVisible(true);
					pago.setResizable(false);
					pago.setLocationRelativeTo(null);
				
			}
		}}

		

			private int crearHoraDelDia() {
				int hora;
				
				Calendar calendario = new GregorianCalendar();
			
				hora =calendario.get(Calendar.HOUR_OF_DAY);
				
				return hora;
			}



			private Date calcularFecha() throws Exception {
				Calendar c = new GregorianCalendar();
				
				
				
				String dia = Integer.toString(c.get(Calendar.DATE));
				String mes = Integer.toString(c.get(Calendar.MONTH)+1);
				String annio = Integer.toString(c.get(Calendar.YEAR));
				String fechaActual=dia.concat("-").concat(mes).concat("-").concat(annio);
				Date date=new SimpleDateFormat("dd-MM-yyyy").parse(fechaActual);
				
				return date;
				
			}});

		JButton btnCancelar = new JButton("Cancelar");

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCancelar) {
					setVisible(false);
					dispose();
				}
			}
		});
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_6.createSequentialGroup().addContainerGap(543, Short.MAX_VALUE).addComponent(btnRegistrarPago)
						.addGap(18).addComponent(btnCancelar).addGap(23)));
		gl_panel_6
				.setVerticalGroup(
						gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addGroup(
										gl_panel_6.createSequentialGroup()
												.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnCancelar).addComponent(btnRegistrarPago))
												.addGap(33)));
		panel_6.setLayout(gl_panel_6);
		
	
		
		JButton btnBuscarPoliza = new JButton("BuscarPoliza");
		
		btnBuscarPoliza.setEnabled(false);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 759, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addComponent(label_1)
					.addGap(35)
					.addComponent(btnBuscarPoliza)
					.addContainerGap(502, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 78, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(btnBuscarPoliza))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
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
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 443, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"SELECCI\u00D3N DE CUOTAS A PAGAR:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

	
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 715, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE));

		

		panel_3.setLayout(gl_panel_3);
		
	


		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(20)
							.addComponent(lbl_NroPoliza, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_NroPoliza, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(lblVigencia, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_Desde, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_Desde, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lbl_Hasta, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_Hasta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_4, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))))
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(418, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblClientePaga, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblSumaAPagarl, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
						.addComponent(lblVueltoAlCliente, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_SumaAPagar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_ClientePaga, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_VueloAlCliente, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(98))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addComponent(panel_3, 0, 0, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbl_NroPoliza)
								.addComponent(textField_NroPoliza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(lbl_Desde)
									.addComponent(lblVigencia))
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_Desde, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lbl_Hasta)
									.addComponent(textField_Hasta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(8)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_SumaAPagar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSumaAPagarl))
					.addGap(9)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_ClientePaga, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblClientePaga))
					.addGap(20)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_VueloAlCliente, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVueltoAlCliente, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		this.getContentPane().setLayout(groupLayout);
	}
	


	private float calculo(float pagoDeCliente, float sumatotal) {
		
			return  pagoDeCliente - sumatotal;
	}



	private void construirTabla(List<DTOCuota> listaDtosCuota) {
		String[] nombresDeLasColumnasDeLaTabla = {  "Cuota/A\u00F1o", "Vencimiento", "Valor original",
				"Valor actual a pagar" };
		Object[][] informacion = obtenerMatriz(listaDtosCuota);
		tablaCuota = new JTable(informacion, nombresDeLasColumnasDeLaTabla);
		scrollPane.setViewportView(tablaCuota);

	}

	private Object[][] obtenerMatriz(List<DTOCuota> listaDtosCuota) {
		datosDeLaTabla = new Object[listaDtosCuota.size()][5];
		Calendar anio = Calendar.getInstance();
		DTOCuota c =new DTOCuota();
		
   		
        String fechaActual= formarFecha();
		
		float resultado;
		
		for (int i = 0; i < listaDtosCuota.size(); i++) {
            			
			anio.setTime(listaDtosCuota.get(i).getVencimiento());
			int year =  anio.get(Calendar.YEAR);
			
		    String nroCuota= listaDtosCuota.get(i).getIdCuotas().toString();
			String anioCuota = Integer.toString(year);
			
			String nrocuota_anio=nroCuota.concat("/").concat(anioCuota);
			datosDeLaTabla[i][0] = nrocuota_anio+ "";
			
			datosDeLaTabla[i][1] = listaDtosCuota.get(i).getVencimiento() + "";
			
			datosDeLaTabla[i][2] = listaDtosCuota.get(i).getValorOriginal()+ "";
			
			if (fechaActual.compareTo(listaDtosCuota.get(i).getVencimiento().toString()) == 1) {
				
				resultado= listaDtosCuota.get(i).getValorOriginal() + interes ;
				 
				 listaDtosCuota.get(i).setValorPorMora(resultado);
				
			
				datosDeLaTabla[i][3] = resultado + "";
				recargoPorMoraAcumulado += interes;
			 
				}
			else
				{
				resultado= listaDtosCuota.get(i).getValorOriginal() - descuentos ;
				
				
				datosDeLaTabla[i][3] = resultado + "";
				 listaDtosCuota.get(i).setValorPorMora(resultado);
				
				bonificacionAcumulado+= descuentos  ;
				
				
				}
			
			
		}
		
		
		for(int j = 0; j < listaDtosCuota.size(); j++) {
			
			
	        float r = Float.valueOf((String) datosDeLaTabla[j][3]);
		
		sumaTOTAL+= r;
		}
		
		
	    
	
		return datosDeLaTabla;	}



	private String formarFecha() {
		 Calendar c = new GregorianCalendar();
			int d,m;
			String dia,mes,annio;
			d=c.get(Calendar.DATE);
			m=c.get(Calendar.MONTH)+1;
			if (d<10) {
				
				dia = Integer.toString(c.get(Calendar.DATE));
			    dia=("0").concat(dia);
			}else 
			      dia = Integer.toString(c.get(Calendar.DATE));
			
			if (m <10) {
				
			 mes =  Integer.toString(c.get(Calendar.MONTH)+1);
			 mes=("0").concat(mes);
			}else
				mes =  Integer.toString(c.get(Calendar.MONTH)+1); 
			
			annio = Integer.toString(c.get(Calendar.YEAR));
			String fechaActual=annio.concat("-").concat(mes).concat("-").concat(dia);
			return fechaActual;
	}
}
