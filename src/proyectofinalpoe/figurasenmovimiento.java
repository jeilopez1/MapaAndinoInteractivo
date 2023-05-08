/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import javax.swing.JPanel;

/**
 *
 * @author Jeisson Lopez
 */
public class figurasenmovimiento extends Thread {

    Labels labels1;
    JPanel jPanel;
    static boolean estaseleccionado;
    Grafico gr;

    public figurasenmovimiento(Labels labels1, JPanel jPanel) {
        this.labels1 = labels1;
        this.jPanel = jPanel;
    }

    public void run() {

        int x = labels1.getX();
        int y = labels1.getY();
        boolean bandera = true;
        int limitey = gr.p1.getHeight() - labels1.getHeight();
        for (int j = 0; j < 10; j--) {

            if ((estaseleccionado == false)) {

                

                if (bandera==true) {
                    try {
                        Thread.sleep(4);
                        labels1.setBounds(x, y, labels1.getWidth(), labels1.getHeight());
                        y--;

                    } catch (InterruptedException ie) {
                    }
                    if ((y == 0)) {
                        bandera = false;
                    }
                }
                if (bandera == false) {
                    try {
                        Thread.sleep(6);
                        y++;
                        labels1.setBounds(x, y, labels1.getWidth(), labels1.getHeight());

                    } catch (InterruptedException ie) {
                    }
                    if (y == limitey) {
                        bandera = true;
                    }

                }
            }

        }

    }
}
