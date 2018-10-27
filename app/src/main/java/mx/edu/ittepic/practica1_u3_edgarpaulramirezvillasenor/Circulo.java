package mx.edu.ittepic.practica1_u3_edgarpaulramirezvillasenor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.View;

public class Circulo {
    float x,y;
    int desplazamientox, desplazamientoy;
    CountDownTimer timer;
    int color, tamaño;

    public Circulo(int posx,int posy, final Lienzo l, int colores, int tam) {
        x = posx;
        y = posy;
        color = colores;
        tamaño = tam;

        timer = new CountDownTimer(1000,10) {
            @Override
            public void onTick(long millisUntilFinished) {
                x += desplazamientox;
                y += desplazamientoy;

                if (x >= l.getWidth()){// rebote en el margen derecho de la pantalla
                    desplazamientox *= -1;
                }

                if (x <= 50){// rebote en el margen izquierdo de la pantalla
                    desplazamientox *= -1;
                }

                if (y >= l.getHeight()-10){// rebote en la parte inferior de la pantalla (abajo)
                    desplazamientoy *= -1;
                }

                if (y <= 50){// rebote en parte superior de la pantalla (arriba)
                    desplazamientoy *= -1;
                }

                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

    }

    public void pintar (Canvas c, Paint p){//creando los circulos con su posicion en "x" y "y" y su tamaño, ademas de asignarles su color.
        c.drawCircle(x,y,tamaño,p);
        p.setColor(color);
    }

    public void desplzamiento(int desplazax, int desplazay){
        desplazamientox = desplazax;
        desplazamientoy = desplazay;

        timer.start();
    }
}
