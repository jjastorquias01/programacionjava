package ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		
		
		
        Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
        
        int radio; //declaración de variable entera;
        final double PI = Math.PI; //declaración y asignación de valor de constante PI
        double perimetro,
                 area; //declaración de variables reales;
                        
        System.out.print( "Introduzca el RADIO del círculo (número entero positivo): ");        //petición de radio
        
        radio = teclado.nextInt(); //asignación de lectura de teclado a radio
        
        teclado.close(); //cerramos introducción de datos por teclado
        
        perimetro = 2 * PI * radio; //asignamos resultado de la operación a perimetro
        area = PI * Math.pow(radio, 2); //asignamos resultado de la operación a area
        
        System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
        
        System.out.println( "Perímetro: " + perimetro ); //imprime perimetro
        System.out.println( "Área: " + area ); //imprime area
	
	}

}
