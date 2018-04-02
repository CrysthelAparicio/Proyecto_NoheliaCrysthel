package ProyectoFinal;

import java.util.Date;

public class UsuarioCandidato extends Usuario {
    private Lista listaCertificaciones = new Lista();
    private Lista listaPublicaciones = new Lista();
    private Lista listaSeguidores = new Lista();
    
    
    public UsuarioCandidato() {
    }

    public UsuarioCandidato(String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo);
    }
     public void agregarCertificacion(Certificacion c){
        listaCertificaciones.agregarAlFinal(c);
    }
    public void agregarPublicacion(Publicacion p){
        listaPublicaciones.agregarAlFinal(p);
    }
    public void agregarSeguidor(UsuarioComun u){
        listaSeguidores.agregarAlFinal(u);
    }

    public Lista getListaCertificaciones() {
        return listaCertificaciones;
    }

    public void setListaCertificaciones(Lista listaCertificaciones) {
        this.listaCertificaciones = listaCertificaciones;
    }

    public Lista getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(Lista listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public Lista getListaSeguidores() {
        return listaSeguidores;
    }

    public void setListaSeguidores(Lista listaSeguidores) {
        this.listaSeguidores = listaSeguidores;
    }
    
    
}
