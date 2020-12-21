/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaPrincipal;

/**
 *
 * @author migue
 */
public class IniciarAplicacion {
    
    private final VistaPrincipal principal;
    private final FormularioControlador formControl;
    
    public IniciarAplicacion() {
        principal = new VistaPrincipal();

        formControl = new FormularioControlador(principal);
        LocalizacionControlador localControl = new LocalizacionControlador(principal);
        
        principal.setVisible(true);
    }

    public VistaPrincipal getPrincipal() {
        return principal;
    }
    
}
