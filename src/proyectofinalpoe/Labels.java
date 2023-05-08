/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jeisson Lopez
 */
class Labels extends JLabel implements MouseMotionListener {

    Grafico gr;
    JLabel antioquia, boyaca, caldas, cundinamarca, huila, nortedesantander, quindio, risaralda, santander, tolima;
    JLabel imagen;
//    Alayout a = new Alayout();

    public Labels(ImageIcon ImageIconis) {
        super(ImageIconis);
        addMouseMotionListener(this);

        ImageIcon iantioquia = new ImageIcon(getClass().getResource("/imagenes/antioquia.png"));
        antioquia = new JLabel(iantioquia);
        gr.p1.add(antioquia);
        antioquia.setBounds(175, 50, 237, 249);
        antioquia.setVisible(false);
        

        ImageIcon iboyaca = new ImageIcon(getClass().getResource("/imagenes/boyaca.png"));
        boyaca = new JLabel(iboyaca);
        gr.p1.add(boyaca);
        boyaca.setBounds(336, 172, 237, 194);
        boyaca.setVisible(false);
        

        ImageIcon icaldas = new ImageIcon(getClass().getResource("/imagenes/caldas.png"));
        caldas = new JLabel(icaldas);
        gr.p1.add(caldas);
        caldas.setBounds(194, 225, 237, 166);
        caldas.setVisible(false);

        ImageIcon icundinamarca = new ImageIcon(getClass().getResource("/imagenes/cundinamarca.png"));
        cundinamarca = new JLabel(icundinamarca);
        gr.p1.add(cundinamarca);
        cundinamarca.setBounds(325, 265, 162, 166);
        cundinamarca.setVisible(false);

        ImageIcon ihuila = new ImageIcon(getClass().getResource("/imagenes/huila.png"));
        huila = new JLabel(ihuila);
        gr.p1.add(huila);
        huila.setBounds(212, 389, 162, 194);
        huila.setVisible(false);

        ImageIcon isantander = new ImageIcon(getClass().getResource("/imagenes/santander.png"));
        santander = new JLabel(isantander);
        gr.p1.add(santander);
        santander.setBounds(355, 68, 175, 249);
        santander.setVisible(false);

        ImageIcon inortedesantander = new ImageIcon(getClass().getResource("/imagenes/nortedesantander.png"));
        nortedesantander = new JLabel(inortedesantander);
        gr.p1.add(nortedesantander);
        nortedesantander.setBounds(402, 23, 175, 166);
        nortedesantander.setVisible(false);

        ImageIcon irisaralda = new ImageIcon(getClass().getResource("/imagenes/risaralda.png"));
        risaralda = new JLabel(irisaralda);
        gr.p1.add(risaralda);
        risaralda.setBounds(182, 225, 175, 194);
        risaralda.setVisible(false);

        ImageIcon itolima = new ImageIcon(getClass().getResource("/imagenes/tolima.png"));
        tolima = new JLabel(itolima);
        gr.p1.add(tolima);
        tolima.setBounds(228, 271, 162, 249);
        tolima.setVisible(false);
    }

