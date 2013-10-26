package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	 public static void main(String[] args) {
         
         float peso = 0.0f; //la "f" que e puesto despues de poner .0 es para decirle que es un float, sino asumirá que es un double
         final float onzas_por_kilo = 35.2739619f;  // para declarar constantes siempre final y el tipo
         float onzas;
         
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Introduce tu peso en kilogramos: ");
         peso = teclado.nextFloat();
         onzas = (peso * onzas_por_kilo);
         System.out.println("\n Tu peso en Onzas es: " + onzas + " onzas.");
         
         teclado.close(); //libera el recurso
 }
}
