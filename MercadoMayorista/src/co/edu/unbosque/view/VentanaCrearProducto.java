package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearProducto extends JFrame {
    private JTextField txtNombre, txtPrecio, txtCantidad;
    private JTextArea areaMostrar;
    
    public VentanaCrearProducto() {
        setTitle("Crear Producto");
        setBounds(300, 100, 1000, 600);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); //este lo uso para alinear las cosas a la izquierda
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtNombre = new JTextField(40);
        txtPrecio = new JTextField(40);
        txtCantidad = new JTextField(40);
        areaMostrar = new JTextArea(15, 20);
        areaMostrar.setEditable(false);

        JButton btnCrear = new JButton("Crear");
        JButton btnMostrar = new JButton("Mostrar");

        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Precio:"));
        add(txtPrecio);
        add(new JLabel("Cantidad:"));
        add(txtCantidad);
        add(btnCrear);
        add(btnMostrar);
        add(new JScrollPane(areaMostrar));

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearProducto();
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarProductos();
            }
        });
    }

    private void crearProducto() {
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String cantidad = txtCantidad.getText();
        areaMostrar.append("Producto creado: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + "\n");
        limpiarCampos();
    }

    private void mostrarProductos() {
        areaMostrar.append("Mostrando todos los productos...\n");
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public JTextArea getAreaMostrar() {
		return areaMostrar;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public void setAreaMostrar(JTextArea areaMostrar) {
		this.areaMostrar = areaMostrar;
	}
}



