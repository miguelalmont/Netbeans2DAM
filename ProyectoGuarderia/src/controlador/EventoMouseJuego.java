/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author migue
 */
public class EventoMouseJuego implements MouseListener{
    
    File audioFile;
    
    public EventoMouseJuego(File audioFile){
        this.audioFile = audioFile;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {

	try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile))
	{   
            Clip audioClip = AudioSystem.getClip();

            audioClip.open(audioStream);

            audioClip.start();

	}
	catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex)
	{
            System.err.println("Error reproduciendo el audio");
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
    
}
