/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.Serializable;

/**
 *
 * @author euced
 */
public class Certificacion implements Serializable{
    private static final long SerialVersionUID=666L;
    private String nombre;

    public Certificacion() {
    }

    public Certificacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Certificacion{" + "nombre=" + nombre + '}';
    }
    
    
}
