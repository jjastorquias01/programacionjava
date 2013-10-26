package ejercicios;

import java.util.Scanner;

public class Ejercicio3e {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
        
        int cateto1,
                cateto2; //declaraci�n de variables enteras
        double hipotenusa; //declaraci�n de variable real
                        
        System.out.print( "Introduzca el primer CATETO (n�mero entero positivo): "); //petici�n de cateto1
        
        cateto1 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto1
        
        System.out.print( "Introduzca el segundo CATETO (n�mero entero positivo): "); //petici�n de cateto2
        
        cateto2 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto2
        
        teclado.close(); //cerramos introducci�n de datos por teclado
        
        hipotenusa = Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2); //funcion raiz cuadrada
        System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
        
        System.out.println( "Hipotenusa: " + hipotenusa ); //imprime hipotenusa

	}

}
