/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalayout1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author migue
 */
public class FormularioClientes extends JDialog{
    public FormularioClientes() {
        setTitle("Formulario Clientes");
        setBounds(300,90,500,500);
        setResizable(false);
        
        //Panel del titulo
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER,140,5));
        panelTitulo.add(new JLabel("CLIENTES"));
        panelTitulo.add(new JTextField(14));
        
        //Panel del formulario
        JPanel panelFormulario =  new JPanel();
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(30,30,20,20));
        GridLayout gl = new GridLayout(6,2,20,40);
        panelFormulario.setLayout(gl);
        panelFormulario.add(new JLabel("CLIENTE_ID"));
        panelFormulario.add(new JTextField(12));
        panelFormulario.add(new JLabel("NOMBRE"));
        panelFormulario.add(new JTextField(20));
        panelFormulario.add(new JLabel("APELLIDOS"));
        panelFormulario.add(new JTextField(20));
        panelFormulario.add(new JLabel("DIRECCION"));
        panelFormulario.add(new JTextField(20));
        panelFormulario.add(new JLabel("EMAIL"));
        panelFormulario.add(new JTextField(20));
        panelFormulario.add(new JLabel("TELEFONO"));
        panelFormulario.add(new JTextField(20));
        
        //Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("New"));
        panelBotones.add(new JButton("Back"));
        panelBotones.add(new JButton("Del"));
        panelBotones.add(new JButton("Save"));
        panelBotones.add(new JButton("<<"));
        panelBotones.add(new JButton("<"));
        panelBotones.add(new JButton(">"));
        panelBotones.add(new JButton(">>"));
        
        
        Container cp = getContentPane();
        cp.add(panelTitulo, BorderLayout.NORTH);
        cp.add(panelFormulario, BorderLayout.CENTER);
        cp.add(panelBotones, BorderLayout.SOUTH);
      
    }
}
