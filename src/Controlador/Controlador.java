package Controlador;

import Modelo.ModeloUD1UD2;
import Modelo.ModeloUD3;
import Modelo.ModeloUD4;
import Modelo.ModeloUD5UD6;
import Vista.VistaPrincipal;

public class Controlador {
	private VistaPrincipal miVista;
	private ModeloUD1UD2 miModelo12;
	private ModeloUD3 miModelo3;
	private ModeloUD4 miModelo4;
	private ModeloUD5UD6 miModelo56;
	
	//Controlador del panel UD1UD2
	public void unMinutoMas() {
		miModelo12.unMinutoMas(miVista.getMinutos(),miVista.getHoras());
	}
	public void sumaDigitosPares() {
		miModelo12.sumaDigitosPares(miVista.getNumero());
	}
	
	//Controlador del panel UD3
	public void repetidos() {
		miModelo3.repetidos(miVista.getNumeros());
	}
	public void masVeces() {
		miModelo3.masVeces(miVista.getNumeros());
	}
	public void acortar() {
		miModelo3.acortar(miVista.getNombre());
	}
	
	//Controlador del panel UD4
	public void area() {
		miModelo4.area(miVista.getLado1(),miVista.getLado2());
	}
	
	public void perimetro() {
		miModelo4.perimetro(miVista.getLado1(),miVista.getLado2());
	}
	
	//Controlador del panel UD5UD6
	public void nuevoAlumno() {
		miModelo56.nuevoAlumno(miVista.getAlumno(), miVista.getNota());
	}
	
	public void eliminarAlumno() {
		miModelo56.eliminarAlumno(miVista.getAlumno());
		
	}
	
	public void setMiVista(VistaPrincipal miVista) {
		this.miVista = miVista;
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
	public void cargar() {
		this.miModelo56.cargar();
	}
	public void salvar() {
		this.miModelo56.salvar(miVista.getTablaAlumnos());
		
	}







}
