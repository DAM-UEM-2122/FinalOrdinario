package Modelo;

import Vista.VistaPrincipal;

public class ModeloUD3 {
	private VistaPrincipal miVista;
	private int repetidos;
	private int masVeces;
	private String nombreCorto;

	/**
	 * @param numeros
	 *            Array de enteros con la lista de numeros
	 * @TODO Este metodo recorre un array para saber si hay numeros que se repiten.
	 *       Hay dos posibilidades para la respuesta (atributo hayRepetidos): 
	 *       1 - Si hay repetidos. 
	 *       2 - Si no los hay
	 */
	public void repetidos(int[] numeros) {
		// Por aqui tu codigo

		/*
		 * Debes cambiar este metodo para que el atributo repetidos tenga: 1 si en el
		 * array hay numeros repetidos 2 si no hay numeros repetidos
		 */
		this.repetidos = 0;
		// Esta linea no se debe tocar
		miVista.hayRepetidos();
	}

	/**
	 * @param numeros
	 *            Array de enteros con la lista de numeros
	 * @TODO Este metodo busca el numero que mas veces se repite en un array. Si
	 *       todos se repiten igual cantidad de veces, se devolvera 0. El numero -1
	 *       se deben descartar de la busqueda.
	 */
	public void masVeces(int[] numeros) {
		// Por aqui tu codigo

		/*
		 * Debes cambiar este metodo para que el atributo masVeces tenga el numero que
		 * mas veces se repite
		 */
		this.masVeces = -1;
		// Esta linea no se debe tocar
		miVista.masVeces();
	}

	/**
	 * @param nombre
	 *            String con el nombre inicial
	 * @TODO Este metodo transforma un Nombre y Apellido en Apellido, N. De esta
	 *       forma, la cadena "Pedro Camacho" se transformara en "Camacho, P."
	 * 
	 */
	public void acortar(String nombre) {
		// Por aqui tu codigo

		/*
		 * Debes cambiar este metodo para que el atributo nombreCorto tenga el Apellido
		 * seguido de una coma y la inical del nombre
		 */
		this.nombreCorto = "Sin hacer";
		// Esta linea no se debe tocar
		miVista.acortar();
	}

	// Metodos getters
	public int getRepetidos() {
		return repetidos;
	}

	public int getMasVeces() {
		return masVeces;
	}

	// Metodos setters
	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setVista(VistaPrincipal miVista) {
		this.miVista = miVista;
	}
}
