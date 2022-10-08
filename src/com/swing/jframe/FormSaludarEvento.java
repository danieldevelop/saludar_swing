package com.swing.jframe;

import com.swing.functions.Validar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormSaludarEvento {

	Validar valida = new Validar();

	public void Saluda(JButton button, JTextField input) {
		ActionListener saludar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (valida.camposVacios(input.getText())) {
					JOptionPane.showMessageDialog(null, "Debe ingresar su nombre", "Java Swing - Eclipse IDE", 0);
				} else {
					JOptionPane.showMessageDialog(null, String.format("Hola %s, esta es una ventana grafica con JAVA swing", input.getText()), 
							"Java Swing - Eclipse IDE", 1);
				}
			}
		};
		button.addActionListener(saludar);
	}
}
