/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author migue
 */
public class Alumno {
    private String nombre, fechaNac, direccion, telfTutor, nombreTutor;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String fechaNac, String direccion, String telfTutor, String nombreTutor) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telfTutor = telfTutor;
        this.nombreTutor = nombreTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelfTutor() {
        return telfTutor;
    }

    public void setTelfTutor(String telfTutor) {
        this.telfTutor = telfTutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }
    
}
