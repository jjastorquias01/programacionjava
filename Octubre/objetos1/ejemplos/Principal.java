package ejemplos;

public class Principal {
	
	public static void main(String[] args) {
		
		Clase1 objeto,objeto2;   //declaramos de la clase1 dos objetos
		 
		objeto = new Clase1();//los creamos
		objeto2 = new Clase1();
		objeto.mensaje();   //como hemos definido un void mensaje() en clase1 podemos invocarlo con objeto.mensaje
		
		Alumno juan,pedro;   // declaramos de la clase alumno dos objetos
		
		juan= new Alumno();  //los creamos
		pedro = new Alumno();
		
		juan.nombre="Juan"; //nos aprovechamos de los atributos creados, en este caso del string nombre
		
		juan.mensaje();
	}

}
