package ProyectoFinal;

import java.io.File;

public class UsuarioComun extends Usuario {

    private String direccion;
    private File archivo = null;

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
