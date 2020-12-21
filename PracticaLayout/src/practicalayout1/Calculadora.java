/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalayout1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author migue
 */
public class Calculadora extends JDialog{
    public Calculadora() {
        setTitle("Calculadora");
        setBounds(300,90,300,400);
        setResizable(false);
        
        //Panel resultado
        JPanel panelResultado = new JPanel();
        GridLayout gl = new GridLayout(1,1);
        panelResultado.setLayout(gl);
        panelResultado.add(new JTextField(399));
        
        //Panel numeros
        JPanel panelNumeros = new JPanel();
        GridLayout gl2 = new GridLayout(4,3);
        panelNumeros.setLayout(gl2);
        for(int i = 9; i >= 0; i--){
            panelNumeros.add(new JButton(String.valueOf(i)));
        }
        
        //Panel operandos
        JPanel panelOperandos = new JPanel();
        GridLayout gl3 = new GridLayout(6,1);
        panelOperandos.setLayout(gl3);
        panelOperandos.add(new JButton(String.valueOf("+")));
        panelOperandos.add(new JButton(String.valueOf("-")));
        panelOperandos.add(new JButton(String.valueOf("*")));
        panelOperandos.add(new JButton(String.valueOf("/")));
        panelOperandos.add(new JButton(String.valueOf("=")));
        panelOperandos.add(new JButton(String.valueOf("CE")));
        
        Container cp = getContentPane();
        cp.add(panelResultado, BorderLayout.NORTH);
        cp.add(panelNumeros, BorderLayout.CENTER);
        cp.add(panelOperandos, BorderLayout.EAST);
    }
}
