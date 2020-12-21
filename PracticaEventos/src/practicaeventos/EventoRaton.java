/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaeventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author migue
 */
public class EventoRaton implements MouseListener{
    
    // Este evento se activa cuando se hace click en cualquier parte vacía de la ventana
    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Cambiamos el texto del JLabel de la ventana principal
        Ejemplo.getLabel().setText("HAS CLICKADO FUERA");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
