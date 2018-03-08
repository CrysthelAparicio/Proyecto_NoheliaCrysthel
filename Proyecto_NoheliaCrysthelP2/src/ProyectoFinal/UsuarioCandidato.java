package ProyectoFinal;

import java.util.Date;

public class UsuarioCandidato extends Usuario {

    public UsuarioCandidato() {
    }

    public UsuarioCandidato(String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo) {
        super(nombre, apelido, fecha_nacimiento, sexo, usuario, contraseña, correo);
    }
    
}
