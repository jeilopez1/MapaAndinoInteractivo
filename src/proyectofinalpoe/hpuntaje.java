/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import java.applet.AudioClip;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author Jeisson Lopez
 */
public class hpuntaje extends Thread {

    JLabel puntaje;
    static boolean antioquia = true, caldas = true, boyaca = true, tolima = true, huila = true, risaralda = true, quindio = true, santander = true, nortedesantander = true, cundinamarca = true;
    boolean ia = true;
    AudioClip Sonido1;
    

    public hpuntaje(JLabel puntaje) {
        this.puntaje = puntaje;
        Sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/ganador.wav"));
    }

    public void run() {
        int x = 0;
        int y = 0;
        while (ia) {

            if (!(Grafico.puntucion == Grafico.puntostotales)) {
                try {
                    if (antioquia == false) {
                        Grafico.puntucion++;
                        antioquia = true;
                    }
                    if (caldas == false) {
                        Grafico.puntucion++;
                        caldas = true;
                    }
                    if (boyaca == false) {
                        Grafico.puntucion++;
                        boyaca = true;
                    }
                    if (tolima == false) {
                        Grafico.puntucion++;
                        tolima = true;
                    }
                    if (huila == false) {
                        Grafico.puntucion++;
                        huila = true;
                    }
                    if (risaralda == false) {
                        Grafico.puntucion++;
                        risaralda = true;
                    }
                    if (quindio == false) {
                        Grafico.puntucion++;
                        quindio = true;
                    }
                    if (santander == false) {
                        Grafico.puntucion++;
                        santander = true;
                    }
                    if (nortedesantander == false) {
                        Grafico.puntucion++;
                        nortedesantander = true;

                    }
                    if (cundinamarca == false) {
                        Grafico.puntucion++;
                        cundinamarca = true;
                    }
                    x = Grafico.puntucion;

                    puntaje.setText(Grafico.puntucion + " de " + Grafico.puntostotales);
                    sleep(3000);
                } catch (InterruptedException e) {
                }

            } else {
                System.out.println("Felicidadades Ganaste el juego");
                Sonido1.play();
                ia = false;
            }
        }

    }
}
