package primeros_programas;

public class Holamundo {

	//el .class Holamundo debe tener el mismo nombre qeu el .java

			public static void main(String[] args) {   //como el main() de c
				
				System.out.println("Hola Mundo!");   //System.out-->salida ; println escribir
				System.out.print("Adios Mundo!");     //print no posiciona el cursor en el principio 
				System.out.println("Hasta ahora Mundo!");    //de la linea siguiente cuando termina de escribir
				System.out.println("Esto es un \nprograma que escribe \nen varias lineas de texto");
				
				System.out.println("Hola otra "
						+ ""
						+ "vez Mundo!");      //tambien para instrucciones largas podemos escribir asi
			}

}
