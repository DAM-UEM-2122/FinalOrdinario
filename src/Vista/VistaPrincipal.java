package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.ModeloUD1UD2;
import Modelo.ModeloUD3;
import Modelo.ModeloUD4;
import Modelo.ModeloUD5UD6;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VistaPrincipal extends JFrame {

	private Controlador miControlador;
	private ModeloUD1UD2 miModelo12;
	private ModeloUD3 miModelo3;
	private ModeloUD4 miModelo4;
	private ModeloUD5UD6 miModelo56;

	private JPanel contentPane;
	private JTextField txtHoras;
	private JTextField txtMinutos;
	private JTextField txtNumero;
	private JLabel lblResSuma;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JTextField txtN4;
	private JTextField txtN5;
	private JTextField txtNombre;
	private JLabel lblResRepetidos;
	private JLabel lblResMasVeces;
	private JLabel lblResAcortar;
	private JTextField txtLado1;
	private JTextField txtLado2;
	private JLabel lblResArea;
	private JLabel lblResPerimetro;
	private JTextField txtContacto;
	private JTextField txtTelefono;
	private JLabel lblResContacto;
	private Object[][] tablaAlumnos;
	private JTable tblAlumnos;
	private JButton btnCargar;
	private JButton btnSalvar;
	private JLabel lblResAlum;
	private JTextField txtAlumno;
	private JTextField txtNota;
	
	public VistaPrincipal() {
		// Establezco el aspecto general de la ventana
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Configuracion general de la ventana
		setTitle("Final Ordinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		// Se crea el conjunto de pestanas
		JTabbedPane eyelash = new JTabbedPane();
		contentPane.add(eyelash);
		
		// UD1-UD2 (Videojuegos + Sentencias de Control)
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		JLabel et_p1 = new JLabel("Videojuegos + Sentencias de Control");
		et_p1.setBounds(121, 5, 177, 14);
		panel1.add(et_p1);
		eyelash.addTab("UD1 - UD2", panel1);

		txtHoras = new JTextField();
		txtHoras.setText("00");
		txtHoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHoras.setBounds(59, 54, 29, 31);
		panel1.add(txtHoras);
		txtHoras.setColumns(10);

		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(90, 62, 7, 14);
		panel1.add(label);

		txtMinutos = new JTextField();
		txtMinutos.setText("00");
		txtMinutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMinutos.setColumns(10);
		txtMinutos.setBounds(100, 54, 29, 31);
		panel1.add(txtMinutos);

		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.unMinutoMas();
			}
		});
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMas.setBounds(139, 54, 47, 31);
		panel1.add(btnMas);

		txtNumero = new JTextField();
		txtNumero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtNumero.setText("");
				txtNumero.setForeground(null);
			}
		});
		txtNumero.setForeground(Color.LIGHT_GRAY);
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setText("0");
		txtNumero.setBounds(59, 123, 70, 20);
		panel1.add(txtNumero);
		txtNumero.setColumns(10);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.sumaDigitosPares();
			}
		});
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSuma.setBounds(139, 122, 47, 23);
		panel1.add(btnSuma);

		JLabel lblSuma = new JLabel("Suma digitos pares:");
		lblSuma.setBounds(214, 126, 111, 14);
		panel1.add(lblSuma);

		lblResSuma = new JLabel("---");
		lblResSuma.setBounds(318, 126, 91, 14);
		panel1.add(lblResSuma);

		// UD3 (Arrays, String, Colecciones)
		JPanel panel2 = new JPanel();

		panel2.setLayout(null);
		JLabel et_p2 = new JLabel("Arrays, String, Colecciones");
		et_p2.setBounds(144, 5, 130, 14);
		panel2.add(et_p2);
		eyelash.addTab("UD3", panel2);

		txtN1 = new JTextField();
		txtN1.setForeground(Color.LIGHT_GRAY);
		txtN1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtN1.setText("");
				txtN1.setForeground(null);
			}
		});
		txtN1.setText("0");
		txtN1.setBounds(49, 62, 19, 20);
		panel2.add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtN2.setText("");
				txtN2.setForeground(null);
			}
		});
		txtN2.setForeground(Color.LIGHT_GRAY);
		txtN2.setText("0");
		txtN2.setColumns(10);
		txtN2.setBounds(78, 62, 19, 20);
		panel2.add(txtN2);

		txtN3 = new JTextField();
		txtN3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtN3.setText("");
				txtN3.setForeground(null);
			}
		});
		txtN3.setForeground(Color.LIGHT_GRAY);
		txtN3.setText("0");
		txtN3.setColumns(10);
		txtN3.setBounds(107, 62, 19, 20);
		panel2.add(txtN3);

		txtN4 = new JTextField();
		txtN4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtN4.setText("");
				txtN4.setForeground(null);
			}
		});
		txtN4.setForeground(Color.LIGHT_GRAY);
		txtN4.setText("0");
		txtN4.setColumns(10);
		txtN4.setBounds(136, 62, 19, 20);
		panel2.add(txtN4);

		txtN5 = new JTextField();
		txtN5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtN5.setText("");
				txtN5.setForeground(null);
			}
		});
		txtN5.setForeground(Color.LIGHT_GRAY);
		txtN5.setText("0");
		txtN5.setColumns(10);
		txtN5.setBounds(165, 62, 19, 20);
		panel2.add(txtN5);

		JButton btnRepetidos = new JButton("Repetidos ?");
		btnRepetidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.repetidos();
			}
		});
		btnRepetidos.setBounds(194, 61, 89, 23);
		panel2.add(btnRepetidos);

		JButton btnMsVeces = new JButton("Mas Veces");
		btnMsVeces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.masVeces();
			}
		});
		btnMsVeces.setBounds(194, 107, 89, 23);
		panel2.add(btnMsVeces);

		JLabel lblNombre = new JLabel("Nombre y Apellido:");
		lblNombre.setBounds(49, 143, 106, 14);
		panel2.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(49, 159, 106, 20);
		panel2.add(txtNombre);
		txtNombre.setColumns(10);

		JButton btnAcortar = new JButton("Acortar");
		btnAcortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.acortar();
			}
		});
		btnAcortar.setBounds(194, 158, 89, 23);
		panel2.add(btnAcortar);

		lblResRepetidos = new JLabel("---");
		lblResRepetidos.setBounds(293, 65, 116, 14);
		panel2.add(lblResRepetidos);

		lblResMasVeces = new JLabel("---");
		lblResMasVeces.setBounds(293, 111, 116, 14);
		panel2.add(lblResMasVeces);

		lblResAcortar = new JLabel("---");
		lblResAcortar.setBounds(293, 162, 116, 14);
		panel2.add(lblResAcortar);

		// UD4 (Relaciones entre objetos, Herencia, Interfaces)
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		JLabel et_p3 = new JLabel("Relaciones entre objetos, Herencia, Interfaces");
		et_p3.setBounds(97, 5, 225, 14);
		panel3.add(et_p3);
		eyelash.addTab("UD4", panel3);
		
		JLabel lblLado1 = new JLabel("Lado 1:");
		lblLado1.setBounds(46, 76, 46, 14);
		panel3.add(lblLado1);
		
		JLabel lblLado2 = new JLabel("Lado 2:");
		lblLado2.setBounds(46, 101, 46, 14);
		panel3.add(lblLado2);
		
		txtLado1 = new JTextField();
		txtLado1.setBounds(97, 73, 46, 20);
		panel3.add(txtLado1);
		txtLado1.setColumns(10);
		
		txtLado2 = new JTextField();
		txtLado2.setColumns(10);
		txtLado2.setBounds(97, 98, 46, 20);
		panel3.add(txtLado2);
		
		JButton btnArea = new JButton("Area");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.area();
			}
		});
		btnArea.setBounds(153, 72, 89, 23);
		panel3.add(btnArea);
		
		JButton btnPerimetro = new JButton("Perimetro");
		btnPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.perimetro();
			}
		});
		btnPerimetro.setBounds(153, 97, 89, 23);
		panel3.add(btnPerimetro);
		
		lblResArea = new JLabel("---");
		lblResArea.setBounds(252, 76, 70, 14);
		panel3.add(lblResArea);
		
		lblResPerimetro = new JLabel("---");
		lblResPerimetro.setBounds(252, 101, 70, 14);
		panel3.add(lblResPerimetro);

		// UD5-UD6 (Bases de datos y Ficheros)
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		
		JLabel et_p5 = new JLabel("Diseño y Almacenamiento de Datos");
		et_p5.setBounds(121, 5, 177, 14);
		panel5.add(et_p5);
		eyelash.addTab("UD5 - UD6", panel5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 35, 240, 106);
		panel5.add(scrollPane);

		tblAlumnos = new JTable();
		tblAlumnos.setModel(new DefaultTableModel(tablaAlumnos,	new String[] { "Alumno", "Nota" }));
		scrollPane.setViewportView(tblAlumnos);

		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cargar();
			}
		});
		btnCargar.setBounds(312, 81, 74, 23);
		panel5.add(btnCargar);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.salvar();
			}
		});
		btnSalvar.setBounds(312, 118, 74, 23);
		panel5.add(btnSalvar);

		lblResAlum = new JLabel("");
		lblResAlum.setBounds(270, 198, 139, 14);
		panel5.add(lblResAlum);
		
		txtAlumno = new JTextField();
		txtAlumno.setBounds(24, 162, 107, 20);
		panel5.add(txtAlumno);
		txtAlumno.setColumns(10);
		
		txtNota = new JTextField();
		txtNota.setBounds(141, 162, 101, 20);
		panel5.add(txtNota);
		txtNota.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.nuevoAlumno();
			}
		});
		btnNuevo.setBounds(24, 193, 107, 23);
		panel5.add(btnNuevo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.eliminarAlumno();
			}
		});
		btnBorrar.setBounds(141, 193, 101, 23);
		panel5.add(btnBorrar);
	
	
	}

	// Getters de UD1UD2
	public int getHoras() {
		return Integer.parseInt(txtHoras.getText());
	}

	public int getMinutos() {
		return Integer.parseInt(txtMinutos.getText());
	}

	public int getNumero() {
		return Integer.parseInt(txtNumero.getText());
	}

	// Getters de UD3
	public int[] getNumeros() {
		int n1 = getEntero(txtN1.getText());
		int n2 = getEntero(txtN2.getText());
		int n3 = getEntero(txtN3.getText());
		int n4 = getEntero(txtN4.getText());
		int n5 = getEntero(txtN5.getText());
		return new int[] { n1, n2, n3, n4, n5 };
	}
	private int getEntero(String n) {
		int res = -1;
		if (!n.equals(""))
			res=Integer.parseInt(n);
		return res;
	}
	
	public String getNombre() {
		return txtNombre.getText();
	}
	
	// Getters de UD4
	public String getLado1() {
		return txtLado1.getText();
	}
	public String getLado2() {
		return txtLado2.getText();
	}
	
	// Getters de UD56
	public Object[][] getTablaAlumnos() {
		return tablaAlumnos;
	}
	
	public String getAlumno() {
		return txtAlumno.getText();
	}

	public String getNota() {
		return txtNota.getText();
	}
	
	// Setters para que la Vista conozca controlador y modelos
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo12(ModeloUD1UD2 miModelo12) {
		this.miModelo12 = miModelo12;
	}

	public void setModelo3(ModeloUD3 miModelo3) {
		this.miModelo3 = miModelo3;
	}

	public void setModelo4(ModeloUD4 miModelo4) {
		this.miModelo4 = miModelo4;
	}

	public void setModelo56(ModeloUD5UD6 miModelo56) {
		this.miModelo56 = miModelo56;
	}

	// Metodos para UD1UD2 tras hacer los cambios
	public void unMinutoMas() {
		txtHoras.setText(miModelo12.getHoras());
		txtMinutos.setText(miModelo12.getMinutos());
	}

	public void sumaDigitosPares() {
		int valor = miModelo12.getSuma();
		String respuesta = "Sin hacer";
		if (valor != -1)
			respuesta = String.valueOf(valor);
		lblResSuma.setText(respuesta);
	}

	// Metodos para UD3 tras hacer los cambios
	public void hayRepetidos() {
		String res = "Sin hacer";
		switch (miModelo3.getRepetidos()) {
		case 1:
			res = "Hay Repetidos";
			break;
		case 2:
			res = "No hay Repetidos";
			break;
		}
		lblResRepetidos.setText(res);
	}

	public void masVeces() {
		String res = "Sin hacer";
		int valor = miModelo3.getMasVeces();
		if (valor != -1)
			res = String.valueOf(valor);
		lblResMasVeces.setText(res);
	}

	public void acortar() {
		lblResAcortar.setText(miModelo3.getNombreCorto());
	}
	
	// Metodos para UD4 tras hacer los cambios
	public void area() {
		lblResArea.setText(miModelo4.getArea());
	}
	public void perimetro() {
		lblResPerimetro.setText(miModelo4.getPerimetro());
		
	}

	// Metodos para UD56 tras hacer los cambios
	public void nuevoAlumno() {
		lblResContacto.setText(miModelo56.getRespuesta());
		txtAlumno.setText("");
		txtNota.setText("");
	}

	public void eliminarAlumno() {
		lblResContacto.setText(miModelo56.getRespuesta());
		txtAlumno.setText("");
		txtNota.setText("");
	}

	public void actualizaAlumnos() {
		tblAlumnos.setModel(new DefaultTableModel(miModelo56.getTablaAlumnos(),new String[] { "Alumno", "Nota" }));
		lblResAlum.setText(miModelo56.getRespuesta());	
	}
	
	public void actualizaAlumnosSalvar() {
		lblResAlum.setText(miModelo56.getRespuesta());
		
	}

}
