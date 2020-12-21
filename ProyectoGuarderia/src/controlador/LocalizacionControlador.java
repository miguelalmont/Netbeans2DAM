/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vista.VistaPrincipal;

/**
 *
 * @author migue
 */
public class LocalizacionControlador {
    
    private VistaPrincipal principal;
    
    public LocalizacionControlador(VistaPrincipal principal){
        this.principal = principal;
        
        ImageIcon imagen = new ImageIcon(".\\images\\map.jpg");
        
        principal.getLocalizacionLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(principal.getLocalizacionLabel().getWidth(), principal.getLocalizacionLabel().getHeight(), Image.SCALE_SMOOTH)));
    }
    
}
