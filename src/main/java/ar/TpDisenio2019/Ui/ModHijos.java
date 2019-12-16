package ar.TpDisenio2019.Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
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

import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.Utilitario.KeyAdapterModificado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class ModHijos extends JFrame {

	private JTable table;
	private Object[][] datosDeLaTablaPrincipal;
	private DefaultTableModel modelo;
	

	/**
	 * Create the application.
	 */
	public ModHijos( int numeroHijos) {
		initialize(numeroHijos);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int numeroHijos) {
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
		gl_panelEncabezado.setHorizontalGroup(
			gl_panelEncabezado.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelEncabezado.createSequentialGroup()
					.addContainerGap(517, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(372))
		);
		gl_panelEncabezado.setVerticalGroup(
			gl_panelEncabezado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEncabezado.createSequentialGroup()
					.addGap(28)
					.addComponent(label)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		panelEncabezado.setLayout(gl_panelEncabezado);
		
		JPanel panel_contenido = new JPanel();
		panel_contenido.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATOS DE HIJOS", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_contenido.setBounds(28, 98, 713, 315);
		getContentPane().add(panel_contenido);
		
		JPanel panel_TablaHijos = new JPanel();
		
		JButton btnAgregar = new JButton("Agregar");
/*
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
*/		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		
		JButton btnAceptar = new JButton("Aceptar");
		
		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout gl_panel_contenido = new GroupLayout(panel_contenido);
		gl_panel_contenido.setHorizontalGroup(
			gl_panel_contenido.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_contenido.createSequentialGroup()
					.addGap(23)
					.addComponent(panel_TablaHijos, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_contenido.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(btnAgregar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_contenido.setVerticalGroup(
			gl_panel_contenido.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_contenido.createSequentialGroup()
					.addGap(31)
					.addComponent(btnAgregar)
					.addGap(18)
					.addComponent(btnModificar)
					.addGap(18)
					.addComponent(btnEliminar)
					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
					.addComponent(btnAceptar)
					.addGap(7)
					.addComponent(btnCancelar))
				.addGroup(gl_panel_contenido.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_TablaHijos, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_TablaHijos = new GroupLayout(panel_TablaHijos);
		gl_panel_TablaHijos.setHorizontalGroup(
			gl_panel_TablaHijos.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_TablaHijos.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel_TablaHijos.setVerticalGroup(
			gl_panel_TablaHijos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_TablaHijos.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		Date hoy= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
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
		 String nomcols[]={"Fecha de Nacimiento", "Sexo", "Estado Civil"};
		  
		  if(numeroHijos > 0)
			{	
				datosDeLaTablaPrincipal = new Object[numeroHijos][3];
								
					for(int i = 0; i < numeroHijos; i++)
					{
						
						datosDeLaTablaPrincipal[i][0]= null;
						datosDeLaTablaPrincipal[i][1]= null;
						datosDeLaTablaPrincipal[i][2]= null;
						
					}
				
			}
		  else {
			  String s[]={"",""," "};
			  modelo.addRow(s);  
		  }
		 
		  modelo=new DefaultTableModel(datosDeLaTablaPrincipal,nomcols);
		  
		  table=new JTable(modelo);
		  
		  
		  TableColumn colFechaNacimiento=table.getColumnModel().getColumn(0);
		  TableColumn colSexo=table.getColumnModel().getColumn(1);
		  TableColumn colEstadoCivil=table.getColumnModel().getColumn(2);
		  
		  
		  String opSexo[]={"Femenino","Masculino"};
		  String opEstadoCivil[]= {"Soltero/a.","Comprometido/a.","Casado/a.","Unión libre o unión de hecho.","Separado/a.","Divorciado/a.","Viudo/a."};
		  
		  sexo=new JComboBox<String>(opSexo);
		  estadoCivil=new JComboBox<String>(opEstadoCivil);
		  
		  colFechaNacimiento.setCellEditor(new DefaultCellEditor(textoFecha));
		  colSexo.setCellEditor(new DefaultCellEditor(sexo));
		  colEstadoCivil.setCellEditor(new DefaultCellEditor(estadoCivil));
		  
		//  table.addKeyListener(new KeyAdapterModificado());
	
		  table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		panel_TablaHijos.setLayout(gl_panel_TablaHijos);
		panel_contenido.setLayout(gl_panel_contenido);
		
		
		btnAgregar.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    String s[]={""," "," "};
			    modelo.addRow(s);
			   }
			   
			  });
		
		btnModificar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int seleccionada=table.getSelectedRow();
				if(seleccionada==-1)
				{	
					
				}
				
				else
				{
					modelo.setValueAt("", seleccionada, 0);
				}
			}
		});
		
	//	btnModificar.addKeyListener(new KeyAdapterModificado());
		
		btnEliminar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int seleccionada=table.getSelectedRow();
				modelo.removeRow(seleccionada);
			}
		});
		btnCancelar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		
		});
	}
}
