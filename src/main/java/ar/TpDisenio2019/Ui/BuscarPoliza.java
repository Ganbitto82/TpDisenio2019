package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.Controladores.GestorPoliza;

import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTOPoliza;

import ar.TpDisenio2019.Utilitario.Validaciones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarPoliza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nroPoliza;
	private JTextField textField_NroCliente;
	private JTextField textField_Apellido;
	private JTextField textField_TipoDoc;
	private JTextField textField_FechaPago;
	private JTextField textField_NumeroPoliza;
	private JTextField textField_Nombre;
	private JTextField textField_NumDoc;
	private JTextField textField_Monto;
	private DTOPoliza dtopoliza = new DTOPoliza();
	private DTOCuota dtocuota = new DTOCuota();
	private List<DTOCuota> listaDtoCuota = new ArrayList<DTOCuota>();

	private JLabel lblFormatoDig;

	public BuscarPoliza(DTOOperador dtoOperador) {


		dtopoliza=null;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 784, 83);
		contentPane.add(panel);
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 784, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addGap(314).addComponent(label).addContainerGap(313,
						Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING).addGap(0, 83, Short.MAX_VALUE).addGroup(gl_panel
						.createSequentialGroup().addContainerGap(33, Short.MAX_VALUE).addComponent(label).addGap(25)));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 94, 736, 191);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 23, 701, 91);
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "POLIZA",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		nroPoliza = new JTextField();

		nroPoliza.setBounds(281, 39, 158, 20);
		panel_2.add(nroPoliza);
		nroPoliza.setColumns(10);

		JLabel lblNumeroDePoliza = new JLabel("Numero de Poliza");
		lblNumeroDePoliza.setBounds(106, 42, 121, 14);
		panel_2.add(lblNumeroDePoliza);

		JLabel lblJlabelLblformatodig = new JLabel(
				"Formato 4 digitos para sucursal, 7 Digitos corresponde a la solicitud de poliza y 2 digitos para renovacion de poliza");
		lblJlabelLblformatodig.setForeground(Color.RED);
		lblJlabelLblformatodig.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblJlabelLblformatodig.setBackground(Color.BLACK);
		lblJlabelLblformatodig.setVisible(false);
		lblJlabelLblformatodig.setBounds(54, 67, 624, 14);

		panel_2.add(lblJlabelLblformatodig);

		nroPoliza.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String numeroPoliza = nroPoliza.getText();

				if (numeroPoliza.compareTo(" ") != 0) {
					if (Validaciones.validarNumeroDePoliza(numeroPoliza) != true) {
						lblJlabelLblformatodig.setVisible(true);
					}
				}
			}

			public void focusGained(FocusEvent arg0) {
				lblJlabelLblformatodig.setVisible(false);
			}
		});

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(643, 145, 89, 23);
		panel_1.add(btnBuscar);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(26, 303, 736, 314);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel label_1 = new JLabel("Numero de Cliente");
		label_1.setBounds(66, 53, 134, 14);
		panel_3.add(label_1);

		JLabel label_2 = new JLabel("Apellido");
		label_2.setBounds(66, 119, 125, 14);
		panel_3.add(label_2);

		JLabel label_3 = new JLabel("Tipo de Documento");
		label_3.setBounds(66, 184, 143, 14);
		panel_3.add(label_3);

		JLabel lblUltimaFechaDe = new JLabel("Ultima Fecha de Pago");
		lblUltimaFechaDe.setBounds(66, 245, 125, 14);
		panel_3.add(lblUltimaFechaDe);

		JLabel label_5 = new JLabel("Numero de Poliza");
		label_5.setBounds(395, 53, 153, 14);
		panel_3.add(label_5);

		JLabel label_6 = new JLabel("Nombre");
		label_6.setBounds(395, 119, 153, 14);
		panel_3.add(label_6);

		JLabel label_7 = new JLabel("Numero De Documento");
		label_7.setBounds(395, 184, 170, 14);
		panel_3.add(label_7);

		JLabel label_Monto = new JLabel("Monto");
		label_Monto.setBounds(395, 245, 170, 14);
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

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long numeroPoliza;
				String numPoliza = nroPoliza.getText();

				
				if (numPoliza.compareTo("  ") == 0)

					numeroPoliza = 0L;

				else if (Validaciones.validarNumeroDePoliza(numPoliza) != true) {

					numeroPoliza = 0L;

				} else {
					numeroPoliza = Long.parseLong(numPoliza);
				}

				
				if (numeroPoliza.equals(0L)) {

					JOptionPane.showMessageDialog(null, "Ingrese el numero de poliza correcto para buscar la póliza.",
							"Alerta", JOptionPane.INFORMATION_MESSAGE);
				} else {

					dtopoliza = GestorPoliza.buscarPoliza(numeroPoliza);

					if (dtopoliza == null) {
						JOptionPane.showMessageDialog(null, "No existe póliza con el número ingresado", "Busqueda",
								JOptionPane.INFORMATION_MESSAGE);
						dispose();
						BuscarPoliza bp = new BuscarPoliza(dtoOperador);
						bp.setVisible(true);
						bp.setResizable(false);
						bp.setLocationRelativeTo(null);
						
					} else {
						if (dtopoliza.getFormasdepago().getNombre().equals("MENSUAL")) {
                            
													
							listaDtoCuota.add(dtopoliza.getCuota());
							

							for (int i = dtopoliza.getCuota().getIdCuotas() + 1; i < dtopoliza.getCuota().getIdCuotas()+ 6; i++) {

								dtocuota = GestorPoliza.buscarPorId(i);

								listaDtoCuota.add(dtocuota);
							}
							
							List<DTOCuota> listaFechaRecibo = new ArrayList<DTOCuota>();
							
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
							
							}else { 
								
								
								textField_FechaPago.setText(" / /  ");
								String pesos="$";
								String monto =" 0 " ;
								String resultado=  (pesos.concat(monto));
								textField_Monto.setText(resultado);
								
							}
							
							dtopoliza.setListadtocuota(listaDtoCuota);
							
							

						} else {
							
							listaDtoCuota.add(dtopoliza.getCuota());
							
														
							if(dtopoliza.getCuota().getRecibo().getNroRecibo()!=null) {
						    String monto= dtopoliza.getCuota().getRecibo().getImporteTotal().toString();
						    String pesos="$";
							String resultado=  pesos.concat(monto);
							textField_FechaPago.setText(dtopoliza.getCuota().getRecibo().getFecha().toString());
							textField_Monto.setText(resultado);
							
							
							}
							else {

								textField_FechaPago.setText(" / /  ");
								String pesos="$";
								String monto =" 0 " ;
								String resultado=  (pesos.concat(monto));
								textField_Monto.setText(resultado);		
								
								
							}
							
							dtopoliza.setListadtocuota(listaDtoCuota);

						}
						textField_NroCliente.setText(dtopoliza.getCliente().getNroCliente().toString());
						textField_NumeroPoliza.setText(dtopoliza.getNroPoliza().toString());
						textField_Apellido.setText(dtopoliza.getCliente().getApellido());
						textField_Nombre.setText(dtopoliza.getCliente().getNombre());
						textField_TipoDoc.setText(dtopoliza.getCliente().getTipodedocumento().getNombre());
						textField_NumDoc.setText(dtopoliza.getCliente().getNroDocumento().toString());

					}

				}

			}
		});

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAceptar ) {

					try {

						if (dtopoliza == null)
							JOptionPane.showMessageDialog(null, "Debe ingresar un numero de poliza para su busqueda", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						else {

							dispose();
							RealizarPagoPoliza pago = new RealizarPagoPoliza(dtopoliza,dtoOperador);
							pago.setVisible(true);
							pago.setResizable(false);
							pago.setLocationRelativeTo(null);

								}
							}

							
						

					catch (Exception e1) {

					}
				}
				
				
				
				

			}
		});
		btnAceptar.setBounds(508, 637, 89, 23);
		getContentPane().add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");

		btnCancelar .addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				hide();
			}
		});
		
		btnCancelar.setBounds(652, 637, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
