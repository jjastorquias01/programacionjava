package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
        float numero1,numero2;
        float suma;
        float producto;
        float media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dame el primer numero: ");
        numero1 = input.nextFloat();   //nextfloat porqeu es real

        System.out.print("Dame el segundo numero:"); //¿¿?? no puedo meter un 8.9 por ejemplo con punto en vez de coma
        numero2 = input.nextFloat();
        
        suma = numero1+numero2;
        producto = numero1*numero2;
        media = (numero1+numero2)/2;
        
        System.out.println("Número 1 " + numero1); 
        System.out.printf("Número 2 %f\n", numero2);//o tambien System.out.printf("Numero 2 %f",numero2);
        System.out.println("La suma es " + suma);
        System.out.println("El producto es "+ producto);
        System.out.println("La media es "+ media);
        
        input.close();
	}


}
