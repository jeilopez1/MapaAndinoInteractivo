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
public class hquindio extends Thread {

    Labels labels1;
    JPanel jPanel;
    static boolean estaseleccionado;
    Grafico gr;

    public hquindio(Labels labels1, JPanel jPanel) {
        this.labels1 = labels1;
        this.jPanel = jPanel;
    }

    public void run() {

        int x = labels1.getX();
        int y = labels1.getY();
        boolean bandera = true;
        int limitex = gr.p1.getWidth()- labels1.getWidth();
        for (int j = 0; j < 10; j--) {

            if ((estaseleccionado == false)) {

                

                if (bandera==true) {
                    try {
                        Thread.sleep(7);
                        labels1.setBounds(x, y, labels1.getWidth(), labels1.getHeight());
                        x--;

                    } catch (InterruptedException ie) {
                    }
                    if ((x == 0)) {
                        bandera = false;
                    }
                }
                if (bandera == false) {
                    try {
                        Thread.sleep(6);
                        x++;
                        labels1.setBounds(x, y, labels1.getWidth(), labels1.getHeight());

                    } catch (InterruptedException ie) {
                    }
                    if (x == limitex) {
                        bandera = true;
                    }

                }
            }

        }

    }
}

