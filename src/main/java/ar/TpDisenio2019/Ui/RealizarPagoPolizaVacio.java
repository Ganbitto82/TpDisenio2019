package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ar.TpDisenio2019.DTO.DTOPoliza;

import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;

public class RealizarPagoPolizaVacio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	DTOPoliza dtopoliza = null;

	public RealizarPagoPolizaVacio(DTOPoliza dtopoliza) {
		initialize();
	}

	private void initialize() {

		this.setTitle("El Asegurado - Realizar el Pago de P\u00F3liza");
		this.setBounds(0, 0, 800, 730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(328, Short.MAX_VALUE).addComponent(label).addGap(299)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE).addComponent(label).addGap(23)));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JLabel lblIngreseLaPliza = new JLabel("Seleccione una Poliza");

		JButton buttonBuscarPoliza = new JButton("Buscar Poliza");

		buttonBuscarPoliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonBuscarPoliza) {
					BuscarPoliza bp = new BuscarPoliza();
					bp.setVisible(true);
					bp.setResizable(false);
					bp.setLocationRelativeTo(null);
				}
			}
		});

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(32)
						.addComponent(lblIngreseLaPliza, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(buttonBuscarPoliza).addContainerGap(481, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1
						.createSequentialGroup().addGap(28).addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIngreseLaPliza).addComponent(buttonBuscarPoliza))
						.addContainerGap(23, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

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

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);

		JLabel label_12 = new JLabel("Modelo:");

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);

		JLabel label_13 = new JLabel("Patente:");

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE).addGap(18)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(label_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_3,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_4
				.setVerticalGroup(
						gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
												.addComponent(label_11)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_13)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_12).addComponent(textField_2,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(16, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TITULAR DEL SEGURO",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel label_14 = new JLabel("Nro Cliente:");

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);

		JLabel label_15 = new JLabel("Apellido:");

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);

		JLabel label_16 = new JLabel("Nombre:");

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(6)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addGap(25).addComponent(label_15).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE).addGap(37)
						.addComponent(label_16).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addGap(34)));
		gl_panel_5
				.setVerticalGroup(
						gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
												.addComponent(label_14)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_15)
												.addComponent(textField_6, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_16).addComponent(textField_4,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(16, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);

		JLabel lblSumaAPagarl = new JLabel("Suma a Pagar:");
		lblSumaAPagarl.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField_7 = new JTextField();
		textField_7.setText("$0,00");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setEditable(false);
		textField_7.setColumns(10);

		JPanel panel_6 = new JPanel();

		JButton btnConfirmar = new JButton("Confirmar Pago");
		btnConfirmar.setEnabled(false);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConfirmar) {

					RealizarPagoPoliza pago = new RealizarPagoPoliza(dtopoliza);
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
				gl_panel_6.createSequentialGroup().addContainerGap(531, Short.MAX_VALUE).addComponent(btnConfirmar)
						.addGap(18).addComponent(btnCancelar).addGap(31)));
		gl_panel_6.setVerticalGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_6
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(gl_panel_6
						.createParallelGroup(Alignment.BASELINE).addComponent(btnCancelar).addComponent(btnConfirmar))
				.addGap(33)));
		panel_6.setLayout(gl_panel_6);
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup().addGap(10)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE).addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE).addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE).addGap(18)
				.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE).addContainerGap()));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CUOTAS PENDIENTES DE PAGO:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 715, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(
				gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE).addContainerGap()));

		table = new JTable();

		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Cuotas a Pagar", "Cuota/A\u00F1o", "Vencimiento", "Valor original",
						"Valor actual a pagar" }));
		table.getColumnModel().getColumn(4).setPreferredWidth(123);
		table.setToolTipText("");

		scrollPane.setViewportView(table);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup()
				.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, gl_panel_2
						.createSequentialGroup().addGap(20)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE).addGap(68)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE).addGap(26)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(label_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING,
								gl_panel_2.createSequentialGroup().addContainerGap().addComponent(panel_5,
										GroupLayout.PREFERRED_SIZE, 742, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(panel_4, 0, 0, Short.MAX_VALUE).addGap(12))
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(panel_3, 0, 0, Short.MAX_VALUE).addGap(12))
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup().addContainerGap(461, Short.MAX_VALUE)
						.addComponent(lblSumaAPagarl, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addGap(4).addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(92)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addContainerGap()
				.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(11)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup().addGap(5).addComponent(label_7))
										.addGroup(gl_panel_2.createSequentialGroup().addGap(6).addGroup(gl_panel_2
												.createParallelGroup(Alignment.BASELINE).addComponent(label_9)
												.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
														.addComponent(formattedTextField_2, GroupLayout.DEFAULT_SIZE,
																22, Short.MAX_VALUE)
														.addComponent(label_10))
												.addComponent(label_8))))
								.addGap(2))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(13).addComponent(textField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(18).addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE).addGap(18)
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(3).addComponent(lblSumaAPagarl))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(15)));
		panel_2.setLayout(gl_panel_2);
		this.getContentPane().setLayout(groupLayout);

	}
}
