import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaEliminar extends JFrame {

	private JPanel panelCarne, panelProd;
	private JLabel titulo, panMarca, panCorte;
	private JTextField entMarca, entCorte;
	private JButton botonEliminar, botonVolver;

	public VentanaEliminar() {

		setBounds(200, 200, 1100, 550);
		setTitle("Inicio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		titulo = new JLabel();
		titulo.setBounds(150, 0, 900, 120);
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Arial", Font.BOLD, 37));

		botonEliminar = new JButton();
		botonEliminar.setBounds(930, 450, 130, 50);
		botonEliminar.setForeground(Color.black);
		botonEliminar.setText("Crear");
		botonEliminar.setFont(new Font("Arial", Font.BOLD, 20));

		botonVolver = new JButton();
		botonVolver.setBounds(10, 10, 120, 50);
		botonVolver.setForeground(Color.black);
		botonVolver.setText("Volver");
		botonVolver.setFont(new Font("Arial", Font.BOLD, 20));

		panelCarne = new JPanel();
		panelCarne.setBounds(0, 190, 1100, 360);
		panelCarne.setLayout(null);
		panelCarne.setVisible(true);

		panelProd = new JPanel();
		panelProd.setBounds(0, 190, 1100, 360);
		panelProd.setLayout(null);
		panelProd.setVisible(true);

		entMarca = new JTextField();
		entMarca.setBounds(60, 90, 700, 40);

		panMarca = new JLabel();
		panMarca.setBounds(800, 90, 700, 40);
		panMarca.setText("<-- Marca");
		panMarca.setForeground(Color.black);
		panMarca.setFont(new Font("Arial", Font.BOLD, 13));

		entCorte = new JTextField();
		entCorte.setBounds(60, 90, 700, 40);

		panCorte = new JLabel();
		panCorte.setBounds(800, 90, 700, 40);
		panCorte.setText("<-- Marca");
		panCorte.setForeground(Color.black);
		panCorte.setFont(new Font("Arial", Font.BOLD, 13));

		panelCarne.add(entCorte);
		panelCarne.add(panCorte);

		panelProd.add(entMarca);
		panelProd.add(panCorte);

	}

}
