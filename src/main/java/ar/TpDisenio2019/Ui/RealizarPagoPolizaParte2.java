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

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

public class RealizarPagoPolizaParte2 extends JFrame {

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
	private JTextField textField_1;
	private JTextField textField_2;

	public RealizarPagoPolizaParte2(DTOPoliza dtopoliza) {
		

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

		JLabel label_7 = new JLabel("NRO DE P\u00D3LIZA:");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);

		JLabel label_8 = new JLabel("VIGENCIA:");

		JLabel label_9 = new JLabel("Desde:");

		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setEditable(false);

		JLabel label_10 = new JLabel("Hasta:");

		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setEditable(false);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DEL VEH\u00CDCULO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_11 = new JLabel("Marca:");

		txtAaaaaaaaaaaaaa = new JTextField();
		txtAaaaaaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaaaaaa.setColumns(10);

		JLabel label_12 = new JLabel("Modelo:");

		txtAaaaaaaaaaaaaaa_1 = new JTextField();
		txtAaaaaaaaaaaaaaa_1.setEditable(false);
		txtAaaaaaaaaaaaaaa_1.setColumns(10);

		JLabel label_13 = new JLabel("Patente:");

		txtAaaaa = new JTextField();
		txtAaaaa.setEditable(false);
		txtAaaaa.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtAaaaaaaaaaaaaa, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE).addGap(18)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtAaaaaaaaaaaaaaa_1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(label_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtAaaaa, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_4
				.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(label_11)
										.addComponent(txtAaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_13)
										.addComponent(txtAaaaa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_12).addComponent(txtAaaaaaaaaaaaaaa_1,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(16, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TITULAR DEL SEGURO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_14 = new JLabel("Nro Cliente:");

		nroCliente = new JTextField();
		nroCliente.setEditable(false);
		nroCliente.setColumns(10);

		JLabel label_15 = new JLabel("Apellido:");

		txtAaaaaaaaaa = new JTextField();
		txtAaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaa.setColumns(10);

		JLabel label_16 = new JLabel("Nombre:");

		txtAaaaaaaaaaaaaaa = new JTextField();
		txtAaaaaaaaaaaaaaa.setEditable(false);
		txtAaaaaaaaaaaaaaa.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(6)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(label_15).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtAaaaaaaaaa, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE).addGap(33)
						.addComponent(label_16).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtAaaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGap(20)));
		gl_panel_5
				.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(label_14)
										.addComponent(txtAaaaaaaaaaaaaaa, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_16)
										.addComponent(txtAaaaaaaaaa, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_15).addComponent(nroCliente, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(16, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);

		JLabel lblSumaAPagarl = new JLabel("Suma a Pagar:");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setEditable(false);
		textField_7.setColumns(10);

		JPanel panel_6 = new JPanel();

		JButton btnRegistrarPago = new JButton("Registrar Pago");

		btnRegistrarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnRegistrarPago) {
					RealizarPagoPolizaParte3 pago = new RealizarPagoPolizaParte3();
					pago.setVisible(true);
					pago.setResizable(false);
					pago.setLocationRelativeTo(null);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel label_1 = new JLabel("Seleccione una Poliza");
		
		JButton button = new JButton("BuscarPoliza");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 759, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addComponent(label_1)
					.addGap(35)
					.addComponent(button)
					.addContainerGap(502, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 78, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(button))
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

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 715, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE));

		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		table.setModel(new DefaultTableModel(
				new Object[][] { { "001/19", "16/01/2019", "555,55", "650,50" },
						{ "002/19", "15/02/2019", "555,55", "625,25" }, { "003/19", "16/03/2019", "555,55", "600,00" },
						{ "004/19", "15/04/2019", "555,55", "575,75" }, },
				new String[] { "Cuota/A\u00F1o", "Vencimiento", "Valor original", "Valor actual a pagar" }));
		table.setToolTipText("");

		scrollPane.setViewportView(table);

		panel_3.setLayout(gl_panel_3);

		JLabel lblClientePaga = new JLabel("Cliente Paga:");
		lblClientePaga.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setEditable(false);
		textField_2.setColumns(10);

		JLabel lblVueltoAlCliente = new JLabel("Vuelto al Cliente:");
		lblVueltoAlCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_2
				.createSequentialGroup()
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2.createSequentialGroup()
						.addGap(20).addComponent(label_7, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE).addGap(57)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE).addGap(4)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(label_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(4)
						.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(panel_4, Alignment.LEADING, 0, 0, Short.MAX_VALUE).addComponent(
												panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 742,
												Short.MAX_VALUE))))
				.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap(418, Short.MAX_VALUE).addGroup(gl_panel_2
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblVueltoAlCliente, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblClientePaga, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblSumaAPagarl, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
						.addGap(18)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGap(98))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup().addGap(12)
						.addComponent(panel_3, 0, 0, Short.MAX_VALUE).addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addContainerGap()
				.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(16)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(label_7)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(18)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup().addGap(6)
												.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
														.addComponent(label_9).addComponent(label_8)))
										.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_2.createSequentialGroup().addGap(6).addComponent(label_10))
										.addGroup(gl_panel_2.createSequentialGroup().addGap(1).addComponent(
												formattedTextField_2, GroupLayout.PREFERRED_SIZE, 24,
												GroupLayout.PREFERRED_SIZE)))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSumaAPagarl))
				.addGap(9)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblClientePaga))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVueltoAlCliente, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		panel_2.setLayout(gl_panel_2);
		this.getContentPane().setLayout(groupLayout);
	}
}
