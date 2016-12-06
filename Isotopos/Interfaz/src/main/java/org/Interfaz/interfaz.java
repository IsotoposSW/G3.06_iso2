package org.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField fieldLicense;
	private JTextField fieldDNI;
	private JTextField FieldIDSancion;
	private JTextField FieldCantidad;
	private JTextField fieldIDSancion;
	private JTextField field1DNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSimularCoche = new JButton("Simular Coche");
		btnSimularCoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//radar.abrirInvestigacion();
			}
		});
		btnSimularCoche.setBounds(417, 211, 133, 62);
		contentPane.add(btnSimularCoche);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(12, 28, 400, 272);
		contentPane.add(tabbedPane);
		
		JPanel panelIdentificar = new JPanel();
		tabbedPane.addTab("Identificar Conductor", null, panelIdentificar, null);
		panelIdentificar.setLayout(null);
		
		JLabel lblIdSancion = new JLabel("ID Sancion");
		lblIdSancion.setBounds(12, 13, 74, 16);
		panelIdentificar.add(lblIdSancion);
		
		JLabel lblDni_1 = new JLabel("DNI");
		lblDni_1.setBounds(12, 100, 56, 16);
		panelIdentificar.add(lblDni_1);
		
		fieldIDSancion = new JTextField();
		fieldIDSancion.setBounds(112, 10, 116, 22);
		panelIdentificar.add(fieldIDSancion);
		fieldIDSancion.setColumns(10);
		
		field1DNI = new JTextField();
		field1DNI.setBounds(112, 97, 116, 22);
		panelIdentificar.add(field1DNI);
		field1DNI.setColumns(10);
		//Identificar Conductor
		JButton btnAplicar_2 = new JButton("Aplicar");
		btnAplicar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								/*
				try {
				int i = Integer.parseInt(fieldIDSancion.getText());
				   }
				catch (NumberFormatException x) {
				}
				
				*/
				
				// Sanction identifyDriver(int fieldIDSancion, String field1DNI)
			}
		});
		btnAplicar_2.setBounds(67, 207, 97, 25);
		panelIdentificar.add(btnAplicar_2);
		
		JPanel panelPago = new JPanel();
		tabbedPane.addTab("Abonar Sancion", null, panelPago, null);
		panelPago.setLayout(null);
		
		FieldIDSancion = new JTextField();
		FieldIDSancion.setBounds(112, 26, 116, 22);
		panelPago.add(FieldIDSancion);
		FieldIDSancion.setColumns(10);
		
		JLabel lblSancion = new JLabel("ID Sancion");
		lblSancion.setBounds(12, 29, 70, 16);
		panelPago.add(lblSancion);
		
		// Pagar Sancion
		
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Mostrar el coste de la sancion 
				// buscar sanctionHolder_id==fieldIDsancion.getText() , escribir amount en fieldCantidad y habilitar btnAplicar2
				FieldCantidad.setText("200");
							}
		});
		btnComprobar.setBounds(73, 64, 97, 25);
		panelPago.add(btnComprobar);
		
		JButton btnAplicar_1 = new JButton("Aplicar");
		btnAplicar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				try {
				int i = Integer.parseInt(fieldIDSancion.getText());
				   }
				catch (NumberFormatException x) {
				}
				
				*/
				// pay(int FieldIDSancion);
			}
		});
		btnAplicar_1.setBounds(73, 229, 97, 25);
		panelPago.add(btnAplicar_1);
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(24, 121, 70, 22);
		panelPago.add(lblCantidad);
		
		FieldCantidad = new JTextField();
		FieldCantidad.setEditable(false);
		FieldCantidad.setBounds(112, 121, 116, 22);
		panelPago.add(FieldCantidad);
		FieldCantidad.setColumns(10);
		
		JPanel panelPropietario = new JPanel();
		panelPropietario.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.addTab("Cambio de propietario", null, panelPropietario, null);
		panelPropietario.setLayout(null);
		
		fieldLicense = new JTextField();
		fieldLicense.setBounds(96, 65, 83, 22);
		panelPropietario.add(fieldLicense);
		fieldLicense.setColumns(10);
		
		fieldDNI = new JTextField();
		fieldDNI.setBounds(96, 165, 83, 22);
		panelPropietario.add(fieldDNI);
		fieldDNI.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(18, 68, 56, 16);
		panelPropietario.add(lblMatricula);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(18, 168, 56, 16);
		panelPropietario.add(lblDni);
		// Cambio de proprietario
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// changeOwner(String license, String newDni)
			   
			}
		});
		btnAplicar.setBounds(82, 229, 97, 25);
		panelPropietario.add(btnAplicar);
	}
}
