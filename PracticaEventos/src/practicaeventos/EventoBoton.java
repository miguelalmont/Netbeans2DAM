/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaeventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author migue
 */
public class EventoBoton implements ActionListener {
    
    //Declaramos una variable de entero para el contador de pulsaciones del boton.
    static int contador;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Si al pulsar el boton la longitud del contenido del JLabel esta vacío o es igual al texto del MousePerformed,
        //añadimos la cadena "HAS PULSADO EL BOTON" y el texto del botón cambia.
        if (Ejemplo.getLabel().getText().length() <= 0 || Ejemplo.getLabel().getText() == "HAS CLICKADO FUERA") {
            Ejemplo.getLabel().setText("HAS PULSADO EL BOTON");
            Ejemplo.getBoton().setText("DESPULSAME");
        }
        //Si no se cumple la condición anterior, el texto de JLabel se queda a 0
        // y vuelve a cambiar el texto del botón.
        else{
            Ejemplo.getLabel().setText("");
            Ejemplo.getBoton().setText("PULSAME");
        }
        
        //Con esta línea podemos ver por consola el número de veces que ha sido
        //pulsado el botón.
        System.out.println("Has pulsado "+(++contador)+" veces el boton");
    }
}
