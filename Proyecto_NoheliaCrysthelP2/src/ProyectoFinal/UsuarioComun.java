package ProyectoFinal;

import java.io.File;
import java.util.Date;

public class UsuarioComun extends Usuario {

    private String direccion;
    private File archivo = null;

    public UsuarioComun() {
    }

    public UsuarioComun(String direccion, String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo);
        this.direccion = direccion;
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
