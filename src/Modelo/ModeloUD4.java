package Modelo;

import Vista.VistaPrincipal;

public class ModeloUD4 {
	private VistaPrincipal miVista;
	private Poligono miPoligono;

	private String area;
	private String perimetro;

	/**
	 * @TODO Debe ser abstracta y tener sus metodos abstractos. Debe tener un
	 *       atributo de tipo int llamado lado1.
	 */
	private class Poligono {

		public String getArea() {
			return "Sin hacer";
		}

		public String getPerimetro() {
			return "Sin hacer";
		}
	}

	/**
	 * @TODO Debe heredar de Poligono. Debe tener un constructor que utiliza super()
	 *       para dar valor al atributo. Debe implementar los metodos getters
	 *       sabiendo que el area es lado1 * lado1 y el perimetro es 4 * lado1.
	 */
	private class Cuadrado {

	}

	/**
	 * @TODO Debe heredar de Poligono. Debe tener un atributo de tipo int llamado
	 *       lado2. Debe tener un constructor que utiliza super() para dar valor al
	 *       lado2. Debe implementar los metodos getters sabiendo que el area es
	 *       lado1 * lado2 y el perimetro es 2 * lado1 + 2 * lado2.
	 */
	private class Rectangulo {

	}

	/**
	 * @param lado1
	 * @param lado2
	 * @TODO Si lado2 esta vacio debe crear un poligono de tipo Cuadrado sino se
	 *       entendera que es un Rectangulo.
	 */
	public void area(String lado1, String lado2) {
		/*
		 * Se debe cambiar este metodo para que genere el poligono adecuado
		 */
		Poligono miPoligono = new Poligono();

		// Estas lineas no se deben tocar
		this.area = miPoligono.getArea();
		miVista.area();
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @TODO Si lado2 esta vacio debe crear un poligono de tipo Cuadrado sino se
	 *       entendera que es un Rectangulo.
	 */
	public void perimetro(String lado1, String lado2) {
		/*
		 * Se debe cambiar este metodo para que genere el poligono adecuado
		 */
		Poligono miPoligono = new Poligono();
		// Estas lineas no se deben tocar
		this.perimetro = miPoligono.getPerimetro();
		miVista.perimetro();
	}

	// Metodos getters
	public String getArea() {
		return area;
	}

	public String getPerimetro() {
		return perimetro;
	}

	// Metodos setters
	public void setVista(VistaPrincipal miVista) {
		this.miVista = miVista;
	}
}
