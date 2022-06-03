package principal;

import java.util.Scanner;

import cola.Cola;
import cola.Nodo;

public class Principal {

	private static Cola nuevaCola = new Cola();
	
	public static void main(String[] args) {
		
		
		menu();
		

	}
	
	public static void menu() {
		Scanner teclado = new Scanner(System.in);
		int op;
		do {
			System.out.println("---------------------------");
			System.out.println("|           Menu          |");
			System.out.println("|-------------------------|");
			System.out.println("| 1- Ingresar Persona	  |");
			System.out.println("| 2- Mostrar Cola   	  |");
			System.out.println("| 3- Buscar Persona 	  |");
			System.out.println("| 0- Salir                |");
			System.out.println("---------------------------");
			System.out.print("Ingrese una opcion -> ");
			op = teclado.nextInt();
			ejecutar(op);
		}while(op != 0);
	}
	
	public static void ejecutar(int op) {
		switch (op) {
		case 1: 
			Persona persona = new Persona();
			nuevaCola.encolar(persona);
			break;
		case 2:
			nuevaCola.imprimir();
			break;
		case 3:
			int dni;
			Scanner teclado = new Scanner(System.in);
			System.out.print("Ingrese el dni de la persona a buscar -> ");
			dni = teclado.nextInt();
			buscarPersona(dni);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

	private static void buscarPersona(int dni) {
		Cola aux = new Cola();
		Nodo nodo;
		Persona persona;
		while(!nuevaCola.isVacia()) {
			nodo = nuevaCola.desencolar();
			persona = (Persona)nodo.getElem();
			if(persona.getDni() == dni) {
				System.out.println(persona.toString());
			}
			aux.encolar(nodo);
		}
		nuevaCola.restaurar(aux);
	}


}


