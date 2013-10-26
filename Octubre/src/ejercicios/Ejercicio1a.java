package ejercicios;

import java.util.Scanner;

public class Ejercicio1a {
	
	
public void main(String[] args){
	
	String nombre;
	Scanner input;
	
    input = new Scanner(System.in);   //input o teclado
    
	System.out.println("¿Como te llamas?");  
	
	nombre = input.nextLine();
	
	System.out.printf("Hola %s", nombre);  // %s para cadenas de caracteres
	
	//podiamos poner system.out.print(mensaje); y declarar mensaje = "hola"+nombre;
	 
	input.close();
	
}

}
