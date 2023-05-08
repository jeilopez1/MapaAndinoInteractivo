/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Jeisson Lopez
 */
public class Grafico extends JFrame implements ActionListener {

    JFrame jframe1;
    static JPanel panelgeneral, p1, pmitad;
    JButton biniciar, breiniciar, batras;
    JLabel imagen, puntuacion, tiemporestante, tiemporestante1, antioquia, boyaca, caldas, cundinamarca, huila, nortedesantander, quindio, risaralda, santander, tolima;
    static JLabel puntuacion1;
    JLabel aviso1, aviso2, aviso3, aviso4;
    GridBagConstraints grid = new GridBagConstraints();
    static int puntucion = 0, puntostotales = 10;
    Hilo h;
    int r = 1;
    Inicio i;
    Labels labels;
    //hilos de cada imagen
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

    //  agregar imagenes a los botones
    // agregar un divisor de paneles
    //agregar botones de inicio, de cerrar, limpiar
    //agregar mejor diseno
    Grafico() {
        ControlPanel1();
        ControlPanelmitad();
        ControlFrame();

    }
//    void insertarImagen(JLabel JLabel,String departamento,JPanel p2){
//        
//        Image RegionA1 = Region1.getImage();
//        ImageIcon Ecaladoregion1 = new ImageIcon(RegionA1.getScaledInstance(140, 185, Image.SCALE_SMOOTH));
//        a.addbasiccomp(JLabel, p2, 0, r, 1, 1, 1, 1, 0);
//        r++;
//        JLabel = new JLabel(Ecaladoregion1);
//        
//    
//    }     ImageIcon Region1 = new ImageIcon(getClass().getResource("/imagenes/"+departamento+".png"));
//

    void ControlPanel1() {
        p1 = new JPanel(null);
        p1.setSize(956, 610);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

//        ImageIcon RegionAndina = new ImageIcon(getClass().getResource("/imagenes/regionandina.png"));
//        Image RegionAndina1 = RegionAndina.getImage();
//        ImageIcon RegionAndina2 = new ImageIcon(RegionAndina1.getScaledInstance(380, 562, Image.SCALE_SMOOTH));
//        imagen = new JLabel(RegionAndina2);
//        p1.setBackground(Color.yellow);
        ImageIcon iantioquia = new ImageIcon(getClass().getResource("/imagenes/antioquia.png"));
        antioquia = new Labels(iantioquia);
        p1.add(antioquia);
        antioquia.setBounds(719, 361, 237, 249);
//        a.addbasiccomp(antioquia, p1, 3, 0, 1, 1, 1, 1, 1);

        ImageIcon iboyaca = new ImageIcon(getClass().getResource("/imagenes/boyaca.png"));
        boyaca = new Labels(iboyaca);
        p1.add(boyaca);
        boyaca.setBounds(5, 416, 237, 194);
//        a.addbasiccomp(boyaca, p1, 3, 1, 1, 1, 1, 1, 1);
//
        ImageIcon icaladas = new ImageIcon(getClass().getResource("/imagenes/caldas.png"));
        caldas = new Labels(icaladas);
        p1.add(caldas);
        caldas.setBounds(5, 537, 98, 73);
//        a.addbasiccomp(caldas, p1, 3, 2, 1, 1, 1, 1, 1);

        ImageIcon icundinamarca = new ImageIcon(getClass().getResource("/imagenes/cundinamarca.png"));
        cundinamarca = new Labels(icundinamarca);
        p1.add(cundinamarca);
        cundinamarca.setBounds(5, 5, 237, 166);
//        a.addbasiccomp(cundinamarca, p1, 4, 2, 1, 1, 1, 1, 1);
//
        ImageIcon ihuila = new ImageIcon(getClass().getResource("/imagenes/huila.png"));
        huila = new Labels(ihuila);
        p1.add(huila);
        huila.setBounds(526, 416, 162, 194);
//        a.addbasiccomp(huila, p1, 4, 1, 1, 1, 1, 1, 1);
//
        ImageIcon inortedesantander = new ImageIcon(getClass().getResource("/imagenes/nortedesantander.png"));
        nortedesantander = new Labels(inortedesantander);
        p1.add(nortedesantander);
        nortedesantander.setBounds(781, 444, 175, 166);
//        a.addbasiccomp(nortedesantander, p1, 0, 2, 1, 1, 1, 1, 1);
//
        ImageIcon iquindio = new ImageIcon(getClass().getResource("/imagenes/quindio.png"));
        quindio = new Labels(iquindio);
        p1.add(quindio);
        quindio.setBounds(918, 249, 38, 54);
//        a.addbasiccomp(quindio, p1, 2, 2, 1, 1, 1, 1, 0);
//
        ImageIcon irisaralda = new ImageIcon(getClass().getResource("/imagenes/risaralda.png"));
        risaralda = new Labels(irisaralda);
        p1.add(risaralda);
        risaralda.setBounds(5, 174, 175, 194);
//        a.addbasiccomp(risaralda, p1, 0, 1, 1, 1, 1, 1, 1);

        ImageIcon isantander = new ImageIcon(getClass().getResource("/imagenes/santander.png"));
        santander = new Labels(isantander);
        p1.add(santander);
        santander.setBounds(781, 5, 175, 249);
//        a.addbasiccomp(santander, p1, 0, 0, 1, 1, 1, 1, 1);

        ImageIcon itolima = new ImageIcon(getClass().getResource("/imagenes/tolima.png"));
        tolima = new Labels(itolima);
        p1.add(tolima);
        tolima.setBounds(529, 5, 162, 249);
//        a.addbasiccomp(tolima, p1, 4, 0, 1, 1, 1, 1, 1);
//        a.addbasiccomp(imagen, p1, 1, 0, 2, 3, 1, 1, 1);

    }

