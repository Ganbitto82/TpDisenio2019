package ar.TpDisenio2019.Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.border.TitledBorder;

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class RealizarPagoPolizaParte3 {

	private JFrame frmElAsegurado;
	private JTextField textField;
	private JTextField txtAaaaaaaaaaaaaa;
	private JTextField txtAaaaaaaaaaaaaaa_1;
	private JTextField txtAaaaa;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtMaraMontenegro;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarPagoPolizaParte3 window = new RealizarPagoPolizaParte3();
					window.frmElAsegurado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealizarPagoPolizaParte3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElAsegurado = new JFrame();
		frmElAsegurado.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		frmElAsegurado.setBounds(50, 0, 800, 730);
		frmElAsegurado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(316, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(311))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addComponent(label)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "SE HA REGISTRADO EL PAGO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label_7 = new JLabel("NRO DE P\u00D3LIZA:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setText("9999-9999999-99");
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblNroRecibo = new JLabel("Nro Recibo:");
		lblNroRecibo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("14/05/2019");
		formattedTextField_1.setEditable(false);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("11:06");
		formattedTextField_2.setEditable(false);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DEL VEH\u00CDCULO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_11 = new JLabel("Marca:");
		
		txtAaaaaaaaaaaaaa = new JTextField();
		txtAaaaaaaaaaaaaa.setText("AAAAAAAAAAAAAA");
		txtAaaaaaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaaaaaa.setColumns(10);
		
		JLabel label_12 = new JLabel("Modelo:");
		
		txtAaaaaaaaaaaaaaa_1 = new JTextField();
		txtAaaaaaaaaaaaaaa_1.setText("AAAAAAAAAAAAAAA");
		txtAaaaaaaaaaaaaaa_1.setEditable(false);
		txtAaaaaaaaaaaaaaa_1.setColumns(10);
		
		JLabel label_13 = new JLabel("Patente:");
		
		txtAaaaa = new JTextField();
		txtAaaaa.setText("AA-AAA-99");
		txtAaaaa.setEditable(false);
		txtAaaaa.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAaaaaaaaaaaaaa, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAaaaaaaaaaaaaaa_1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(txtAaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13)
						.addComponent(txtAaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12)
						.addComponent(txtAaaaaaaaaaaaaaa_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel lblSumaAPagarl = new JLabel("IMPORTE");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_7 = new JTextField();
		textField_7.setText("$2451,50");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		
		JButton btnRegistrarPago = new JButton("Emitir Recibo de Pago");
		
		JButton button_3 = new JButton("Cancelar");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addContainerGap(504, Short.MAX_VALUE)
					.addComponent(btnRegistrarPago)
					.addGap(18)
					.addComponent(button_3)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3)
						.addComponent(btnRegistrarPago))
					.addGap(33))
		);
		panel_6.setLayout(gl_panel_6);
		GroupLayout groupLayout = new GroupLayout(frmElAsegurado.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 733, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_6, 0, 0, Short.MAX_VALUE)
					.addGap(28))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
					.addGap(30)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("99999999999");
		textField_3.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setText("$2222,20");
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setText("$245,45");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setEditable(false);
		textField_5.setText("$0,00");
		textField_5.setColumns(10);
		
		txtMaraMontenegro = new JTextField();
		txtMaraMontenegro.setEditable(false);
		txtMaraMontenegro.setText("MAR\u00CDA MONTENEGRO");
		txtMaraMontenegro.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSumaAPagarl, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNroRecibo, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMesAo)
								.addComponent(lblOperador, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMaraMontenegro, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_7, 0, 0, Short.MAX_VALUE)
										.addComponent(lblPremio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblRecargosPorMora)
										.addComponent(lblBonificacinPorPago)
										.addComponent(textField, 163, 163, 163)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
											.addGap(342))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
											.addGap(4)
											.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(formattedTextField_2, Alignment.LEADING)
												.addComponent(formattedTextField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
											.addGap(102)))))))
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
								.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFecha))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHora)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_7)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNroRecibo)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSumaAPagarl)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPremio)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRecargosPorMora)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBonificacinPorPago)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(85))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblOperador)
										.addComponent(txtMaraMontenegro, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(32)))
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMesAo)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"01 / 2019", "02 / 2019", "03 / 2019", "04 / 2019"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		panel_2.setLayout(gl_panel_2);
		frmElAsegurado.getContentPane().setLayout(groupLayout);
	}
}
