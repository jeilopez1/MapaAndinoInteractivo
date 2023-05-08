/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Inicio extends JFrame implements ActionListener{

    JFrame jframe;
    JPanel panelgeneral, p1, p2;
    JButton biniciar;
    JLabel intro;

    Inicio() {
        ControlPanel2();
        ControlFrame();

    }

    void ControlPanel1() {
       

    }

    void ControlPanel2() {
        p2 = new JPanel();
        p2.setLayout(new BorderLayout(1, 1));
        
        ImageIcon ibotoniniciar = new ImageIcon(getClass().getResource("/imagenes/botoninicio.jpg"));
        Image botoniniciari = ibotoniniciar.getImage();
        ImageIcon escaladobotoniniciar = new ImageIcon(botoniniciari.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        
        biniciar=new JButton(escaladobotoniniciar);
        biniciar.addActionListener(this);
        p2.add(biniciar,BorderLayout.SOUTH);
         ImageIcon IconoEmpresa = new ImageIcon(getClass().getResource("/Imagenes/inicio.jpg"));
        Image imagen1 = IconoEmpresa.getImage();
        ImageIcon Ecalado = new ImageIcon(imagen1.getScaledInstance(650, 567, Image.SCALE_SMOOTH));
        
        intro=new JLabel(Ecalado);
        p2.add(intro);
        

    }

    void ControlFrame() {
        
         jframe = new JFrame();
        jframe.setLayout(new GridLayout(1, 1));
        jframe.setSize(650, 567);

        jframe.add(p2);
        jframe.setLocationRelativeTo(this);
        jframe.setDefaultCloseOperation(1);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setTitle("Bienvenidos");

        jframe.setVisible(true);
        
        
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==biniciar){
    jframe.setVisible(false);
    Grafico GR=new Grafico();
    }


    }

  
}
