package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaInicio extends JFrame {

	private JLabel titulo1;
	private JButton boton1, boton2, boton3, boton4, boton5;
	private JPanel panel1;

	public VentanaInicio() {
		setBounds(300, 100, 1000, 600);
		setTitle("Mercado mayorista");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		panel1 = new JPanel();
		panel1.setBounds(0, 0, 900, 700);
		panel1.setLayout(null);

		boton1 = new JButton();
		boton1.setBounds(290, 330, 200, 60);
		boton1.setForeground(Color.black);
		boton1.setText("Papas");
		boton1.setBackground(new Color(166, 174, 186));
		boton1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		boton1.setCursor(new Cursor(Cursor.HAND_CURSOR));

		boton2 = new JButton();
		boton2.setBounds(75, 330, 200, 60);
		boton2.setForeground(Color.black);
		boton2.setText("Carnes");
		boton2.setBackground(new Color(166, 174, 186));
		boton2.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		boton2.setCursor(new Cursor(Cursor.HAND_CURSOR));

		boton3 = new JButton();
		boton3.setBounds(510, 330, 200, 60);
		boton3.setForeground(Color.black);
		boton3.setText("Chicles");
		boton3.setBackground(new Color(166, 174, 186));
		boton3.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		boton3.setCursor(new Cursor(Cursor.HAND_CURSOR));

		boton4 = new JButton();
		boton4.setBounds(725, 330, 200, 60);
		boton4.setForeground(Color.black);
		boton4.setText("Agua");
		boton4.setBackground(new Color(166, 174, 186));
		boton4.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		boton4.setCursor(new Cursor(Cursor.HAND_CURSOR));

		boton5 = new JButton();
		boton5.setBounds(0, 500, 200, 60);
		boton5.setForeground(Color.black);
		boton5.setText("Salir");
		boton5.setBackground(new Color(166, 174, 186));
		boton5.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		boton5.setCursor(new Cursor(Cursor.HAND_CURSOR));

		titulo1 = new JLabel();
		titulo1.setText("BIENVENIDO AL MERCADO MAYORISTA");
		titulo1.setBounds(200, 25, 800, 100);
		titulo1.setForeground(Color.black);
		titulo1.setBackground(Color.red);
		titulo1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));

		panel1.add(boton1);
		panel1.add(boton2);
		panel1.add(boton3);
		panel1.add(boton4);
		panel1.add(boton5);
		panel1.add(titulo1);

		add(panel1);
	}

}
