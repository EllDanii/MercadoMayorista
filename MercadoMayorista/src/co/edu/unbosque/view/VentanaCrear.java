package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCrear extends JFrame {

	private JPanel panelCarne, panelAgua, panelChicles, panelPapas;

	private JLabel titulo, panPesoCarne, panPesoPapas, panMililitros, panTipo, panColor, panCorte, panCantidad,
			panAzucar, panSaborChicle, panSaborPapas, panCalorias, panMarca, panPrecio;

	private JTextField entPesoCarne, entPesoPapas, entMililitros, entTipo, entColor, entCorte, entCantidad, entAzucar,
			entSaborChicle, entSaborPapas, entCalorias, entMarca, entPrecio;

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
		panelCarne.setBounds(0, 190, 1100, 360);
		panelCarne.setLayout(null);
		panelCarne.setVisible(true);

		panelAgua = new JPanel();
		panelAgua.setBounds(0, 190, 1100, 360);
		panelAgua.setLayout(null);
		panelAgua.setVisible(false);

		panelChicles = new JPanel();
		panelChicles.setBounds(0, 190, 1100, 360);
		panelChicles.setLayout(null);
		panelChicles.setVisible(false);

		panelPapas = new JPanel();
		panelPapas.setBounds(0, 190, 1100, 360);
		panelPapas.setLayout(null);
		panelPapas.setVisible(false);

		entMarca = new JTextField();
		entMarca.setBounds(60, 90, 700, 40);

		panMarca = new JLabel();
		panMarca.setBounds(800, 90, 700, 40);
		panMarca.setText("<-- Marca");
		panMarca.setForeground(Color.black);
		panMarca.setFont(new Font("Arial", Font.BOLD, 13));

		entPrecio = new JTextField();
		entPrecio.setBounds(60, 140, 700, 40);

		panPrecio = new JLabel();
		panPrecio.setBounds(800, 140, 700, 40);
		panPrecio.setText("<-- Precio");
		panPrecio.setForeground(Color.black);
		panPrecio.setFont(new Font("Arial", Font.BOLD, 13));

		entPesoCarne = new JTextField();
		entPesoCarne.setBounds(60, 0, 700, 40);

		panPesoCarne = new JLabel();
		panPesoCarne.setBounds(800, 0, 700, 40);
		panPesoCarne.setText("<-- Peso");
		panPesoCarne.setForeground(Color.black);
		panPesoCarne.setFont(new Font("Arial", Font.BOLD, 13));

		entPesoPapas = new JTextField();
		entPesoPapas.setBounds(60, 50, 700, 40);

		panPesoPapas = new JLabel();
		panPesoPapas.setBounds(800, 50, 700, 40);
		panPesoPapas.setText("<-- Peso");
		panPesoPapas.setForeground(Color.black);
		panPesoPapas.setFont(new Font("Arial", Font.BOLD, 13));

		entMililitros = new JTextField();
		entMililitros.setBounds(60, 0, 700, 40);

		panMililitros = new JLabel();
		panMililitros.setBounds(800, 0, 700, 40);
		panMililitros.setText("<-- Mililitros");
		panMililitros.setForeground(Color.black);
		panMililitros.setFont(new Font("Arial", Font.BOLD, 13));

		entTipo = new JTextField();
		entTipo.setBounds(60, 50, 700, 40);

		panTipo = new JLabel();
		panTipo.setBounds(800, 50, 700, 40);
		panTipo.setText("<-- Tipo");
		panTipo.setForeground(Color.black);
		panTipo.setFont(new Font("Arial", Font.BOLD, 13));

		entColor = new JTextField();
		entColor.setBounds(60, 100, 700, 40);

		panColor = new JLabel();
		panColor.setBounds(800, 100, 700, 40);
		panColor.setText("<-- Color");
		panColor.setForeground(Color.black);
		panColor.setFont(new Font("Arial", Font.BOLD, 13));

		entCorte = new JTextField();
		entCorte.setBounds(60, 150, 700, 40);

		panCorte = new JLabel();
		panCorte.setBounds(800, 150, 700, 40);
		panCorte.setText("<-- Corte");
		panCorte.setForeground(Color.black);
		panCorte.setFont(new Font("Arial", Font.BOLD, 13));

		entCantidad = new JTextField();
		entCantidad.setBounds(60, 0, 700, 40);

		panCantidad = new JLabel();
		panCantidad.setBounds(800, 0, 700, 40);
		panCantidad.setText("<-- Cantidad");
		panCantidad.setForeground(Color.black);
		panCantidad.setFont(new Font("Arial", Font.BOLD, 13));

		entAzucar = new JTextField();
		entAzucar.setBounds(60, 50, 700, 40);

		panAzucar = new JLabel();
		panAzucar.setBounds(800, 50, 700, 40);
		panAzucar.setText("<-- Tiene azucar?");
		panAzucar.setForeground(Color.black);
		panAzucar.setFont(new Font("Arial", Font.BOLD, 13));

		entSaborChicle = new JTextField();
		entSaborChicle.setBounds(60, 100, 700, 40);

		panSaborChicle = new JLabel();
		panSaborChicle.setBounds(800, 100, 700, 40);
		panSaborChicle.setText("<-- Sabor");
		panSaborChicle.setForeground(Color.black);
		panSaborChicle.setFont(new Font("Arial", Font.BOLD, 13));

		entSaborPapas = new JTextField();
		entSaborPapas.setBounds(60, 0, 700, 40);

		panSaborPapas = new JLabel();
		panSaborPapas.setBounds(800, 0, 700, 40);
		panSaborPapas.setText("<-- Sabor");
		panSaborPapas.setForeground(Color.black);
		panSaborPapas.setFont(new Font("Arial", Font.BOLD, 13));

		entCalorias = new JTextField();
		entCalorias.setBounds(60, 100, 700, 40);

		panCalorias = new JLabel();
		panCalorias.setBounds(800, 100, 700, 40);
		panCalorias.setText("<-- Calorias");
		panCalorias.setForeground(Color.black);
		panCalorias.setFont(new Font("Arial", Font.BOLD, 13));

		add(botonCrear);
		add(botonVolver);
		add(panelAgua);
		add(panelChicles);
		add(panelPapas);
		add(panelCarne);
		add(entMarca);
		add(panMarca);
		add(entPrecio);
		add(panPrecio);

		panelCarne.add(entPesoCarne);
		panelCarne.add(panPesoCarne);
		panelCarne.add(entTipo);
		panelCarne.add(panTipo);
		panelCarne.add(entColor);
		panelCarne.add(panColor);
		panelCarne.add(entCorte);
		panelCarne.add(panCorte);

		panelChicles.add(entCantidad);
		panelChicles.add(panCantidad);
		panelChicles.add(entAzucar);
		panelChicles.add(panAzucar);
		panelChicles.add(entSaborChicle);
		panelChicles.add(panSaborChicle);

		panelPapas.add(entSaborPapas);
		panelPapas.add(panSaborPapas);
		panelPapas.add(entPesoPapas);
		panelPapas.add(panPesoPapas);
		panelPapas.add(entCalorias);
		panelPapas.add(panCalorias);

		panelAgua.add(panMililitros);
		panelAgua.add(entMililitros);

		panelAgua.setVisible(false);
		panelChicles.setVisible(false);
		panelPapas.setVisible(false);
		panelCarne.setVisible(false);

	}

	public JPanel getPanelCarne() {
		return panelCarne;
	}

	public void setPanelCarne(JPanel panelCarne) {
		this.panelCarne = panelCarne;
	}

	public JPanel getPanelAgua() {
		return panelAgua;
	}

	public void setPanelAgua(JPanel panelAgua) {
		this.panelAgua = panelAgua;
	}

	public JPanel getPanelChicles() {
		return panelChicles;
	}

	public void setPanelChicles(JPanel panelChicles) {
		this.panelChicles = panelChicles;
	}

	public JPanel getPanelPapas() {
		return panelPapas;
	}

	public void setPanelPapas(JPanel panelPapas) {
		this.panelPapas = panelPapas;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getPanPesoCarne() {
		return panPesoCarne;
	}

	public void setPanPesoCarne(JLabel panPesoCarne) {
		this.panPesoCarne = panPesoCarne;
	}

	public JLabel getPanPesoPapas() {
		return panPesoPapas;
	}

	public void setPanPesoPapas(JLabel panPesoPapas) {
		this.panPesoPapas = panPesoPapas;
	}

	public JLabel getPanMililitros() {
		return panMililitros;
	}

	public void setPanMililitros(JLabel panMililitros) {
		this.panMililitros = panMililitros;
	}

	public JLabel getPanTipo() {
		return panTipo;
	}

	public void setPanTipo(JLabel panTipo) {
		this.panTipo = panTipo;
	}

	public JLabel getPanColor() {
		return panColor;
	}

	public void setPanColor(JLabel panColor) {
		this.panColor = panColor;
	}

	public JLabel getPanCorte() {
		return panCorte;
	}

	public void setPanCorte(JLabel panCorte) {
		this.panCorte = panCorte;
	}

	public JLabel getPanCantidad() {
		return panCantidad;
	}

	public void setPanCantidad(JLabel panCantidad) {
		this.panCantidad = panCantidad;
	}

	public JLabel getPanAzucar() {
		return panAzucar;
	}

	public void setPanAzucar(JLabel panAzucar) {
		this.panAzucar = panAzucar;
	}

	public JLabel getPanSaborChicle() {
		return panSaborChicle;
	}

	public void setPanSaborChicle(JLabel panSaborChicle) {
		this.panSaborChicle = panSaborChicle;
	}

	public JLabel getPanSaborPapas() {
		return panSaborPapas;
	}

	public void setPanSaborPapas(JLabel panSaborPapas) {
		this.panSaborPapas = panSaborPapas;
	}

	public JLabel getPanCalorias() {
		return panCalorias;
	}

	public void setPanCalorias(JLabel panCalorias) {
		this.panCalorias = panCalorias;
	}

	public JLabel getPanMarca() {
		return panMarca;
	}

	public void setPanMarca(JLabel panMarca) {
		this.panMarca = panMarca;
	}

	public JLabel getPanPrecio() {
		return panPrecio;
	}

	public void setPanPrecio(JLabel panPrecio) {
		this.panPrecio = panPrecio;
	}

	public JTextField getEntPesoCarne() {
		return entPesoCarne;
	}

	public void setEntPesoCarne(JTextField entPesoCarne) {
		this.entPesoCarne = entPesoCarne;
	}

	public JTextField getEntPesoPapas() {
		return entPesoPapas;
	}

	public void setEntPesoPapas(JTextField entPesoPapas) {
		this.entPesoPapas = entPesoPapas;
	}

	public JTextField getEntMililitros() {
		return entMililitros;
	}

	public void setEntMililitros(JTextField entMililitros) {
		this.entMililitros = entMililitros;
	}

	public JTextField getEntTipo() {
		return entTipo;
	}

	public void setEntTipo(JTextField entTipo) {
		this.entTipo = entTipo;
	}

	public JTextField getEntColor() {
		return entColor;
	}

	public void setEntColor(JTextField entColor) {
		this.entColor = entColor;
	}

	public JTextField getEntCorte() {
		return entCorte;
	}

	public void setEntCorte(JTextField entCorte) {
		this.entCorte = entCorte;
	}

	public JTextField getEntCantidad() {
		return entCantidad;
	}

	public void setEntCantidad(JTextField entCantidad) {
		this.entCantidad = entCantidad;
	}

	public JTextField getEntAzucar() {
		return entAzucar;
	}

	public void setEntAzucar(JTextField entAzucar) {
		this.entAzucar = entAzucar;
	}

	public JTextField getEntSaborChicle() {
		return entSaborChicle;
	}

	public void setEntSaborChicle(JTextField entSaborChicle) {
		this.entSaborChicle = entSaborChicle;
	}

	public JTextField getEntSaborPapas() {
		return entSaborPapas;
	}

	public void setEntSaborPapas(JTextField entSaborPapas) {
		this.entSaborPapas = entSaborPapas;
	}

	public JTextField getEntCalorias() {
		return entCalorias;
	}

	public void setEntCalorias(JTextField entCalorias) {
		this.entCalorias = entCalorias;
	}

	public JTextField getEntMarca() {
		return entMarca;
	}

	public void setEntMarca(JTextField entMarca) {
		this.entMarca = entMarca;
	}

	public JTextField getEntPrecio() {
		return entPrecio;
	}

	public void setEntPrecio(JTextField entPrecio) {
		this.entPrecio = entPrecio;
	}

	public JButton getBotonCrear() {
		return botonCrear;
	}

	public void setBotonCrear(JButton botonCrear) {
		this.botonCrear = botonCrear;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

}
