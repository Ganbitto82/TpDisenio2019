package ar.TpDisenio2019.Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;

import ar.TpDisenio2019.Controladores.GestorPoliza;
import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Utilitario.Fechas;
import ar.TpDisenio2019.Utilitario.KeyAdapterModificado;
import ar.TpDisenio2019.Utilitario.Validaciones;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class ModHijos extends JFrame {

	private JTable table;
	private Object[][] datosDeLaTablaPrincipal;
	private DefaultTableModel modelo;
	private JButton btnAgregar = new JButton("Agregar");;
	private JButton btnModificar = new JButton("Modificar");
	private JButton btnEliminar = new JButton("Eliminar");
	private JButton btnAceptar = new JButton("Aceptar");
	private JButton btnCancelar = new JButton("Cancelar");

	private int banderaValidacionFecha=0;
	private int banderaValidacionSexo=0;
	private int banderaValidacionEstadoCivil=0;
	/**
	 * Create the application.
	 */
	public ModHijos(DTOPoliza dtoPoliza, int numeroHijos) {
		initialize(dtoPoliza, numeroHijos);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DTOPoliza dtoPoliza, int numeroHijos) {
		setTitle("Modificar Datos Hijos");
		setBounds(100, 100, 763, 463);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panelEncabezado = new JPanel();
		panelEncabezado.setBackground(new Color(255, 0, 51));
		panelEncabezado.setBounds(-245, 0, 1046, 87);
		getContentPane().add(panelEncabezado);

		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panelEncabezado = new GroupLayout(panelEncabezado);
		gl_panelEncabezado.setHorizontalGroup(gl_panelEncabezado.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelEncabezado.createSequentialGroup().addContainerGap(517, Short.MAX_VALUE)
						.addComponent(label).addGap(372)));
		gl_panelEncabezado
				.setVerticalGroup(gl_panelEncabezado.createParallelGroup(Alignment.LEADING).addGroup(gl_panelEncabezado
						.createSequentialGroup().addGap(28).addComponent(label).addContainerGap(34, Short.MAX_VALUE)));
		panelEncabezado.setLayout(gl_panelEncabezado);

		JPanel panel_contenido = new JPanel();
		panel_contenido.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DE HIJOS",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_contenido.setBounds(28, 98, 713, 315);
		getContentPane().add(panel_contenido);

		JPanel panel_TablaHijos = new JPanel();

		GroupLayout gl_panel_contenido = new GroupLayout(panel_contenido);
		gl_panel_contenido.setHorizontalGroup(gl_panel_contenido.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_contenido.createSequentialGroup().addGap(23)
						.addComponent(panel_TablaHijos, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_panel_contenido.createParallelGroup(Alignment.LEADING)
								.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(btnAgregar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_panel_contenido.setVerticalGroup(gl_panel_contenido.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_contenido.createSequentialGroup().addGap(31).addComponent(btnAgregar).addGap(18)
						.addComponent(btnModificar).addGap(18).addComponent(btnEliminar)
						.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE).addComponent(btnAceptar)
						.addGap(7).addComponent(btnCancelar))
				.addGroup(gl_panel_contenido.createSequentialGroup().addContainerGap()
						.addComponent(panel_TablaHijos, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
						.addContainerGap()));

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_TablaHijos = new GroupLayout(panel_TablaHijos);
		gl_panel_TablaHijos.setHorizontalGroup(
				gl_panel_TablaHijos.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						gl_panel_TablaHijos.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(14, Short.MAX_VALUE)));
		gl_panel_TablaHijos.setVerticalGroup(gl_panel_TablaHijos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_TablaHijos.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(38, Short.MAX_VALUE)));

		Date hoy = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("##/##/####");
		} catch (ParseException ex) {
		}
		JFormattedTextField textoFecha = new JFormattedTextField(mascara);
		textoFecha.setValue("");
		try {
			textoFecha.commitEdit();
		} catch (ParseException ex1) {
		}

		JComboBox<String> sexo;
		JComboBox<String> estadoCivil;
		modelo = null;
		String nomcols[] = { "Fecha de Nacimiento", "Sexo", "Estado Civil" };

		// GestorPoliza.buscarHijosCliente(idCliente);

		if (numeroHijos > 0) {
			datosDeLaTablaPrincipal = new Object[numeroHijos][3];

			for (int i = 0; i < numeroHijos; i++) {

				datosDeLaTablaPrincipal[i][0] =  "DD/MM/AAAA";
				datosDeLaTablaPrincipal[i][1] =  " --Seleccione-- ";
				datosDeLaTablaPrincipal[i][2] =  " --Seleccione-- ";

			}

		} else {
			String s[] = { "DD/MM/AAAA",  " --Seleccione-- ",  " --Seleccione-- " };
			modelo.addRow(s);
		}

		modelo = new DefaultTableModel(datosDeLaTablaPrincipal, nomcols);

		table = new JTable(modelo);

		TableColumn colFechaNacimiento = table.getColumnModel().getColumn(0);
		TableColumn colSexo = table.getColumnModel().getColumn(1);
		TableColumn colEstadoCivil = table.getColumnModel().getColumn(2);

		String opSexo[] = { " --Seleccione-- ","Femenino", "Masculino" };
		String opEstadoCivil[] = {" --Seleccione-- ","Soltero/a.", "Comprometido/a.", "Casado/a.", "Unión libre o unión de hecho.",
				"Separado/a.", "Divorciado/a.", "Viudo/a." };

		sexo = new JComboBox<String>(opSexo);
		estadoCivil = new JComboBox<String>(opEstadoCivil);

		colFechaNacimiento.setCellEditor(new DefaultCellEditor(textoFecha));
		colSexo.setCellEditor(new DefaultCellEditor(sexo));
		colEstadoCivil.setCellEditor(new DefaultCellEditor(estadoCivil));

		// table.addKeyListener(new KeyAdapterModificado());

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		panel_TablaHijos.setLayout(gl_panel_TablaHijos);
		panel_contenido.setLayout(gl_panel_contenido);

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s[] = { "DD/MM/AAAA", " --Seleccione-- ", " --Seleccione-- " };
				modelo.addRow(s);

			}

		});

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int seleccionadaFila = table.getSelectedRow();
				int seleccionadaColumna= table.getSelectedColumn();
				if (seleccionadaFila == -1) {
					JOptionPane.showMessageDialog(null,
							"Seleccione una fila para modificar hijo.",
							"Alerta", JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					switch(seleccionadaColumna) {
					case 0: modelo.setValueAt("DD/MM/AAAA", seleccionadaFila, 0); break;
					case 1: modelo.setValueAt(" --Seleccione-- ", seleccionadaFila, 1); break;
					case 2: modelo.setValueAt(" --Seleccione-- ", seleccionadaFila, 2); break;
					}
					
				}
			}
		});

		// btnModificar.addKeyListener(new KeyAdapterModificado());

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int seleccionada = table.getSelectedRow();
				modelo.removeRow(seleccionada);
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}

		});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				List<DTODatosdehijo> listaDtosHijos = new ArrayList<DTODatosdehijo>();

				// GestorPoliza.buscarHijosCliente(idCliente);

				int filas = modelo.getRowCount();

				for (int i = 0; i < filas; i++) {
					DTODatosdehijo dtoNuevoHijo = new DTODatosdehijo();
					dtoNuevoHijo.setIdDatosHijo(i);

					if ((modelo.getValueAt(i, 0) != "DD/MM/AAAA") || (modelo.getValueAt(i, 0) != "  /  /   ")) {
						if (Validaciones.validarFechaNacimiento((String) modelo.getValueAt(i, 0))) {
							Date fechaAux = Fechas.convertirCadenaFechaADate((String) modelo.getValueAt(i, 0)); // Acá
																												// convierte
																												// la cadena
																												// a formato
																												// Date
																												// válido
							if (GestorPoliza.validarFechaHijo(fechaAux)) {
								dtoNuevoHijo.setFecha(fechaAux);
							} else {
								banderaValidacionFecha++;
								JOptionPane.showMessageDialog(null, "La declaración de hijos es entre 18 y 30 años.",
										"Alerta", JOptionPane.INFORMATION_MESSAGE);
								modelo.setValueAt("DD/MM/AAAA", i, 0);
								break;
							}
						} else {
							JOptionPane.showMessageDialog(null,
									"No ha ingresado un valor válido de fecha, vuelva a ingresar sus datos.", "Alerta",
									JOptionPane.INFORMATION_MESSAGE);
							modelo.setValueAt("DD/MM/AAAA", i, 0);
						}	
					}
					else {
						JOptionPane.showMessageDialog(null,
								"No ha ingresado un valor de fecha, recuerde el formato DD/MM/AAAA.", "Alerta",
								JOptionPane.INFORMATION_MESSAGE);
						modelo.setValueAt("DD/MM/AAAA", i, 0);
						banderaValidacionFecha++;
						break;
					}
						
					
					if (modelo.getValueAt(i, 1) != " --Seleccione-- ") {
						dtoNuevoHijo.setSexo((String) modelo.getValueAt(i, 1));
					} else {
						JOptionPane.showMessageDialog(null,
								"No ha seleccionado ningún valor en columna Sexo, vuelva a ingresar sus datos.",
								"Alerta", JOptionPane.INFORMATION_MESSAGE);
						modelo.setValueAt(" --Seleccione-- ", i, 1);
						banderaValidacionSexo++;
						break;
					}
					if (modelo.getValueAt(i, 2) != " --Seleccione-- ") {
						DTOEstadocivil estadoCivilHijo = GestorPoliza
								.buscarEstadoCivilPorNombre((String) modelo.getValueAt(i, 2));
						dtoNuevoHijo.setEstadocivil(estadoCivilHijo);
						listaDtosHijos.add(dtoNuevoHijo);
					} else {
						banderaValidacionEstadoCivil++;
						JOptionPane.showMessageDialog(null,
								"No ha seleccionado ningún valor en columna Estado Civil, vuelva a ingresar sus datos.",
								"Alerta", JOptionPane.INFORMATION_MESSAGE);
						modelo.setValueAt(" --Seleccione-- ", i, 2);
						break;
					}
				}
				if((banderaValidacionFecha>0)||(banderaValidacionSexo>0)||(banderaValidacionEstadoCivil>0)){
					listaDtosHijos = new ArrayList<DTODatosdehijo>();

					banderaValidacionFecha=0;
					banderaValidacionSexo=0;
					banderaValidacionEstadoCivil=0;
				}
				else
				if (GestorPoliza.validarElementosHijos(listaDtosHijos)) {
					GestorPoliza.agregarDtosHijos(listaDtosHijos);
					JOptionPane.showMessageDialog(null,
							"Los datos de los hijos se han guardado exitosamente.",
							"Alerta", JOptionPane.OK_OPTION);
					
					System.out.println("\nHa guardado el DTO en forma exitosa, número de hijos: " + filas);
					dispose();
				}
				else {
					listaDtosHijos = new ArrayList<DTODatosdehijo>();
					System.out.println("\nSetea el DTO de hijo: " + filas);
					
					banderaValidacionFecha=0;
					banderaValidacionSexo=0;
					banderaValidacionEstadoCivil=0;

				}
			}
		});

	}
}
