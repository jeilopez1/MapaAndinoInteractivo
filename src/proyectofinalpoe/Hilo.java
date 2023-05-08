/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import java.applet.AudioClip;
import javax.swing.JLabel;

/**
 *
 * @author Jeisson Lopez
 */
public class Hilo extends Thread {

    JLabel tiempo;
    private int minuto = 1;
    private int segundo = 30;
    boolean ia = true;
    figurasenmovimiento f;//hilo de antioquia
    hboyaca hb;
    hcaldas hc;
    hnortedesantander hn;
    htolima ht;
    hquindio hq;
    hhuila hh;
    hrisaralda hr;
    hcundinamarca hcun;
    hsantander hs;
    hpuntaje hpunta;
    AudioClip Sonido1;

    public Hilo(JLabel tiempo, figurasenmovimiento f, hboyaca hb, hcaldas hc, hnortedesantander hn, htolima ht, hquindio hq, hhuila hh, hrisaralda hr, hcundinamarca hcun, hsantander hs, hpuntaje hpunta) {
        this.tiempo = tiempo;
        this.f = f;
        this.hb = hb;
        this.hc = hc;
        this.hn = hn;
        this.ht = ht;
        this.hq = hq;
        this.hh = hh;
        this.hr = hr;
        this.hcun = hcun;
        this.hs = hs;
        this.hpunta = hpunta;
        Sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/perdedor.wav"));
    }

    public void run() {

        while (ia) {
            try {
                tiempo();
                sleep(1000);
            } catch (InterruptedException e) {
            }

        }if(!(Grafico.puntucion==10)){
        Sonido1.play();
        System.out.println("Perdio");
        }
        
        f.stop();
        ht.stop();
        hcun.stop();
        hc.stop();
        hq.stop();
        hh.stop();
        hb.stop();
        hs.stop();
        hn.stop();
        hr.stop();
        hpunta.stop();
    }

    void tiempo() {

        if (segundo == 0) {
            minuto--;
            segundo--;
            segundo = 59;

        } else {
            segundo--;
        }
        if (segundo == 0 && minuto == 0) {
            ia = false;
        }

        String tiempo1 = "Minuto " + Integer.toString(minuto) + ":" + Integer.toString(segundo);
        tiempo.setText(tiempo1);

    }

}
