package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 1.
 * Escribir un programa que pregunte al usuario
 * su nombre, y luego lo salude.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		String nombre; //declaramos el nombre tipo string y tambien el mensaje
		String mensaje;
		Scanner input;  //declaramos un objeto input de clase scanner
		 
		input = new Scanner(System.in); //lo creamos de la clase scanner
		System.out.println("¿Cómo te llamas?");
		
		nombre = input.nextLine(); //para leer nextline() o next()  ¿¿??
		mensaje = "Hola, "+nombre; //en vez de escribir a pelo el mensaje utilizamos el string mensaje
		System.out.println(mensaje);
		input.close();
	}

}
