/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaeventos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author migue
 */
public class Ejemplo extends JFrame {
    
    //Declaramos las variables label y boton para
    //poder acceder a ellas desde otra clase
    private static JLabel label;
    private static JButton boton;
    
    public Ejemplo() {
        setTitle("Pantalla Ejemplo");
        setBounds(300,90,200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        //Creamos el objeto JPanel que contendrá el contenido de la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        //Creamos el objeto JButton y configuramos el tamaño
        boton = new JButton("PULSAME");
        boton.setBounds(80, 50, 20, 50);
        
        //Añadimos el objeto EventoBoton que implementa la interfaz ActionListener
        boton.addActionListener(new EventoBoton());
        //Añadimos el boton al panel
        panel.add(boton);
        
        //Creamos una JLabel sin contenido y la añadimos al panel
        label = new JLabel("");
        panel.add(label);
        panel.addMouseListener(new EventoRaton());
        
        //Creamos un contenedor y añadimos el objeto JPanel
        Container cont = getContentPane();
        cont.add(panel, BorderLayout.CENTER);
    }

    public static JLabel getLabel() {
        return label;
    }

    public static void setLabel(JLabel label) {
        Ejemplo.label = label;
    }

    public static JButton getBoton() {
        return boton;
    }

    public static void setBoton(JButton boton) {
        Ejemplo.boton = boton;
    }
    
}
