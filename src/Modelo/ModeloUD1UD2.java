package Modelo;

import Vista.VistaPrincipal;

public class ModeloUD1UD2 {
	private VistaPrincipal miVista;
	private String minutos;
	private String horas;
	private int suma;

	/**
	 * @param minutos
	 *            iniciales
	 * @param horas
	 *            iniciales
	 * @TODO: El m�todo actualiza los atributos minutos y horas de la clase. Se debe
	 *        incrementar la cantidad de minutos (pe 05:11 -> 05:12) Si la cantidad
	 *        de minutos es 59, en lugar de poner 60 se debe poner 00 (pe 05:59 ->
	 *        05:00) Ademas, en el caso anterior se debe incrementar el n�mero de
	 *        horas (pe 05:59 -> 06:00) Ademas, en el caso de que las horas sean 23
	 *        y los minutos 59, se debe poner todo a 0 (pe 23:59 -> 00:00) No se
	 *        debe comprobar que los datos que se introducen son correctos
	 */
	public void unMinutoMas(int minutos, int horas) {
		// Pon aqui tu codigo

		/*
		 * Debes cambiar estas dos lineas para poner los minutos y horas resultantes al
		 * anadir un minuto mas a los minutos y horas que vienen por parametro
		 */
		this.minutos = "--";
		this.horas = "--";
		// Esta linea no se debe tocar
		miVista.unMinutoMas();
	}

	/**
	 * @param numero
	 * @TODO: Se deben sumar las cifras pares de un entero (pe 12345 -> 2 + 4 = 6).
	 *       El programa debe funcionar con independencia del n�mero de cifras que
	 *       se introduzcan. No se debe comprobar que los datos que se introducen
	 *       son correctos.
	 */
	public void sumaDigitosPares(int numero) {
		// Pon aqui tu codigo

		/*
		 * Debes cambiar esta linea para indicar la suma de las cifras pares del numero
		 */
		this.suma = -1;
		// Esta linea no se debe tocar
		miVista.sumaDigitosPares();
	}

	// Metodos setters
	public void setVista(VistaPrincipal miVista) {
		this.miVista = miVista;
	}

	// Metodos getters
	public String getMinutos() {
		return minutos;
	}

	public String getHoras() {
		return horas;
	}

	public int getSuma() {
		return suma;
	}
}
