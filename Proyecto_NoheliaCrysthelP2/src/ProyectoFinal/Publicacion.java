/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author euced
 */
public class Publicacion implements Serializable {

    private static final long SerialVersionUID = 888L;
    private String texto;
    private Date fechaPubli;

    public Publicacion() {
    }

    public Publicacion(String texto, Date fechaPubli) {
        this.texto = texto;
        this.fechaPubli = fechaPubli;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaPubli() {
        return fechaPubli;
    }

    public void setFechaPubli(Date fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "texto=" + texto + ", fechaPubli=" + fechaPubli + '}';
    }

}
