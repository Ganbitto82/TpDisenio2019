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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Utilitario.Celda_CheckBox;
import ar.TpDisenio2019.Utilitario.Render_CheckBox;

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

public class RealizarPagoPoliza extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private JTextField txtAaaaaaaaaaaaaa;
	private JTextField txtAaaaaaaaaaaaaaa_1;
	private JTextField txtAaaaa;
	private JTextField nroCliente;
	private JTextField txtAaaaaaaaaa;
	private JTextField txtAaaaaaaaaaaaaaa;
	private JTextField textField_7;
	private JTable table;
	private JTextField txtDni;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public RealizarPagoPoliza(DTOPoliza dtopoliza) {
		initialize();
	}


	private void initialize() {
	
		this.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		this.setBounds(100, 0, 800, 730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(317, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(310))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblIngreseLaPliza = new JLabel("Ingrese la p\u00F3liza para la cual quiera registrar el pago:");
		
		JLabel label_6 = new JLabel("Nro. P\u00F3liza:");
		
		JFormattedTextField nroPolizaTextField = new JFormattedTextField((Object) null);
		nroPolizaTextField.setText("9999-9999999-99");
		nroPolizaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nroPolizaTextField.setForeground(Color.BLACK);
		
		JButton button_buscar = new JButton("Buscar");
		button_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_buscar) {

						
							
					}
				}

		});		
		
		JButton button_cancelar = new JButton("Cancelar");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIngreseLaPliza)
					.addGap(18)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(nroPolizaTextField, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(button_buscar)
					.addGap(18)
					.addComponent(button_cancelar)
					.addGap(22))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 54, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_cancelar)
						.addComponent(button_buscar))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(nroPolizaTextField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIngreseLaPliza))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		
		JLabel label_7 = new JLabel("NRO DE P\u00D3LIZA:");
		
		textField = new JTextField();
		textField.setText("9999-9999999-99");
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel label_8 = new JLabel("VIGENCIA:");
		
		JLabel label_9 = new JLabel("Desde:");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("15/01/2019");
		formattedTextField_1.setEditable(false);
		
		JLabel label_10 = new JLabel("Hasta:");
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("15/06/2019");
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
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label_14 = new JLabel("Nro Cliente:");
		
		nroCliente = new JTextField();
		nroCliente.setText("99-9999999");
		nroCliente.setEditable(false);
		nroCliente.setColumns(10);
		
		JLabel label_15 = new JLabel("Apellido:");
		
		txtAaaaaaaaaa = new JTextField();
		txtAaaaaaaaaa.setText("AAAAAAAAAA");
		txtAaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaa.setColumns(10);
		
		JLabel label_16 = new JLabel("Nombre:");
		
		txtAaaaaaaaaaaaaaa = new JTextField();
		txtAaaaaaaaaaaaaaa.setText("AAAAAAAAAAAAAAA");
		txtAaaaaaaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaaaaaaa.setColumns(10);
		
		JLabel lblTipoDocumento = new JLabel("Tipo Documento:");
		
		txtDni = new JTextField();
		txtDni.setText("DNI");
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		
		JLabel lblNroDocumento = new JLabel("Nro. Documento:");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("99999999");
		textField_1.setColumns(10);
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
						.addComponent(txtAaaaaaaaaa, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
						.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(18)
							.addComponent(label_16)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtAaaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(16)
							.addComponent(lblTipoDocumento, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNroDocumento)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTipoDocumento)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNroDocumento)
							.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_14))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_16)
								.addComponent(txtAaaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAaaaaaaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel lblSumaAPagarl = new JLabel("Suma a Pagar:");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_7 = new JTextField();
		textField_7.setText("$2451,50");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 759, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 517, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CUOTAS PENDIENTES DE PAGO:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 715, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		table.setModel(new DefaultTableModel(
									
				new Object[][] {
					{true, "001/19", "16/01/2019", "555,55", "650,50"},
					{true, "002/19", "15/02/2019", "555,55", "625,25"},
					{true, "003/19", "16/03/2019", "555,55", "600,00"},
					{true, "004/19", "15/04/2019", "555,55", "575,75"},
					{false, "005/19", "16/05/2019", "555,55", "555,55"},
					{false, "006/19", "15/06/2019", "555,55", "525,25"},
					{false, "007/19", "16/07/2019", "555,55", "500,00"},
				},
				
				new String[] {
					"Cuotas a Pagar", "Cuota/A\u00F1o", "Vencimiento", "Valor original", "Valor actual a pagar"
				}
			));
			table.getColumnModel().getColumn(4).setPreferredWidth(123);
			table.setToolTipText("");
			
			//Se crea el JCheckBox en la columna indicada en getColumn, en este caso, la primera columna
	        table.getColumnModel().getColumn( 0 ).setCellEditor( new Celda_CheckBox() );
	        //para pintar la columna con el CheckBox en la tabla, en este caso, la primera columna
	        table.getColumnModel().getColumn( 0 ).setCellRenderer(new Render_CheckBox());
			
		scrollPane.setViewportView(table);
		
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u00DALTIMO PAGO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnConfirmar = new JButton("Confirmar Pago");
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConfirmar)
				{
					RealizarPagoPolizaParte2 pago = new RealizarPagoPolizaParte2();
					pago.setVisible(true);
					pago.setResizable(false);
					pago.setLocationRelativeTo(null);
				}
			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCancelar)
				{
					setVisible(false);
					dispose();
				}
			}
		});
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, 0, 0, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(472, Short.MAX_VALUE)
					.addComponent(lblSumaAPagarl, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(557, Short.MAX_VALUE)
					.addComponent(btnConfirmar)
					.addGap(10)
					.addComponent(btnCancelar)
					.addGap(23))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(6)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_10)
							.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_9)
							.addComponent(label_8))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(label_7)))
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSumaAPagarl))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConfirmar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		
		JLabel lblFechaDePago = new JLabel("Fecha de pago:");
		
		textField_2 = new JTextField();
		textField_2.setText("15/12/2018");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JLabel lblMes = new JLabel("Mes:");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("12");
		textField_3.setColumns(10);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		
		textField_4 = new JTextField();
		textField_4.setText("2018");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JLabel lblMonto = new JLabel("Monto:");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setText("$555,55");
		textField_5.setColumns(10);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addComponent(lblFechaDePago, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblMes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblMonto, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(207, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaDePago)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMes)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAo)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMonto)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);
		panel_2.setLayout(gl_panel_2);
		this.getContentPane().setLayout(groupLayout);
	}
}
