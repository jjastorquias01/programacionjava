package ejercicios;

import java.util.Scanner;

public class Ejercicio3a {

	public static void main(String[] args) {
		
		
        Scanner input = new Scanner( System.in ); //creamos objeto input o teclado ,a elegir ,para introducci�n de datos
        
        double base,
                altura,
                perimetro,
                area; //declaraci�n de variables enteras
        
        System.out.print( "-- C�culo de per�metro y �rea (en cm) --");
        System.out.print( "Introduzca la BASE del rect�ngulo (n�mero positivo): "); //petici�n de base
        
        base = input.nextDouble(); //asignaci�n de lectura de teclado a base
        
        System.out.print( "Introduzca la ALTURA del rect�ngulo (n�mero positivo): "); //petici�n de altura
        
        altura = input.nextDouble(); //asignaci�n de lectura de teclado a altura
        
        input.close(); //cerramos entradas por teclado.
        
        perimetro = 2 * base + 2 * altura; //asignaci�n del resultado de la operaci�n a per�metro
        area = base * altura; //asignamos el resultado de la operaci�n a area
        
        System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
        
        System.out.println( "Per�metro: " + perimetro + " cm"); //imprime perimetro
        System.out.println( "�rea: " + area + " cm2"); //imprime area
	
	}
}
