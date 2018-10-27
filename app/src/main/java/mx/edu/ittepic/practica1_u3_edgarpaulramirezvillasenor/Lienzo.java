package mx.edu.ittepic.practica1_u3_edgarpaulramirezvillasenor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Circulo circulo1,circulo2,circulo3,circulo4,circulo5,circulo6;

    public Lienzo(Context context) {
        super(context);

        circulo1 = new Circulo(350,500,this,Color.WHITE,30);//mandando los valores de las coodernadas de la posicion "x" y "y"
        circulo2 = new Circulo(300,600,this,Color.GRAY,30);//mandando toda la clase "Lienzo" junto con sus atributos
        circulo3 = new Circulo(250,515,this,Color.RED,30);//mandando el valor del color que será recibido como entero
        circulo4 = new Circulo(315,500,this,Color.BLACK,60);//mandando el tamaño que tendra el circulo
        circulo5 = new Circulo(300,200,this,Color.MAGENTA,80);
        circulo6 = new Circulo(450,550,this,Color.YELLOW,100);


        circulo1.desplzamiento(100,100);//mandando valor de desplazamiento en "x" y en "y"
        circulo2.desplzamiento(90,90);
        circulo3.desplzamiento(90,90);
        circulo4.desplzamiento(30,30);
        circulo5.desplzamiento(20,20);
        circulo6.desplzamiento(10,15);
    }

    public void onDraw(Canvas canvas){

        Paint p = new Paint();
        canvas.drawColor(Color.CYAN);

        circulo1.pintar(canvas,p);
        circulo2.pintar(canvas,p);
        circulo3.pintar(canvas,p);
        circulo4.pintar(canvas,p);
        circulo5.pintar(canvas,p);
        circulo6.pintar(canvas,p);

    }
}
