package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOMedidasdeseguridad;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.DTO.DTOVehiculo;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;
import ar.TpDisenio2019.Modelo.Formasdepago;

import javax.swing.border.EtchedBorder;

public class darDeAltaPoliza1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_fecha;
	private JTable table;
	private JTable table_1;
	
	private List<DTOFormasdepago> dtoListaFormaDePago;
	private List<DTOTipocobertura> dtoListaTipodeCobertura;
	
	private DTOTipocobertura dtoTipoCobertura = new DTOTipocobertura();
	private DTOFormasdepago dtoFormadepago = new DTOFormasdepago();
	
	private JComboBox<String> tipoCobertura_comboBox;
	private JComboBox<String> formaDePago_comboBox;
	
	public darDeAltaPoliza1(DTOCliente dtocliente, DTOPoliza dtoPoliza, DTOVehiculo dtoVehiculo, DTOMedidasdeseguridad dtoMedidasSeguridad, DTOCuota dtoCuota) {
		setTitle("Dar de alta P\u00F3liza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setToolTipText("Tipos de coberturas");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 105, 829, 294);
		panel_1.setBorder(new TitledBorder(null, "TIPOS DE COBERTURAS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("Tipos de coberturas");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 405, 829, 281);
		panel_3.setToolTipText("Tipos de coberturas");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMPLETE LOS SIGUIENTES DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblCamposObligatorios = new JLabel("(*) Campos Obligatorios.");
				
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(43)
					.addComponent(lblCamposObligatorios)
					.addPreferredGap(ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
					.addComponent(confirmar)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(32))
				.addComponent(panel_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 829, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(confirmar)
							.addComponent(btnCancelar))
						.addComponent(lblCamposObligatorios))
					.addContainerGap())
		);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{137, 156, 52, 116, 109, 0, 108, 0, 0, 90, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{44, 44, 44, 41, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		formaDePago_comboBox = new JComboBox<String>();
		formaDePago_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_formaDePago_comboBox = new GridBagConstraints();
		formaDePago_comboBox.addItem(" --Seleccione-- ");
		
		JLabel lblTipoDeCovertura = new JLabel("Tipo de cobertura(*):");
		lblTipoDeCovertura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTipoDeCovertura = new GridBagConstraints();
		gbc_lblTipoDeCovertura.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeCovertura.anchor = GridBagConstraints.WEST;
		gbc_lblTipoDeCovertura.gridx = 1;
		gbc_lblTipoDeCovertura.gridy = 1;
		panel_4.add(lblTipoDeCovertura, gbc_lblTipoDeCovertura);
		
		tipoCobertura_comboBox = new JComboBox<String>();
		tipoCobertura_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tipoCobertura_comboBox.setForeground(Color.BLACK);
		tipoCobertura_comboBox.setBackground(Color.WHITE);
		tipoCobertura_comboBox.addItem(" --Seleccione-- ");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		panel_4.add(tipoCobertura_comboBox, gbc_comboBox);
		
		JLabel lblFormaDePago = new JLabel("Forma de Pago(*):");
		lblFormaDePago.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFormaDePago = new GridBagConstraints();
		gbc_lblFormaDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormaDePago.anchor = GridBagConstraints.WEST;
		gbc_lblFormaDePago.gridx = 1;
		gbc_lblFormaDePago.gridy = 2;
		panel_4.add(lblFormaDePago, gbc_lblFormaDePago);
		gbc_formaDePago_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_formaDePago_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_formaDePago_comboBox.gridx = 3;
		gbc_formaDePago_comboBox.gridy = 2;
		panel_4.add(formaDePago_comboBox, gbc_formaDePago_comboBox);
		formaDePago_comboBox.setForeground(Color.BLACK);
		formaDePago_comboBox.setBackground(Color.WHITE);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio de Vigencia(*):");
		lblFechaDeInicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFechaDeInicio = new GridBagConstraints();
		gbc_lblFechaDeInicio.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeInicio.insets = new Insets(0, 0, 0, 5);
		gbc_lblFechaDeInicio.gridx = 1;
		gbc_lblFechaDeInicio.gridy = 3;
		panel_4.add(lblFechaDeInicio, gbc_lblFechaDeInicio);
		
		textField_fecha = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		panel_4.add(textField_fecha, gbc_textField);
		textField_fecha.setColumns(10);
		panel_3.setLayout(gl_panel_3);
		
		dtoListaTipodeCobertura = GestorListasDesplegables.buscarDtosTipocobertura();
		dtoListaFormaDePago = GestorListasDesplegables.buscarDtosFormaDePago();
		
		for(DTOTipocobertura cobertura : dtoListaTipodeCobertura) 
		
			tipoCobertura_comboBox.addItem(cobertura.getTipo().toString());
		
		for(DTOFormasdepago formaDePago : dtoListaFormaDePago) 
		
			formaDePago_comboBox.addItem(formaDePago.getNombre().toString());
		
		confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == confirmar)
				{
					String formaDePago = formaDePago_comboBox.getSelectedItem().toString();
					String tipoCobertura = tipoCobertura_comboBox.getSelectedItem().toString();
					String fecha = textField_fecha.getText();
					
					if(formaDePago.equals(" --Seleccione-- ") || tipoCobertura.equals(" --Seleccione-- "))
					{						
						if(formaDePago.equals(" --Seleccione-- "))
						{
							lblFormaDePago.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						}
						else 
						{
							lblFormaDePago.setForeground(Color.black);
							dtoFormadepago.setNombre(formaDePago);
						}
						if(tipoCobertura.equals(" --Seleccione-- "))
						{
							lblTipoDeCovertura.setForeground(Color.red);
							lblCamposObligatorios.setForeground(Color.red);
						}
						else 
						{
							lblTipoDeCovertura.setForeground(Color.black);
							dtoTipoCobertura.setTipo(tipoCobertura);
						}
					}
					else 
					{
						//Date f = Date.parse(fecha);
						dtoPoliza.setFormasdepago(dtoFormadepago);
					//	dtoPoliza.setTipoCobertura(dtoTipoCobertura);
						//dtoPoliza.setFechaInicioVigencia(fecha);
						
						System.out.println("-------------");
						System.out.println(dtoPoliza.getFormasdepago().getNombre());
						lblCamposObligatorios.setForeground(Color.black);
						dispose();
						darDeAltaPoliza3 b = new darDeAltaPoliza3(dtocliente, dtoPoliza, dtoVehiculo, dtoMedidasSeguridad, dtoCuota);
						b.setVisible(true);
						b.setResizable(false);
						b.setLocationRelativeTo(null);	
					}	
				}
			}
			
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				darDeAltaPoliza b = new darDeAltaPoliza(dtocliente);
				b.setVisible(true);
			}
		});	
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(27)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Responsabilidad Civil"},
				{"Responsabilidad Civil + Robo Total + Incendio Total"},
				{"Responsabilidad Civil + Robo Total, Hurto Total + Incendio Total + Destrucci\u00F3n Total"},
				{"Responsabilidad Civil + Robo Parcial, Hurto Total y Parcial + Incendio Total y Parcial + Destrucci\u00F3n Total"},
				{"Responsabilidad Civil + Robo, Hurto \u00E9 Incendio Total y Parcial + Da\u00F1os Totales y Parciales"},
				{""},
				{null},
				{null},
				{null},
				{""},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Coberturas"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(155);
		contentPane.setLayout(null);
		scrollPane.setViewportView(table);
		
		table_1 = new JTable();
		scrollPane.setColumnHeaderView(table_1);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		contentPane.add(panel_1);
		contentPane.add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 834, 83);
		contentPane.add(panel);
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 784, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(309, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
	}
}
