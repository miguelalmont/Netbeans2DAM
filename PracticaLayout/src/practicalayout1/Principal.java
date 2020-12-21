/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalayout1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author migue
 */
public class Principal extends JFrame{
    public Principal() {
        setTitle("Pantalla Principal");
        setBounds(300,90,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        
        JButton botonFormulario = new JButton("Formulario");
        botonFormulario.setBounds(80, 50, 20, 50);
        botonFormulario.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                FormularioClientes formulario = new FormularioClientes();
                formulario.setVisible(true);
            }
        });
        
        JButton botonCalculadora = new JButton("Calculadora");
        botonCalculadora.setBounds(80, 50, 20, 50);
        botonCalculadora.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                Calculadora calculadora = new Calculadora();
                calculadora.setVisible(true);
            }
        });
        
        panelBotones.add(botonFormulario);
        panelBotones.add(botonCalculadora);
        
        Container cp = getContentPane();
        cp.add(panelBotones, BorderLayout.CENTER);
        
    }
}
