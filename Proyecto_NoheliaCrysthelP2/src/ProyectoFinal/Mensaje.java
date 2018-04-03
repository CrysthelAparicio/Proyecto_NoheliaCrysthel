package ProyectoFinal;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable{
    private static final long SerialVersionUID=777L;
    private Usuario emisor;//quien envia el mensaje
    private Usuario receptor;// el que lo reccibe
    private String asunto;
    private String descripcion;
    private Date fecha;

    public Mensaje() {
    }

    public Mensaje(Usuario emisor, Usuario receptor, String asunto, String descripcion, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