    void ControlPanelmitad() {
        pmitad = new JPanel();
        pmitad.setBackground(Color.WHITE);
        pmitad.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.black));

        pmitad.setLayout(null);

        aviso1 = new JLabel("Por favor armar el mapa");
        aviso1.setBounds(10, 20, 180, 20);
        aviso1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        aviso1.setForeground(Color.BLACK);
        pmitad.add(aviso1);
        aviso2 = new JLabel("Para eso tienes ");
        aviso2.setBounds(35, 40, 180, 20);
        aviso2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        aviso2.setForeground(Color.BLACK);
        pmitad.add(aviso2);
        
        aviso3 = new JLabel("un minuto y medio 1:30");
        aviso3.setBounds(10, 60, 180, 20);
        aviso3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        aviso3.setForeground(Color.BLACK);
        pmitad.add(aviso3);
        
        aviso4 = new JLabel("Buena Suerte");
        aviso4.setBounds(40, 80, 180, 20);
        aviso4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        aviso4.setForeground(Color.BLACK);
        pmitad.add(aviso4);

        puntuacion = new JLabel("Puntaje");

        puntuacion1 = new JLabel(puntucion + " de  " + puntostotales);
        tiemporestante = new JLabel("TIEMPO RESTANTE");
        tiemporestante1 = new JLabel("0:0");

        ImageIcon ibotonatras = new ImageIcon(getClass().getResource("/imagenes/botonatras.jpg"));
        Image botonatrasi = ibotonatras.getImage();
        ImageIcon escaladobotonatras = new ImageIcon(botonatrasi.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        ImageIcon ibotoniniciar = new ImageIcon(getClass().getResource("/imagenes/botoniniciar.jpg"));
        Image botoniniciari = ibotoniniciar.getImage();
        ImageIcon escaladobotoniniciar = new ImageIcon(botoniniciari.getScaledInstance(180, 40, Image.SCALE_SMOOTH));

        biniciar = new JButton(escaladobotoniniciar);
        biniciar.addActionListener(this);

        batras = new JButton(escaladobotonatras);
        batras.addActionListener(this);

        puntuacion.setBounds(60, 180, 180, 20);
        puntuacion.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
        puntuacion.setForeground(Color.BLACK);
        pmitad.add(puntuacion);
        pmitad.add(puntuacion1);
        puntuacion1.setBounds(59, 220, 180, 20);
        puntuacion1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
        puntuacion1.setForeground(Color.BLACK);
        pmitad.add(tiemporestante);
        tiemporestante.setBounds(5, 280, 180, 20);
        tiemporestante.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
        tiemporestante.setForeground(Color.BLACK);
        pmitad.add(tiemporestante1);
        tiemporestante1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
        tiemporestante1.setForeground(Color.BLACK);
        tiemporestante1.setBounds(5, 320, 180, 20);
        pmitad.add(batras);
        batras.setBounds(5, 460, 180, 40);
        pmitad.add(biniciar);
        biniciar.setBounds(5, 520, 180, 40);

    }

