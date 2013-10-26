package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		 Alumno Alumno1;
		 Alumno Alumno2;
		 Alumno Alumno3;
		 Alumno1 = new Alumno();   //esto siempre para definir objetos: primero los declaramos con 
		 Alumno2 = new Alumno();   //su clase y luego los definimos con new
		 Alumno3 = new Alumno();
		 float media;
		
		
		 Scanner teclado;                      //para  leer por teclado siempre
		 teclado = new Scanner(System.in);
		 
		 //----primer alumno----
		 
		 
		 System.out.println("Nombre del primer alumno:");
		 
		 Alumno1.nombre = teclado.nextLine();
		 
		      System.out.println("Edad del primer alumno:");
		  
		      Alumno1.edad = teclado.nextInt();
		 
		 //------segundo alumno-------
		 
		 System.out.println("Nombre del segundo alumno:");
		 
		 Alumno2.nombre = teclado.nextLine();
		 
              System.out.println("Edad del segundo  alumno:");
		 
		      Alumno2.edad = teclado.nextInt();
		      
		//------tercer alumno---------
		 
	     System.out.println("Nombre del tercer alumno:");
		 
		 Alumno3.nombre = teclado.nextLine();
		 
		       System.out.println("Edad del tercer  alumno:");
		 
	           Alumno3.edad = teclado.nextInt();
		 
		 Alumno1.edad = teclado.nextInt();   //ahora es nextInt por qeu la edad es int
		 
		 System.out.println("El primer alumno se llama:" + Alumno1.nombre);
		 System.out.println("Tiene:" + Alumno1.edad + " años");
		 System.out.println("El segundo alumno se llama:" + Alumno2.nombre);
		 System.out.println("Tiene:" + Alumno2.edad + " años");
		 System.out.println("El tercer alumno se llama:" + Alumno3.nombre);
		 System.out.println("Tiene:" + Alumno3.edad + " años");
		 media = (Alumno1.edad + Alumno2.edad + Alumno3.edad)/3;
		 System.out.println("La media de edad es:" + media + " años");
		
		 //teclado.close();

	}

}
