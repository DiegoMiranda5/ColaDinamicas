package principal;

import java.util.Scanner;

public class Persona {
	
	private int dni;
	private int edad;
	private String nombre;
	private String apellido;
	private double peso;
	private double altura;
	
	public Persona() {
		leer();
	}

	private void leer() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el dni de la persona: ");
		this.dni = teclado.nextInt();
		
		System.out.print("Ingrese la edad de la persona: ");
		this.edad = teclado.nextInt();
		
		//teclado.nextLine();
		System.out.print("Ingrese el nombre de la persona: ");
		this.nombre = teclado.next();
		
		System.out.print("Ingrese el apellido de la persona: ");
		this.apellido = teclado.next();
		
		System.out.print("Ingrese el peso de la persona: ");
		this.peso = teclado.nextDouble();
		
		System.out.print("Ingrese el altura de la persona: ");
		this.altura = teclado.nextDouble();
	}
	
	public int getDni() {
		return dni;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persona{ Dni = " + this.dni + " Nombre: " + this.nombre + " Apellido: " + this.apellido + "}";
	}
	

}
