package ejercicios;

import graphicss.Color;
import graphicss.Canvas;  
import graphicss.Rectangle;
import graphicss.Ellipse;

public class Semaforo {
	public static void main(String[] args) {
		
        Canvas lienzo;
        Rectangle rectangulo;
        lienzo =  Canvas.getInstance();
       
        
       
        
        Color black =new Color(0,0,0);
        rectangulo = new Rectangle(0,0,50,200);
        rectangulo.draw();
        rectangulo.setColor(black);
        rectangulo.fill();
        
        Canvas.pause(); //hasta qeu no le de no arranca
        
        Ellipse circulo1;
        circulo1 = new Ellipse(0,0,50,50);
        circulo1.setColor(Color.RED);
        circulo1.draw();
        circulo1.fill();
        
        Canvas.pause();
        
        
        circulo1.setColor(Color.BLACK);
        Ellipse circulo2;
        circulo2 = new Ellipse(0,50,50,50);
        circulo2.setColor(Color.YELLOW);
        circulo1.draw();
        circulo1.fill();
        circulo2.draw();
        circulo2.fill();
      
        
       
        Canvas.pause();
        circulo2.setColor(Color.BLACK);
        Ellipse circulo3;
        circulo3 = new Ellipse(0,100,50,50);
        circulo3.setColor(Color.GREEN);
        circulo2.draw();
        circulo2.fill();
        circulo3.draw();
        circulo3.fill();
      
        Canvas.pause();
       
        circulo3.setColor(Color.BLACK);
        
	}

}
