/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import vista.VistaPrincipal;

/**
 *
 * @author migue
 */
public final class FormularioControlador {
    private final VistaPrincipal principal;
    private final EventoMouseTabla eventoRaton;
    
    public FormularioControlador(VistaPrincipal principal){
        this.principal = principal;
        
        eventoRaton = new EventoMouseTabla(principal);
        principal.getTabla().addMouseListener(eventoRaton);
        
        validarFormulario(true);
        insertarAlumno(true);
        limpiarCampos(true);
        modificarAlumno(true);
        eliminarAlumno(true);
        
        principal.getEliminarAlumnoButton().setEnabled(false);
        principal.getModificarAlumnoButton().setEnabled(false);
    }
    
    public void validarFormulario(boolean active) {
           
        if (active){
            principal.getInsertarAlumnoButton().setEnabled(false);
            ValidationGroup group = principal.getValidationPane().getValidationGroup();

            group.add(principal.getNombreTextField(), StringValidators.REQUIRE_NON_EMPTY_STRING);
            group.add(principal.getFechaTextField(), StringValidators.REQUIRE_NON_EMPTY_STRING);
            group.add(principal.getDireccionTextField(), StringValidators.REQUIRE_NON_EMPTY_STRING);
            group.add(principal.getTelefonoTextField(), StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);
            group.add(principal.getTutorTextField(), StringValidators.REQUIRE_NON_EMPTY_STRING);

            principal.getValidationPane().addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    if (principal.getValidationPane().getProblem() == null) {
                        principal.getInsertarAlumnoButton().setEnabled(true);
                    } else {
                        principal.getInsertarAlumnoButton().setEnabled(false);
                    }
                }
            });
        }
    }

    public void insertarAlumno(boolean active) {
        
        if (active){
            DefaultTableModel tableModel = (DefaultTableModel) principal.getTabla().getModel();

            principal.getInsertarAlumnoButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    tableModel.addRow(new Object[]{principal.getNombreTextField().getText(),
                        principal.getFechaTextField().getText(),
                        principal.getDireccionTextField().getText(),
                        principal.getTelefonoTextField().getText(),
                        principal.getTutorTextField().getText()});
                }
            });
        }
    }


    public void limpiarCampos(boolean active) {

        if (active){
            principal.getLimpiarButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    principal.getNombreTextField().setText("");
                    principal.getFechaTextField().setText("");
                    principal.getDireccionTextField().setText("");
                    principal.getTelefonoTextField().setText("");
                    principal.getTutorTextField().setText("");
                }

            });
        }
    }
    
    public void modificarAlumno(boolean active) {
        
        if (active){
            DefaultTableModel tableModel = (DefaultTableModel) principal.getTabla().getModel();

            principal.getModificarAlumnoButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    tableModel.setValueAt(principal.getNombreTextField().getText(), principal.getTabla().getSelectedRow(), 0);
                    tableModel.setValueAt(principal.getFechaTextField().getText(), principal.getTabla().getSelectedRow(), 1);
                    tableModel.setValueAt(principal.getDireccionTextField().getText(), principal.getTabla().getSelectedRow(), 2);
                    tableModel.setValueAt(principal.getTelefonoTextField().getText(), principal.getTabla().getSelectedRow(), 3);
                    tableModel.setValueAt(principal.getTutorTextField().getText(), principal.getTabla().getSelectedRow(), 4);
                    principal.getTabla().clearSelection();
                    principal.getModificarAlumnoButton().setEnabled(false);
                    principal.getEliminarAlumnoButton().setEnabled(false);
                }
            });
        }
    }
    
    public void eliminarAlumno(boolean active) {
        if (active){
            DefaultTableModel tableModel = (DefaultTableModel) principal.getTabla().getModel();

            principal.getEliminarAlumnoButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {      
                    tableModel.removeRow(principal.getTabla().getSelectedRow());
                    principal.getTabla().clearSelection();
                    principal.getEliminarAlumnoButton().setEnabled(false);
                    principal.getModificarAlumnoButton().setEnabled(false);
                }
            });
        }
    }
}
