/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import vista.VistaJuego;

/**
 *
 * @author migue
 */
public final class JuegoControlador {
    VistaJuego juego;
    
    public JuegoControlador(VistaJuego juego) {
        this.juego = juego;
        
        juego.getPerroLabel().setIcon(ajustarImagen(".\\images\\perro.jpg"));
        juego.getGatoLabel().setIcon(ajustarImagen(".\\images\\gato.jpg"));
        juego.getVacaLabel().setIcon(ajustarImagen(".\\images\\vaca.png"));
        juego.getPatoLabel().setIcon(ajustarImagen(".\\images\\pato.jpg"));
        juego.getCaballoLabel().setIcon(ajustarImagen(".\\images\\caballo.jpg"));
        juego.getOvejaLabel().setIcon(ajustarImagen(".\\images\\oveja.jpg"));
        juego.getGalloLabel().setIcon(ajustarImagen(".\\images\\gallo.jpg"));
        juego.getDelfinLabel().setIcon(ajustarImagen(".\\images\\delfin.jpg"));
        
        
        juego.getPerroLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\perro.WAV")));
        juego.getGatoLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\gato.WAV")));
        juego.getVacaLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\vaca.WAV")));
        juego.getPatoLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\pato.WAV")));
        juego.getCaballoLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\caballo.WAV")));
        juego.getOvejaLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\oveja.WAV")));
        juego.getGalloLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\gallo.WAV")));
        juego.getDelfinLabel().addMouseListener(new EventoMouseJuego(new File(".\\sounds\\delfin.WAV")));
    }
    
    public ImageIcon ajustarImagen(String ruta){
        
        ImageIcon imagen = new ImageIcon(ruta);
        
        return new ImageIcon(imagen.getImage().getScaledInstance(juego.getPerroLabel().getWidth(), juego.getPerroLabel().getHeight(), Image.SCALE_DEFAULT));
    }
}
