package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaMostrar extends JFrame{
	
	
	private JButton botonVolver;
	private JLabel titulo;
	private JTextField mostrar;
	
	public VentanaMostrar() {
		setBounds(200, 200, 1100, 550);
		setTitle("Inicio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		titulo = new JLabel();
		titulo.setBounds(150, 0, 900, 120);
		titulo.setText("Visualizacion de productos");
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		
		botonVolver = new JButton();
		botonVolver.setBounds(10, 10, 120, 50);
		botonVolver.setForeground(Color.black);
		botonVolver.setText("Volver");
		botonVolver.setFont(new Font("Arial", Font.BOLD, 20));
		
		mostrar = new JTextField();
		mostrar.setBounds(100, 110, 850, 300);
		
		add(titulo);
		add(botonVolver);
		add(mostrar);
		
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JTextField getMostrar() {
		return mostrar;
	}

	public void setMostrar(JTextField mostrar) {
		this.mostrar = mostrar;
	}
	
	
	
}
