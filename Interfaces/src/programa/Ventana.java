/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ESFOT
 */
public class Ventana extends JFrame{
    private JTextField tf;
    private JTextField tfPerimetro;
    private JTextField tfArea;
    
    private JComboBox combo;
    
    public static Ventana v1 = new Ventana();
    private Ventana v2;
    //private JButton boton = new JButton("Pulsame");
   
    
    public static void main(String[] args) {
        v1.setVisible(true);
        v1.setSize(300,300);
        new Ventana();
        
    }
    public Ventana(){
        tf = new JTextField("Figuras");
        tfPerimetro = new JTextField("");
        tfArea = new JTextField("");
        
        combo = new JComboBox();
        combo.addItem(Cuadrado.class);
        combo.addItem(Triangulo.class);
        combo.addItem(Rectangulo.class);
        combo.addItem(Circulo.class);
        
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPerimetro.setText(combo.getSelectedItem().toString());
                v2.setVisible(true);
            }
        });
        add(combo);
    }
}
