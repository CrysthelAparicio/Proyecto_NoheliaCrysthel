package ProyectoFinal;

import java.io.File;
import java.util.Date;

public class UsuarioComun extends Usuario {

    private String direccion;
    private File archivo = null;
    private Lista listaAmigos = new Lista();
    private Lista listaCorreos = new Lista();
    private Lista listaCandidatos = new Lista();

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
     public void agregarCorreo(Mensaje m){
        listaCorreos.agregarAlFinal(m);
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
