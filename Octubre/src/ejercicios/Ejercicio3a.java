package ejercicios;

import java.util.Scanner;

public class Ejercicio3a {

	public static void main(String[] args) {
		
		
        Scanner input = new Scanner( System.in ); //creamos objeto input o teclado ,a elegir ,para introducción de datos
        
        double base,
                altura,
                perimetro,
                area; //declaración de variables enteras
        
        System.out.print( "-- Cáculo de perímetro y área (en cm) --");
        System.out.print( "Introduzca la BASE del rectángulo (número positivo): "); //petición de base
        
        base = input.nextDouble(); //asignación de lectura de teclado a base
        
        System.out.print( "Introduzca la ALTURA del rectángulo (número positivo): "); //petición de altura
        
        altura = input.nextDouble(); //asignación de lectura de teclado a altura
        
        input.close(); //cerramos entradas por teclado.
        
        perimetro = 2 * base + 2 * altura; //asignación del resultado de la operación a perímetro
        area = base * altura; //asignamos el resultado de la operación a area
        
        System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
        
        System.out.println( "Perímetro: " + perimetro + " cm"); //imprime perimetro
        System.out.println( "Área: " + area + " cm2"); //imprime area
	
	}
}
