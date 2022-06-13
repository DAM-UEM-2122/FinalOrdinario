package Controlador;

import Modelo.ModeloUD1UD2;
import Modelo.ModeloUD3;
import Modelo.ModeloUD4;
import Modelo.ModeloUD5UD6;
import Vista.VistaPrincipal;

public class Principal {

	public static void main(String[] args) {
		//Creacion del controlador
		Controlador miControlador = new Controlador();
		//Creacion de los Modelos
		ModeloUD1UD2 miModelo12 = new ModeloUD1UD2();
		ModeloUD3 miModelo3 = new ModeloUD3();
		ModeloUD4 miModelo4 = new ModeloUD4();
		ModeloUD5UD6 miModelo56 = new ModeloUD5UD6();
		//Creacion de la vista
		VistaPrincipal inicio = new VistaPrincipal();
		
		//El controlador conoce vista y modelos
		miControlador.setMiVista(inicio);
		miControlador.setModelo12(miModelo12);
		miControlador.setModelo3(miModelo3);
		miControlador.setModelo4(miModelo4);
		miControlador.setModelo56(miModelo56);
		
		//Los modelos conocen la vista
		miModelo12.setVista(inicio);
		miModelo3.setVista(inicio);
		miModelo4.setVista(inicio);
		miModelo56.setVista(inicio);
		
		//La vista conoce el controlador y los modelos 
		inicio.setControlador(miControlador);
		inicio.setModelo12(miModelo12);
		inicio.setModelo3(miModelo3);
		inicio.setModelo4(miModelo4);
		inicio.setModelo56(miModelo56);
		
		//Se hace visible al vista de inicio
		inicio.setVisible(true);
	}
}
