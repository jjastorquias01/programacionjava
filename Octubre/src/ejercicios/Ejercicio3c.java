package ejercicios;

import java.util.Scanner;

public class Ejercicio3c {
	
	public static void main(String[] args) {
		
		
        Scanner teclado = new Scanner( System.in );//Se puede hacer scanner teclado; teclado = new Scanner.... o asi
         
        int radio;
        double volumen;
        //final double PI = Math.PI; 
                        
        System.out.print( "Introduzca el RADIO de la esfera (cm): ");
        
        radio = teclado.nextInt(); //asignación de lectura de teclado a radio
        
        teclado.close(); //cerramos introducción de datos por teclado
        
        volumen = (4 * Math.PI * Math.pow(radio, 3))/3;  //math.pow para potencias
        
        System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
        
        System.out.println( "Volumen: " + Math.round(volumen*100)/100.0); //math.round nueva funcion math
	}


}
