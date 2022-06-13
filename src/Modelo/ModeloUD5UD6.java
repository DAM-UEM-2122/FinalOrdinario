package Modelo;

import Vista.VistaPrincipal;

public class ModeloUD5UD6 {
	private VistaPrincipal miVista;
	/**
	 * En este atributo se debe dejar siempre la respuesta del m�todo
	 */
	private String respuesta;
	/**
	 * En este atributo se tiene la relacion de alumnos y notas
	 */
	private Object[][] tablaAlumnos;

	// M�todos UD5

	/**
	 * @param alumno
	 *            Nombre del alumno
	 * @param nota
	 *            Nota del alumno
	 * @TODO El metodo incluye un nuevo alumno y su nota en la tabla. El boton
	 *       estara activo cuando esten rellenos los campos editables de alumno y
	 *       nota. Cuando se pulsa se deberan borrar los datos de los campos
	 *       editables alumno y nota.Si el alumno ya existe en la tabla, la
	 *       respuesta sera "alumno existente", en caso contrario sera "alumno
	 *       anadido".
	 */
	public void nuevoAlumno(String alumno, String nota) {
		// Pon aqui tu codigo

		/*
		 * Se debe cambiar este metodo para cambiar la respuesta
		 */
		this.respuesta = "Sin hacer Nuevo";
		// Esta linea no se debe tocar
		miVista.actualizaAlumnos();
	}

	/**
	 * @param alumno
	 *            Alumno que se desea eliminar
	 * @TODO Este metodo sirve para eliminar un alumno de la tabla de alumnos. El
	 *       boton esta activo cuando hay un alumno seleccionado. Cuando se pulsa
	 *       debera pedir confirmacion con un cuadro de dialogo. Si es el ultimo
	 *       alumno la respuesta sera "sin alumnos", en caso contrario sera "alumno
	 *       eliminado"
	 */
	public void eliminarAlumno(String alumno) {
		// Pon aqui tu codigo

		/*
		 * Debes cambiar la respuesta segn haya ido la eliminacion del alumno
		 */
		this.respuesta = "Sin hacer Eliminar";
		// Esta linea no se debe tocar
		miVista.actualizaAlumnos();

	}

	// Metodos UD6

	/**
	 * @TODO Este metodo sirve para cargar la tabla de alumnos y notas del fichero
	 *       alumnos.txt. Si el fichero no existe la respuesta sera "Fichero no
	 *       existe". Si el fichero no tiene datos la respuesta sera "Fichero sin
	 *       datos". Si se han podido cargar todos los datos la respuesta sera
	 *       "Carga correcta"
	 */
	public void cargar() {
		// Pon aqui tu codigo

		// Cambia la siguiente linea por el mensaje que corresponda
		this.respuesta = "Sin hacer Cargar";

		// Esta linea no la toques, debe ser la ultima del procedimiento
		miVista.actualizaAlumnos();
	}

	/**
	 * @param tablaAlumnos
	 *            Array con todos los alumnos y sus notas
	 * @TODO: Este metodo sirve para guardar la tabla de alumnos y notas en el
	 *        fichero alumnos.txt. Si la tabla no tiene datos la respuesta sera
	 *        "Nada que guardar". Si el fichero no existe se debe crear y guardar la
	 *        informacion, y la respuesta sera "Fichero creado". Si se guarda
	 *        correctamente la respuesta sera "Fichero guardado"
	 * 
	 */
	public void salvar(Object[][] tablaAlumnos) {
		// Pon aqui tu codigo

		// Cambia la siguiente linea por el mensaje que corresponda
		this.respuesta = "Sin hacer Salvar";

		// Esta linea no la toques, debe ser la ultima del procedimiento
		miVista.actualizaAlumnosSalvar();
	}

	// Metodos getters
	public String getRespuesta() {
		return this.respuesta;
	}

	public Object[][] getTablaAlumnos() {
		return tablaAlumnos;
	}

	// Metodos setters
	public void setVista(VistaPrincipal miVista) {
		this.miVista = miVista;
	}

}