    void insertarimagen() {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        int x = this.getX() + e.getX() - this.getWidth() / 2;
        int y = this.getY() + e.getY() - this.getHeight() / 2;

//        System.out.println("x: " + this.getWidth() + " y: " + this.getHeight());
        if (x + this.getWidth() > gr.p1.getWidth()) {
            x = gr.p1.getWidth() - this.getWidth();
        }
        if (x <= 0) {
            x = 5;
        }
        if (y + this.getHeight() > gr.p1.getHeight()) {
            y = gr.p1.getHeight() - this.getHeight();
        }
        if (y <= 0) {
            y = 5;
        }
        setLocation(x, y);
//        System.out.println("x: " + x + " y: " + y);
//        System.out.println("width x: " + this.getWidth() + " height y: " + this.getHeight());
        //antioquia
        if (this.getWidth() == 237 && this.getHeight() == 249) {
            figurasenmovimiento.estaseleccionado=true;
            if ((x >= 168 && x <= 182) && (y >= 42 && y <= 55)) {
                
                this.setIcon(null);
                antioquia.setVisible(true);
                hpuntaje.antioquia=false;

//                a.addbasiccomp(antioquia, gr.p1, 3, 0, 1, 1, 1, 1, 1);
            }
        }
        //bayaca
        if (this.getWidth() == 237 && this.getHeight() == 194) {
           hboyaca.estaseleccionado=true;
            if ((x >= 328 && x <= 344) && (y >= 166 && y <= 178)) {

//                a.addbasiccomp(boyaca, gr.p1, 3, 1, 1, 1, 1, 1, 1);

                this.setIcon(null);
                boyaca.setVisible(true);
                hpuntaje.boyaca=false;
            }
        }
        //caldas
        if (this.getWidth() == 98 && this.getHeight() == 73) {
            hcaldas.estaseleccionado=true;
            if ((x >= 254 && x <= 284) && (y >= 262 && y <= 282)) {
                caldas.setVisible(true);
//                a.addbasiccomp(caldas, gr.p1, 3, 2, 1, 1, 1, 1, 1);
                this.setIcon(null);
                hpuntaje.caldas=false;
                
                
            }
        }
        //cundinamarca
        if (this.getWidth() == 237 && this.getHeight() == 166) {
            hcundinamarca.estaseleccionado=true;
            if ((x >= 278 && x <= 292) && (y >= 259 && y <= 277)) {

                cundinamarca.setVisible(true);
//                a.addbasiccomp(cundinamarca, gr.p1, 4, 2, 1, 1, 1, 1, 1);
                this.setIcon(null);
                hpuntaje.cundinamarca=false;
            }
        }
        //huila
        if (this.getWidth() == 162 && this.getHeight() == 194) {
            hhuila.estaseleccionado=true;
            if ((x >= 203 && x <= 221) && (y >= 380 && y <= 398)) {
                this.setIcon(null);
                huila.setVisible(true);
                hpuntaje.huila=false;
            }
        }
        //nortedesantander
        if (this.getWidth() == 175 && this.getHeight() == 166) {
            
            hnortedesantander.estaseleccionado=true;
            if ((x >= 393 && x <= 411) && (y >= 14 && y <= 32)) {
                this.setIcon(null);
                nortedesantander.setVisible(true);
                hpuntaje.nortedesantander=false;
//                a.addbasiccomp(nortedesantander, gr.p1, 0, 2, 1, 1, 1, 1, 1);

            }
        }
        //quindio
        if (this.getWidth() == 38 && this.getHeight() == 54) {
            hquindio.estaseleccionado=true;
            if ((x >= 253 && x <= 271) && (y >= 340 && y <= 358)) {
                this.setIcon(null);
                ImageIcon iquindio = new ImageIcon(getClass().getResource("/imagenes/quindio.png"));
                quindio = new JLabel(iquindio);
                gr.p1.add(quindio);
                quindio.setBounds(262, 349, 38, 54);
                hpuntaje.quindio=false;
//                a.addbasiccomp(quindio, gr.p1, 2, 2, 1, 1, 1, 1, 0);
            }
        }
        //risaralda
        if (this.getWidth() == 175 && this.getHeight() == 194) {
            hrisaralda.estaseleccionado=true;
            if ((x >= 171 && x <= 189) && (y >= 216 && y <= 234)) {
                this.setIcon(null);
                risaralda.setVisible(true);
                hpuntaje.risaralda=false;
//                a.addbasiccomp(risaralda, gr.p1, 0, 1, 1, 1, 1, 1, 1);
            }
        }
        //santander
        if (this.getWidth() == 175 && this.getHeight() == 249) {
            hsantander.estaseleccionado=true;
            if ((x >= 347 && x <= 365) && (y >= 60 && y <= 77)) {
                this.setIcon(null);
                hpuntaje.santander=false;
                santander.setVisible(true);
//                a.addbasiccomp(santander, gr.p1, 0, 0, 1, 1, 1, 1, 1);
            }
        }
        //tolima
        if (this.getWidth() == 162 && this.getHeight() == 249) {
            htolima.estaseleccionado=true;
            if ((x >= 216 && x <= 234) && (y >= 262 && y <= 280)) {
                this.setIcon(null);
                tolima.setVisible(true);
                hpuntaje.tolima=false;
            }
        }

//            
//            if (x + this.getWidth() < p1.getWidth()) {
//                setLocation(x, y);
//            } else {
//                setLocation(p1.getWidth() - this.getWidth(), y);
//            }
//            if (!(x > 0)) {
//                setLocation(5, y);
//                System.out.println("aqui estoy");
//            }
//            if (y + this.getHeight() < p1.getHeight()) {
//                setLocation(x, y);
//            } else {
//                setLocation(x, p1.getHeight() - this.getHeight());
//            }
//            if (!(y > 0)) {
//                setLocation(x, 5);
//                System.out.println("aqui estoy");
//            }
//                
//        antioquia.repaint();
//        boyaca.setLocation(e.getPoint());
//        boyaca.repaint();
//        
//        caldas.setLocation(e.getPoint());
//        caldas.repaint();
//        
//        cundinamarca.setLocation(e.getPoint());
//        cundinamarca.repaint();
//        
//        huila.setLocation(e.getPoint());
//        huila.repaint();
//        
//        nortedesantander.setLocation(e.getPoint());
//        nortedesantander.repaint();
//        
//        quindio.setLocation(e.getPoint());
//        quindio.repaint();
//        
//        risaralda.setLocation(e.getPoint());
//        risaralda.repaint();
//        
//        santander.setLocation(e.getPoint());
//        santander.repaint();
//        
//        tolima.setLocation(e.getPoint());
//        tolima.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }
}
