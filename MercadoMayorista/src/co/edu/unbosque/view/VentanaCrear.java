package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCrear extends JFrame {

		private JPanel panelCarne, panelAgua, panelChicles, panelPapas ;
		
		private JLabel titulo, panPeso, panMililitros, panTipo, panColor, panCorte, panCantidad,
				panAzucar, panSabor, panCalorias, panIndex;
		
		private JTextField entPeso, entMililitros, entTipo, entColor, entCorte, entCantidad, entAzucar,
				entSabor, entCalorias, entIndex;
		
		private JButton botonCrear, botonVolver;

		public VentanaCrear() {
			
			setBounds(200, 200, 1100, 550);
			setTitle("Inicio");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(null);

			titulo = new JLabel();
			titulo.setBounds(150, 0, 900, 120);
			titulo.setForeground(Color.black);
			titulo.setFont(new Font("Arial", Font.BOLD, 37));

			botonCrear = new JButton();
			botonCrear.setBounds(930, 450, 130, 50);
			botonCrear.setForeground(Color.black);
			botonCrear.setText("Crear");
			botonCrear.setFont(new Font("Arial", Font.BOLD, 20));

			botonVolver = new JButton();
			botonVolver.setBounds(10, 10, 120, 50);
			botonVolver.setForeground(Color.black);
			botonVolver.setText("Volver");
			botonVolver.setFont(new Font("Arial", Font.BOLD, 20));

			panelCarne = new JPanel();
			panelCarne.setSize(1100, 550);
			panelCarne.setLayout(null);
			panelCarne.setVisible(true);

			panelAgua = new JPanel();
			panelAgua.setSize(1100, 550);
			panelAgua.setLayout(null);
			panelAgua.setVisible(false);

			panelChicles = new JPanel();
			panelChicles.setSize(1100, 550);
			panelChicles.setLayout(null);
			panelChicles.setVisible(false);
			
			panelPapas = new JPanel();
			panelPapas.setSize(1100, 550);
			panelPapas.setLayout(null);
			panelPapas.setVisible(false);

			entPeso = new JTextField();
			entPeso.setBounds(60, 110, 700, 40);

			panPeso = new JLabel();
			panPeso.setBounds(800, 110, 700, 40);
			panPeso.setText("<-- Peso");
			panPeso.setForeground(Color.black);
			panPeso.setFont(new Font("Arial", Font.BOLD, 13));

			entMililitros = new JTextField();
			entMililitros.setBounds(60, 150, 700, 40);

			panMililitros = new JLabel();
			panMililitros.setBounds(800, 150, 700, 40);
			panMililitros.setText("<-- Mililitros");
			panMililitros.setForeground(Color.black);
			panMililitros.setFont(new Font("Arial", Font.BOLD, 13));

			entTipo = new JTextField();
			entTipo.setBounds(60, 190, 700, 40);

			panTipo = new JLabel();
			panTipo.setBounds(800, 190, 700, 40);
			panTipo.setText("<-- Tipo");
			panTipo.setForeground(Color.black);
			panTipo.setFont(new Font("Arial", Font.BOLD, 13));

			entColor = new JTextField();
			entColor.setBounds(60, 230, 700, 40);

			panColor = new JLabel();
			panColor.setBounds(800, 230, 700, 40);
			panColor.setText("<-- Color");
			panColor.setForeground(Color.black);
			panColor.setFont(new Font("Arial", Font.BOLD, 13));

			entCorte = new JTextField();
			entCorte.setBounds(60, 270, 700, 40);

			panCorte = new JLabel();
			panCorte.setBounds(800, 270, 700, 40);
			panCorte.setText("<-- Corte");
			panCorte.setForeground(Color.black);
			panCorte.setFont(new Font("Arial", Font.BOLD, 13));

			entCantidad = new JTextField();
			entCantidad.setBounds(60, 310, 700, 40);

			panCantidad = new JLabel();
			panCantidad.setBounds(800, 310, 700, 40);
			panCantidad.setText("<-- Cantidad");
			panCantidad.setForeground(Color.black);
			panCantidad.setFont(new Font("Arial", Font.BOLD, 13));

			entAzucar = new JTextField();
			entAzucar.setBounds(60, 350, 700, 40);

			panAzucar = new JLabel();
			panAzucar.setBounds(800, 350, 700, 40);
			panAzucar.setText("<-- Tiene azucar?");
			panAzucar.setForeground(Color.black);
			panAzucar.setFont(new Font("Arial", Font.BOLD, 13));

			entSabor = new JTextField();
			entSabor.setBounds(60, 390, 700, 40);

			panSabor = new JLabel();
			panSabor.setBounds(800, 390, 700, 40);
			panSabor.setText("<-- Sabor");
			panSabor.setForeground(Color.black);
			panSabor.setFont(new Font("Arial", Font.BOLD, 13));

			entIndex = new JTextField();
			entIndex.setBounds(60, 430, 700, 40);
			entIndex.setVisible(false);

			panIndex = new JLabel();
			panIndex.setBounds(800, 430, 700, 40);
			panIndex.setText("<-- Indice");
			panIndex.setForeground(Color.black);
			panIndex.setFont(new Font("Arial", Font.BOLD, 13));
			panIndex.setVisible(false);

			add(botonCrear);
			add(botonVolver);
			add(panelCarne);
			add(panelAgua);
			add(panelChicles);
			add(panelPapas);

			panelCarne.add(entPeso);
			panelCarne.add(panPeso);
			panelCarne.add(entTipo);
			panelCarne.add(panTipo);
			panelCarne.add(entColor);
			panelCarne.add(panColor);
			panelCarne.add(entCorte);
			panelCarne.add(panCorte);
			panelCarne.add(entIndex);
			panelCarne.add(panIndex);

			panelChicles.add(entCantidad);
			panelChicles.add(panCantidad);
			panelChicles.add(entAzucar);
			panelChicles.add(panAzucar);
			panelChicles.add(entSabor);
			panelChicles.add(panSabor);

			panelPapas.add(entSabor);
			panelPapas.add(panSabor);
			panelPapas.add(entPeso);
			panelPapas.add(panPeso);
			panelPapas.add(entCalorias);
			panelPapas.add(panCalorias);

			panelAgua.add(panMililitros);
			panelAgua.add(entMililitros);

		}

		public void mostrarIndex() {
			entIndex.setVisible(true);
			panIndex.setVisible(true);
		}
		public void ocultarIndex() {
			entIndex.setVisible(false);
			panIndex.setVisible(false);
		}
}
