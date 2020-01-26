package ar.TpDisenio2019.Ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.text.MaskFormatter;

import ar.TpDisenio2019.Controladores.GestorCliente;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Utilitario.KeyAdapterModificado;
import ar.TpDisenio2019.Utilitario.Validaciones;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class buscarCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField apellidoCliente;
	private JTextField nombreCliente;
	private JTextField docCliente;
	private JFormattedTextField nroCliente;

	private List<DTOTipodedocumento> dtoListaTipoDocumento = new ArrayList<DTOTipodedocumento>();
	private List<DTOCliente> listaDtosCliente = new ArrayList<DTOCliente>();
	private List<DTOCliente> clientes_busqueda = new ArrayList<DTOCliente>();

	private JLabel labelAclaracionSobreNumerodeCliente;

	private JScrollPane scrollPane;
	private String[] nombresDeLasColumnasDeLaTabla = { "Nro de Cliente", "Nombre", "Apellido", "Tipo de Documento",
			"Nro de Documento" };
	private Object[][] datosDeLaTabla;
	private JTable tablaCliente;
	long numCliente;
	int numeroDoc;
	private String tipoDeDocumento = " ";
	int bandera = 0;

	public buscarCliente() {

		setTitle("Buscar Cliente");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 303, 764, 377);

		JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un Cliente");

		JButton button_2 = new JButton("Cancelar");
		button_2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				hide();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 11));

		// datos de tabla
		scrollPane = new JScrollPane();

		datosDeLaTabla = new Object[24][5];
		tablaCliente = new JTable(datosDeLaTabla, nombresDeLasColumnasDeLaTabla);
		tablaCliente.setCellSelectionEnabled(true);

		tablaCliente.getColumnModel().getColumn(2).setPreferredWidth(119);
		tablaCliente.getColumnModel().getColumn(3).setPreferredWidth(118);
		scrollPane.setViewportView(tablaCliente);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 94, 774, 211);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel lblNroCliente = new JLabel("Nro de Cliente:");
		lblNroCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel label_1 = new JLabel("Apellido");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblNroDocumento = new JLabel("Nro Documento");
		lblNroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel labelAclaracionSobreApellido = new JLabel("Solo caracteres validos para apellido (maximo 50)");
		labelAclaracionSobreApellido.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAclaracionSobreApellido.setForeground(Color.RED);
		labelAclaracionSobreApellido.setVisible(false);

		JLabel labelAclaracionSobreNombres = new JLabel("Solo caracteres validos para nombres (maximo 50)");
		labelAclaracionSobreNombres.setFont(new Font("Tahoma", Font.PLAIN, 10));
		labelAclaracionSobreNombres.setForeground(Color.RED);
		labelAclaracionSobreNombres.setVisible(false);

		JLabel labelAclaracionSobreNumeroDeDocumento = new JLabel(" ");
		labelAclaracionSobreNumeroDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 9));
		labelAclaracionSobreNumeroDeDocumento.setForeground(Color.RED);
		labelAclaracionSobreNumeroDeDocumento.setVisible(false);

		MaskFormatter mascara = null;

		try {
			mascara = new MaskFormatter("##-########");
			mascara.setPlaceholderCharacter(' ');
		}

		catch (ParseException e) {
			e.printStackTrace();
		}

		nroCliente = new JFormattedTextField(mascara);
		nroCliente.setColumns(10);

		// ********
		nombreCliente = new JTextField();
		nombreCliente.setColumns(10);

		apellidoCliente = new JTextField();
		apellidoCliente.setColumns(10);
		//

		docCliente = new JTextField();
		docCliente.setColumns(10);

		// ********** Verifica el numero de cliente

		nroCliente.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String numeroCliente = nroCliente.getText();

				if (numeroCliente.compareTo("  -        ") != 0) {
					if (Validaciones.validarNumeroDeCliente(numeroCliente) == true) {
						labelAclaracionSobreNumerodeCliente.setVisible(true);
					}
				}
			}

			public void focusGained(FocusEvent arg0) {
				labelAclaracionSobreNumerodeCliente.setVisible(false);
			}
		});

		labelAclaracionSobreNumerodeCliente = new JLabel("Formato de numero de cliente 99-99999999");
		labelAclaracionSobreNumerodeCliente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		labelAclaracionSobreNumerodeCliente.setForeground(Color.RED);
		labelAclaracionSobreNumerodeCliente.setVisible(false);
		// ********** Verifica cantidades de digitos denombre y escribe con mayusculas

		nombreCliente.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String nombres = nombreCliente.getText();

				if (nombres.length() > 0) {
					if (Validaciones.validarApellidoONombre(nombres) == false) {
						labelAclaracionSobreNombres.setVisible(true);
					}
				}
			}

			public void focusGained(FocusEvent arg0) {
				labelAclaracionSobreNombres.setVisible(false);
			}
		});

		nombreCliente.addKeyListener(new KeyAdapterModificado());

		nombreCliente.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = nombreCliente.getText();
				nombreCliente.setText(texto.toUpperCase());
			}

		});

		// ********** Verifica cantidades de digitos de apellido y escribe con
		// mayusculas los apellidos
		apellidoCliente.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String apellido = apellidoCliente.getText();

				if (apellido.length() > 0) {
					if (Validaciones.validarApellidoONombre(apellido) == false) {

						labelAclaracionSobreApellido.setVisible(true);
					}
				}
			}

			public void focusGained(FocusEvent arg0) {
				labelAclaracionSobreApellido.setVisible(false);
			}
		});

		apellidoCliente.addKeyListener(new KeyAdapterModificado());

		apellidoCliente.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = apellidoCliente.getText();
				apellidoCliente.setText(texto.toUpperCase());
			}

		});

		// *******************Lista los tipos de documentos

		JComboBox<String> comboBoxTipoDocumento = new JComboBox<String>();
		dtoListaTipoDocumento = GestorListasDesplegables.buscarDtosTipoDeDocumento();
		List<String> listatipoDocumento = new ArrayList<>();
		listatipoDocumento.add("--Seleccione--");

		for (DTOTipodedocumento tipo : dtoListaTipoDocumento)
			listatipoDocumento.add(tipo.getNombre().toString());

		for (String nombre : listatipoDocumento)

			comboBoxTipoDocumento.addItem(nombre.toString());

		comboBoxTipoDocumento.addKeyListener(new KeyAdapterModificado());

		// ***** verifica los tipos de documentos con sus cantidades de digitos

		docCliente.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String numeroDeDoc = docCliente.getText();
				tipoDeDocumento = comboBoxTipoDocumento.getSelectedItem().toString();

				if ((numeroDeDoc.length() > 0) && ((tipoDeDocumento != "--Seleccione--") || tipoDeDocumento != " ")) {

					if (Validaciones.validarNumeroDeDocumento(numeroDeDoc, tipoDeDocumento) == false) {
						if (tipoDeDocumento.compareTo("DNI") == 0)
							labelAclaracionSobreNumeroDeDocumento.setText("Solo se permiten numeros (solo 8)");
						else if (tipoDeDocumento.compareTo("LE") == 0 || tipoDeDocumento.compareTo("LC") == 0)
							labelAclaracionSobreNumeroDeDocumento.setText("Solo se permiten numeros (solo 7)");
						else if (tipoDeDocumento.compareTo("Pasaporte") == 0)
							labelAclaracionSobreNumeroDeDocumento
									.setText("Caracteres validos: 0-9, A-Z, espacio (maximo 9)");
						else if (tipoDeDocumento.compareTo("Otro") == 0)
							labelAclaracionSobreNumeroDeDocumento
									.setText("Caracteres validos: 0-9, A-Z, espacio (máximo 15)");
						labelAclaracionSobreNumeroDeDocumento.setVisible(true);
					}
				}
			}

			public void focusGained(FocusEvent arg0) {
				labelAclaracionSobreNumeroDeDocumento.setVisible(false);
			}
		});

		docCliente.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				String texto = docCliente.getText();
				docCliente.setText(texto.toUpperCase());
			}

		});

		// ******************

		comboBoxTipoDocumento.setBackground(Color.WHITE);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_5
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup().addComponent(lblNroCliente)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(labelAclaracionSobreNumerodeCliente))
				.addGap(46)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_5.createSequentialGroup()
						.addComponent(label).addGap(18)
						.addComponent(nombreCliente, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE).addComponent(lblTipo)
						.addGap(18)
						.addComponent(comboBoxTipoDocumento, GroupLayout.PREFERRED_SIZE, 193,
								GroupLayout.PREFERRED_SIZE)
						.addGap(39))
						.addGroup(gl_panel_5.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
										.addComponent(labelAclaracionSobreNombres)
										.addGroup(gl_panel_5.createSequentialGroup().addGroup(gl_panel_5
												.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_5.createSequentialGroup().addComponent(label_1)
														.addGap(18)
														.addComponent(apellidoCliente, GroupLayout.PREFERRED_SIZE, 121,
																GroupLayout.PREFERRED_SIZE)
														.addGap(79).addComponent(lblNroDocumento))
												.addComponent(labelAclaracionSobreApellido))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
														.addComponent(labelAclaracionSobreNumeroDeDocumento)
														.addComponent(docCliente, GroupLayout.PREFERRED_SIZE, 128,
																GroupLayout.PREFERRED_SIZE))
												.addGap(14)))
								.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)))
				.addGap(0)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_5
				.createSequentialGroup().addGap(29)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(label).addComponent(
								nombreCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTipo)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(lblNroCliente)
								.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxTipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(labelAclaracionSobreNombres)
						.addComponent(labelAclaracionSobreNumerodeCliente))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(docCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNroDocumento))
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(apellidoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1)))
				.addGap(11)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(labelAclaracionSobreApellido)
						.addComponent(labelAclaracionSobreNumeroDeDocumento, GroupLayout.PREFERRED_SIZE, 14,
								GroupLayout.PREFERRED_SIZE))));
		panel_5.setLayout(gl_panel_5);

		// *******BOTON BUSCAR*******/

		JButton btnBuscar = new JButton("Buscar");

		btnBuscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String numeroCliente = nroCliente.getText();

				if (numeroCliente.compareTo("  -        ") != 0) {

					if (Validaciones.validarNumeroDeCliente(numeroCliente) == true) {

						labelAclaracionSobreNumerodeCliente.setVisible(true);

					} else {
						String[] parts = numeroCliente.split("-");
						String part1 = parts[0];
						String part2 = parts[1];
						numeroCliente = part1.concat(part2);
						if (Validaciones.validarNumeroDeCliente(numeroCliente) == true) {

							numCliente = 0L;

						}

						else
							numCliente = Long.parseLong(numeroCliente);
					}
				}

				String nombre = nombreCliente.getText();

				if (nombre.length() > 0) {
					if (Validaciones.validarApellidoONombre(nombre) == false) {

						labelAclaracionSobreNombres.setVisible(true);

					}

				}

				String apellido = apellidoCliente.getText();

				if (apellido.length() > 0) {
					if (Validaciones.validarApellidoONombre(apellido) == false) {

						labelAclaracionSobreApellido.setVisible(true);
					}

				}

				String numeroDeDoc = docCliente.getText();

				tipoDeDocumento = comboBoxTipoDocumento.getSelectedItem().toString();

				if (numeroDeDoc.isEmpty())
					numeroDoc = 0;
				else
					numeroDoc = Integer.parseInt(numeroDeDoc);

				clientes_busqueda.clear();

				if (numCliente == 0 && nombre.isEmpty() && apellido.isEmpty()
						&& ((tipoDeDocumento == "--Seleccione--") || (tipoDeDocumento == " ")) && numeroDoc == 0) {
					{
						JOptionPane.showMessageDialog(null, "Ingrese un dato para buscar el cliente.", "Alerta",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} else {
					DTOCliente buscarCliente = new DTOCliente();
					DTOTipodedocumento tipo = new DTOTipodedocumento();
					buscarCliente.setNroCliente(numCliente);
					buscarCliente.setNombre(nombre);
					buscarCliente.setApellido(apellido);
					tipo.setNombre(tipoDeDocumento);
					buscarCliente.setTipodedocumento(tipo);
					buscarCliente.setNroDocumento(numeroDoc);
					System.out.println("El numero de cliente :" + " " + buscarCliente.getNroCliente());
					System.out.println("El  nombre del cliente :" + " " + buscarCliente.getNombre());
					System.out.println("El apellido del cliente :" + " " + buscarCliente.getApellido());
					System.out.println("El tipo de documento del cliente :" + " "
							+ buscarCliente.getTipodedocumento().getNombre());
					System.out.println("El numero de documento :" + " " + buscarCliente.getNroDocumento());

					listaDtosCliente = GestorCliente.buscarDtoscliente();

					if (buscarCliente.getNroCliente() != 0) {

						for (DTOCliente dtocliente : listaDtosCliente) {

							if (dtocliente.getNroCliente().equals(buscarCliente.getNroCliente())) {
								clientes_busqueda.add(dtocliente);
								break;

							}
						}
					}

					if (!buscarCliente.getNombre().equals("")) {

						if (!clientes_busqueda.isEmpty()) {
							for (DTOCliente dto : clientes_busqueda) {

								if (!(dto.getNombre().equals(buscarCliente.getNombre())))
									clientes_busqueda.clear();
								break;

							}
						} else {

							for (DTOCliente dtocliente : listaDtosCliente) {
								if (buscarCliente.getNombre().equals(dtocliente.getNombre())) {
									if (!(clientes_busqueda.contains(dtocliente))) {

										clientes_busqueda.add(dtocliente);

									} else
										break;
								}
							}
						}
					}

					if (!buscarCliente.getApellido().equals("")) {

						if (!clientes_busqueda.isEmpty()) {
							for (DTOCliente dto : clientes_busqueda) {

								if (!(dto.getApellido().equals(buscarCliente.getApellido())))
									clientes_busqueda.clear();
								break;

							}
						} else {

							for (DTOCliente dtocliente : listaDtosCliente) {
								if (buscarCliente.getApellido().equals(dtocliente.getApellido())) {
									if (!(clientes_busqueda.contains(dtocliente))) {
										clientes_busqueda.add(dtocliente);

									} else
										break;
								}
							}
						}
					}

					if (!buscarCliente.getTipodedocumento().getNombre().equals("--Seleccione--")) {

						if (!clientes_busqueda.isEmpty()) {
							for (DTOCliente dto : clientes_busqueda) {

								if (!(dto.getTipodedocumento().getNombre()
										.equals(buscarCliente.getTipodedocumento().getNombre())))
									clientes_busqueda.clear();

							}
						} else {

							for (DTOCliente dtocliente : listaDtosCliente) {
								if (buscarCliente.getTipodedocumento().getNombre()
										.equals(dtocliente.getTipodedocumento().getNombre())) {
									if (!(clientes_busqueda.contains(dtocliente))) {
										clientes_busqueda.add(dtocliente);

									} else
										break;
								}
							}
						}
					}

					if (!buscarCliente.getNroDocumento().equals(0)) {

						if (!clientes_busqueda.isEmpty()) {
							int bandera = 0;
							DTOCliente aux = new DTOCliente();
							for (DTOCliente dto : clientes_busqueda) {

								if ((dto.getNroDocumento().equals(buscarCliente.getNroDocumento()))) {
									bandera = 1;
									aux = dto;
									break;
								}

							}
							if (bandera == 1) {

								clientes_busqueda.clear();
								clientes_busqueda.add(aux);
							} else
								clientes_busqueda.clear();

						} else {

							for (DTOCliente dtocliente : listaDtosCliente) {

								if (buscarCliente.getNroDocumento().equals(dtocliente.getNroDocumento())) {

									if (!(clientes_busqueda.contains(dtocliente))) {
										clientes_busqueda.add(dtocliente);
										break;

									}
								}

								else
									break;

							}
						}
					}

					if (clientes_busqueda.size() == 0) {

						JOptionPane.showMessageDialog(null, "No existe cliente para los datos ingresados", "Busqueda",
								JOptionPane.INFORMATION_MESSAGE);
						dispose();
						buscarCliente m = new buscarCliente();
						m.setVisible(true);
						m.setResizable(false);
						m.setLocationRelativeTo(null);
					}

					else {

						construirTabla(clientes_busqueda);

					}
				}

			}

			private void construirTabla(List<DTOCliente> listaDtosCliente) {
				String[] nombresDeLasColumnasDeLaTabla = { "Nro deCliente", "Nombre", "Apellido", "Tipo de Documento",
						"Nro de Documento" };
				Object[][] informacion = obtenerMatriz(listaDtosCliente);
				tablaCliente = new JTable(informacion, nombresDeLasColumnasDeLaTabla);
				scrollPane.setViewportView(tablaCliente);

			}

			private Object[][] obtenerMatriz(List<DTOCliente> listaDtosCliente) {
				datosDeLaTabla = new Object[listaDtosCliente.size()][5];

				for (int i = 0; i < listaDtosCliente.size(); i++) {
					datosDeLaTabla[i][0] = listaDtosCliente.get(i).getNroCliente() + "";
					datosDeLaTabla[i][1] = listaDtosCliente.get(i).getNombre() + "";
					datosDeLaTabla[i][2] = listaDtosCliente.get(i).getApellido() + "";
					datosDeLaTabla[i][3] = listaDtosCliente.get(i).getTipodedocumento().getNombre() + "";
					datosDeLaTabla[i][4] = listaDtosCliente.get(i).getNroDocumento() + "";
				}
				return datosDeLaTabla;
			}
		});

		JButton button_Aceptar = new JButton("Aceptar");
		button_Aceptar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_Aceptar) {

					int filaSeleccion = tablaCliente.getSelectedRow();

					try {

						if (filaSeleccion == -1)
							JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						else {

							int num = listaDtosCliente.size();

							for (int i = 0; i < num; i++) {
								if (listaDtosCliente.get(i).getNroCliente().toString()
										.equalsIgnoreCase(datosDeLaTabla[filaSeleccion][0].toString())) {
									filaSeleccion = i;
									break;
								}
							}

							DTOPoliza dtoPoliza = null;
							dispose();
							buscarCliente1 b = new buscarCliente1(listaDtosCliente.get(filaSeleccion), dtoPoliza);
							b.setVisible(true);
							b.setResizable(false);
							b.setLocationRelativeTo(null);

						}

					} catch (Exception e1) {

					}
				}
			}
		});

		button_Aceptar.setFont(new Font("Tahoma", Font.PLAIN, 11));

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(
						gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										gl_panel_1.createSequentialGroup().addContainerGap()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
														.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 750,
																Short.MAX_VALUE)
														.addComponent(btnBuscar))
												.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnBuscar).addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap(87, Short.MAX_VALUE)
						.addComponent(button_Aceptar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGap(45).addComponent(button_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
						.addGap(85))
				.addGroup(gl_panel_3.createSequentialGroup().addGap(19).addComponent(lblSeleccioneUnCliente)
						.addContainerGap(644, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE).addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addGap(20).addComponent(lblSeleccioneUnCliente)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE).addGap(18)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_Aceptar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGap(19)));
		panel_3.setLayout(gl_panel_3);

		contentPane.setLayout(null);
		contentPane.add(panel_3);
		contentPane.add(panel_1);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 784, 83);
		contentPane.add(panel);

		JLabel label_2 = new JLabel("EL ASEGURADO");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 774, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addGap(314).addComponent(label_2).addContainerGap(299,
						Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE).addComponent(label_2)
						.addGap(25)));
		panel.setLayout(gl_panel);

	}
}