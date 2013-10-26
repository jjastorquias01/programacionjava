package ejercicios;
import graphicss.Color;
import graphicss.Canvas;  //importo obejtos de otros paquetes
import graphicss.Rectangle;

public class Grafico1 {

	public static void main(String[] args) {
		
          Canvas lienzo;
          Rectangle rectangulo;
          lienzo =  Canvas.getInstance();//metodos qeu esa clase tiene puedes llamar a ese metodo
         //el lienzo toma el valor del objeto con todo lo qeu contenga la clase 
          //entre parentesis si hay algun construcdtor
         
          
          //crear rectangulo
          rectangulo = new Rectangle(10,10,50,50);
          rectangulo.draw();//draw es el metodo
          
          Canvas.pause(); //hasta qeu no le de no arranca
          rectangulo.translate(250,0);
          
          rectangulo.setColor(Color.ORANGE); //importamos el color naranja
          rectangulo.fill();
          
          
          //si quiero crear otro objeto de la clase color
          Canvas.pause();
          Color gris;
          
          gris = new Color(200,200,200);
          
          rectangulo.setColor(gris);
          
	}

}