//    void anadir(int x, int y) {
//        ImageIcon iantioquia = new ImageIcon(getClass().getResource("/imagenes/antioquia.png"));
//        antioquia = new Labels(iantioquia);
//        p1.add(antioquia);
//        antioquia.setLocation(x, y);
//    }
    void ControlFrame() {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        JLabel x = new JLabel(fondo);
        jframe1 = new JFrame();
        jframe1.getContentPane().setBackground(Color.WHITE);
        jframe1.setSize(1200, 650);
        jframe1.setLayout(null);

//        a.addbasiccomp(x, jframe1, 0, 0, 5, 5, 1, 1, 0);
//        grid.gridx = 0;
//        grid.gridy = 0;
//        grid.gridwidth = 1;
//        grid.gridheight = 1;
//        grid.ipadx = 1;
//        grid.ipady = 1;
//        grid.fill = 0;
//        jframe1.add(p1, grid);
//     (JComponent componente, Container Jpanel, int x, int y, int anchura, int altura, int tamañox, int tamañoy, int tramo)
        jframe1.add(p1);
        p1.setBounds(200, 2, 956, 610);
        jframe1.add(pmitad);
        pmitad.setBounds(10, 0, 190, 610);
//        a.addbasiccomp(p1, jframe1, 5, 0, 1, 1, 1, 1, 0);
//        a.addbasiccomp(pmitad, jframe1, 0, 0, 5, 20, 1, 1, 0);
        jframe1.setResizable(false);
        jframe1.setLocationRelativeTo(p1);
        jframe1.setDefaultCloseOperation(1);
        jframe1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe1.setTitle("Bienvenidos a arma tu mapa");
        ImageIcon IconoEmpresa = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
        Image imagen1 = IconoEmpresa.getImage();

        ImageIcon RegionAndina = new ImageIcon(getClass().getResource("/imagenes/regionandina.jpg"));
        Image RegionAndina1 = RegionAndina.getImage();
        ImageIcon RegionAndina2 = new ImageIcon(RegionAndina1.getScaledInstance(440, 633, Image.SCALE_SMOOTH));

        imagen = new JLabel(RegionAndina2);
        p1.add(imagen);
        imagen.setBounds(64, -57, 571, 663);

        jframe1.setIconImage(imagen1);
        jframe1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == biniciar) {

            f = new figurasenmovimiento((Labels) antioquia, p1);
            f.start();
            hb = new hboyaca((Labels) boyaca, p1);
            hb.start();
            hc = new hcaldas((Labels) caldas, p1);
            hc.start();
            hn = new hnortedesantander((Labels) nortedesantander, p1);
            hn.start();
            hh = new hhuila((Labels) huila, p1);
            hh.start();
            hr = new hrisaralda((Labels) risaralda, p1);
            hr.start();
            hq = new hquindio((Labels) quindio, p1);
            hq.start();
            ht = new htolima((Labels) tolima, p1);
            ht.start();
            hcun = new hcundinamarca((Labels) cundinamarca, p1);
            hcun.start();
            hs = new hsantander((Labels) santander, p1);
            hs.start();
            hpunta = new hpuntaje(puntuacion1);
            hpunta.start();
            biniciar.setEnabled(false);
            h = new Hilo(tiemporestante1, f, hb, hc, hn, ht, hq, hh, hr, hcun, hs, hpunta);
            h.start();

        }
        if (ae.getSource() == batras) {
            try {

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
                h.stop();
            } catch (java.lang.NullPointerException a) {
                System.out.println("error");
            }
            jframe1.setVisible(false);
            i = new Inicio();

        }

    }

}
