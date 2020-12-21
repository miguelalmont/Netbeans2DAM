/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import vista.VistaPrincipal;

/**
 *
 * @author migue
 */
public class EventoMouseTabla implements MouseListener{
    
    private final VistaPrincipal principal;
    
    public EventoMouseTabla(VistaPrincipal principal) {
        this.principal = principal;
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        int row = principal.getTabla().getSelectedRow();
        
        if (row > -1){
            autocompletarFormulario(row);
            principal.getEliminarAlumnoButton().setEnabled(true);
            principal.getModificarAlumnoButton().setEnabled(true);
        } else {
            principal.getEliminarAlumnoButton().setEnabled(false);
            principal.getModificarAlumnoButton().setEnabled(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public void autocompletarFormulario(int row) {

        DefaultTableModel tableModel = (DefaultTableModel) principal.getTabla().getModel();

        principal.getNombreTextField().setText(tableModel.getValueAt(row, 0).toString());
        principal.getFechaTextField().setText(tableModel.getValueAt(row, 1).toString());
        principal.getDireccionTextField().setText(tableModel.getValueAt(row, 2).toString());
        principal.getTelefonoTextField().setText(tableModel.getValueAt(row, 3).toString());
        principal.getTutorTextField().setText(tableModel.getValueAt(row, 4).toString());

    }
    
}
