package ProyectoFinal;

import java.io.File;
import java.util.Date;

public class UsuarioComun extends Usuario {

    private String direccion;
    private File archivo = null;
    private Lista listaAmigos = new Lista();
    private Lista listaCandidatos = new Lista();
    private Lista mensajes_recibidos = new Lista();
    private Lista mensajes_enviados = new Lista();

    public UsuarioComun() {
    }

    public UsuarioComun(String direccion, String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo);
        this.direccion = direccion;
    }
    public void agregarAmigo(UsuarioComun u){
        listaAmigos.agregarAlFinal(u);
    }
    public boolean eliminarAmigo(UsuarioComun u){
        boolean flag;
        flag = listaAmigos.buscar(u);
        if (flag) {
            listaAmigos.removerPorReferencia(u);
            return true;
        }else{
            return false;
        }
        
    }
     public void agregarEnviado(Mensaje m){
        mensajes_enviados.agregarAlFinal(m);
    }
     public void agregarRecibido(Mensaje m){
        mensajes_recibidos.agregarAlFinal(m);
    }
     public void agregarCandidato(UsuarioCandidato c){
        listaCandidatos.agregarAlFinal(c);
    }
    public boolean eliminarCandidato(UsuarioCandidato c){
        boolean flag;
        flag = listaCandidatos.buscar(c);
        if (flag) {
            listaCandidatos.removerPorReferencia(c);
            return true;
        }else{
            return false;
        }
        
    }

    public Lista getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(Lista listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public Lista getEnviados() {
        return mensajes_enviados;
    }

    public void setEnviados(Lista listaCorreos) {
        this.mensajes_enviados = listaCorreos;
    }
    
    public Lista getRecibidos() {
        return mensajes_recibidos;
    }

    public void setRecibidos(Lista listaCorreos) {
        this.mensajes_recibidos = listaCorreos;
    }

    public Lista getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(Lista listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

}
