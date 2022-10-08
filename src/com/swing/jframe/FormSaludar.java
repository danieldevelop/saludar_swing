package com.swing.jframe;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormSaludar extends JFrame {

	private JPanel pnlVentana = new JPanel();
	private JLabel lblTitulo = new JLabel();
	private JLabel lblUsuario = new JLabel();
	private JTextField txtUsuario = new JTextField();
	private JButton btnSaludar = new JButton();

	// Contructor
	public FormSaludar() {
		this.configuracionInicial();
		this.contenidoFormulario();
	}

	/**
	 * Establecemos propiedades especificas del JFrame (ventana) y JPanel (panel)
	 * del formulario
	 */
	private void configuracionInicial() {
		this.setTitle("Java Swing - Eclipse IDE");
		this.setSize(340, 200); // tamaño de la ventana (ancho, alto)
		this.setLocationRelativeTo(null); // posicionar al centro de la ventana actual
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se cierra el jframe terminando todo el proceso

		pnlVentana.setLayout(null); // desactiva el layout por defecto, para dar posicionamiento a los componentes
		this.getContentPane().add(pnlVentana);
	}

	/**
	 * Construimos el formulario con sus componentes y se agregan estos componentes
	 * al panel del formulario
	 */
	private void contenidoFormulario() {
//		HEADER
		lblTitulo.setText("!Welcome JAVA Swing");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(42, 20, 240, 30); // tamaño al texto (x, y, ancho, alto)
		lblTitulo.setOpaque(true); // desactivamos el colo de fondo transparente, y luego...
		lblTitulo.setForeground(Color.decode("#000")); // establecemos nuestro propio color de texto
		lblTitulo.setFont(new Font("arial", Font.BOLD, 20));

//		BODY
//		Section <form>
		lblUsuario.setText("Nombre:");
		lblUsuario.setBounds(50, 65, 200, 30);
		lblUsuario.setFont(new Font("arial", Font.PLAIN, 14));

		txtUsuario.setBounds(110, 68, 150, 25);
		txtUsuario.setFont(new Font("arial", Font.BOLD, 14));

		btnSaludar.setText("!Hazme Click");
		btnSaludar.setBounds(100, 110, 120, 25);
		btnSaludar.setFont(new Font("arial", Font.PLAIN, 14));

//		add JPanel
		pnlVentana.add(lblTitulo);
		pnlVentana.add(lblUsuario);
		pnlVentana.add(txtUsuario);
		pnlVentana.add(btnSaludar);

		FormSaludarEvento evento = new FormSaludarEvento();
		evento.Saluda(btnSaludar, txtUsuario);
	}

}
