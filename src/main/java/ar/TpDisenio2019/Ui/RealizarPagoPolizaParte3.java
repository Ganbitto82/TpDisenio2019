package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.border.TitledBorder;

import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTOPoliza;

import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class RealizarPagoPolizaParte3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField_NroPoliza;
	private JTextField textField_Importe;
	private JTextField textField_NroRecibo;
	private JTextField textField_Premio;
	private JTextField textField_RecargoPorMor;
	private JTextField textField_Bonificacion;
	private JTextField txOperador;
	private JTextField textField_Fecha;
	private JTextField textField_Hora;
	private JList<Object> list=new JList<Object>();
	private DefaultListModel listaanio=new  DefaultListModel();
	private float premio,prima,derechoDeEmision;
	
	@SuppressWarnings("unchecked")
	public RealizarPagoPolizaParte3(DTOPoliza dtopoliza, DTOOperador dtoOperador) {
	

		this.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		this.setBounds(50, 0, 800, 730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(316, Short.MAX_VALUE).addComponent(label).addGap(311)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup().addGap(29).addComponent(label).addContainerGap(29, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(
				new TitledBorder(null, "SE HA REGISTRADO EL PAGO", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel label_NroPoliza = new JLabel("NRO DE P\u00D3LIZA:");
		label_NroPoliza.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNroRecibo = new JLabel("Nro Recibo:");
		lblNroRecibo.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblSumaAPagarl = new JLabel("IMPORTE");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		String peso="$";

		textField_NroPoliza = new JTextField();
		textField_NroPoliza.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NroPoliza.setEditable(false);
		textField_NroPoliza.setColumns(10);

		textField_NroPoliza.setText(dtopoliza.getNroPoliza().toString());

		textField_Importe = new JTextField();
		textField_Importe.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Importe.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_Importe.setEditable(false);
		textField_Importe.setColumns(10);
		
		String suma=String. valueOf(dtopoliza.getSumaTotal());
		
		textField_Importe.setText(peso.concat(suma));

		textField_Premio = new JTextField();
		textField_Premio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Premio.setEditable(false);
		textField_Premio.setColumns(10);
		
		 premio=calcularPremio(dtopoliza);
		
		 String premioString = Float.toString(premio);
		 textField_Premio.setText(peso.concat(premioString));


		textField_RecargoPorMor = new JTextField();
		textField_RecargoPorMor.setEditable(false);
		textField_RecargoPorMor.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_RecargoPorMor.setColumns(10);
		
		String s = Float.toString(dtopoliza.getRecargoPorMoraAcumulado());
        
		textField_RecargoPorMor.setText(peso.concat(s));
		
		textField_Bonificacion = new JTextField();
		textField_Bonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Bonificacion.setEditable(false);
		textField_Bonificacion.setColumns(10);
		
		String b = Float.toString(dtopoliza.getBonificacionAcumulado());
		
		textField_Bonificacion.setText(peso.concat(b));

		txOperador = new JTextField();
		txOperador.setEditable(false);
		txOperador.setColumns(10);
		
		txOperador.setText(dtoOperador.getNombre());

		JScrollPane scrollPane = new JScrollPane();
		
		textField_Fecha = new JTextField();
		textField_Fecha.setEditable(false);
		textField_Fecha.setColumns(10);
		
		String fechaDelDia = calcularFecha();
		textField_Fecha.setText(fechaDelDia);
		
		textField_Hora = new JTextField();
		textField_Hora.setEditable(false);
		textField_Hora.setColumns(10);
		
		String horaDelDia= crearHoraDelDia();
		
		textField_Hora.setText(horaDelDia);
		
		textField_NroRecibo = new JTextField();
		textField_NroRecibo.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NroRecibo.setEditable(false);
		textField_NroRecibo.setColumns(10);
		
		String numRecibo= crearNumeroRecibo(dtopoliza.getCuota().getIdCuotas());

		textField_NroRecibo.setText(numRecibo);
		
		JPanel panel_6 = new JPanel();
		

		JButton btnRegistrarPago = new JButton("Emitir Recibo de Pago");

		btnRegistrarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnRegistrarPago) {
					setVisible(false);
					dispose();
				}
			}
		});

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
				gl_panel_6.createSequentialGroup().addContainerGap(504, Short.MAX_VALUE).addComponent(btnRegistrarPago)
						.addGap(18).addComponent(btnCancelar).addContainerGap()));
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
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup().addGap(23)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 733, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel_6, 0, 0, Short.MAX_VALUE).addGap(28)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE).addGap(30)
				.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE).addContainerGap()));


		JLabel lblPremio = new JLabel("Premio:");
		lblPremio.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblRecargosPorMora = new JLabel("Recargos por mora:");
		lblRecargosPorMora.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblBonificacinPorPago = new JLabel("Bonificaci\u00F3n por pago adelantado:");
		lblBonificacinPorPago.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblOperador = new JLabel("Operador:");
		lblOperador.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblMesAo = new JLabel("Mes / A\u00F1o abonado:");
		lblMesAo.setFont(new Font("Tahoma", Font.PLAIN, 11));


		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSumaAPagarl, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_NroPoliza, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNroRecibo, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMesAo)
						.addComponent(lblOperador, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(txOperador, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_Importe, 0, 0, Short.MAX_VALUE)
								.addComponent(lblPremio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRecargosPorMora)
								.addComponent(lblBonificacinPorPago)
								.addComponent(textField_NroPoliza, 163, 163, 163)
								.addComponent(textField_NroRecibo, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_RecargoPorMor, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_Premio, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_Bonificacion, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
									.addGap(342))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
									.addGap(4)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_Fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_Hora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(50)))))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFecha)
								.addComponent(textField_Fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHora)
								.addComponent(textField_Hora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_NroPoliza)
								.addComponent(textField_NroPoliza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNroRecibo)
								.addComponent(textField_NroRecibo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSumaAPagarl)
						.addComponent(textField_Importe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPremio)
								.addComponent(textField_Premio, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRecargosPorMora)
								.addComponent(textField_RecargoPorMor, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBonificacinPorPago)
								.addComponent(textField_Bonificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(85))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOperador)
								.addComponent(txOperador, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(32)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesAo)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(60, Short.MAX_VALUE))
		);

		list.setModel( listaanio);
        Calendar mes = Calendar.getInstance();
        Calendar anio= Calendar.getInstance();
		
		 int year,month;
		 String a,m,m_a;
		 
		 
		 for(DTOCuota c: dtopoliza.getListadtocuotaSeleccionada()) {
			 anio.setTime(c.getVencimiento());
			 mes.setTime(c.getVencimiento());
			 year = anio.get(Calendar.YEAR);
			 month= mes.get(Calendar.MONTH);
			 a = Integer.toString(year);
			 m=  Integer.toString(month+1);
			 m_a=m.concat("/").concat(a);
			 listaanio.addElement(m_a);
			 
		 }
		 
		
	
		
		scrollPane.setViewportView(list);
		panel_2.setLayout(gl_panel_2);
		this.getContentPane().setLayout(groupLayout);
	}

	private float calcularPremio(DTOPoliza dtopoliza) {
		float tasaDerechoDeEmision; 
		prima=dtopoliza.getFactoresusados().getPrima();
		tasaDerechoDeEmision=  dtopoliza.getParametrosgenerales().getDerechosDeEmision();
		derechoDeEmision=prima*(tasaDerechoDeEmision/100);
         premio=prima + derechoDeEmision;
         return premio ;
	}

	private String crearHoraDelDia() {
		Calendar calendario = new GregorianCalendar();
		
		int hora ,minutos;
		
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		String h=Integer.toString(hora);
		String m=Integer.toString(minutos);
		String horaMinutos=h.concat(":").concat(m);
		return horaMinutos;
	}

	private String calcularFecha() {
Calendar c = new GregorianCalendar();
		
		
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		
		String fecha = dia.concat("-").concat(mes).concat("-").concat(annio);
		return fecha;
	}

	private String crearNumeroRecibo(int valorIDCuota) {
		String v=Integer.toString(valorIDCuota);
		String r="00";
		return r.concat(v);
	}
}
