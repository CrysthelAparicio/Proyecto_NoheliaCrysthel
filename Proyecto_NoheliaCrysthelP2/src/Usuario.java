
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COPECO -13
 */
public class Usuario {

    private String nombre;
    private String apelido;
    private Date fecha_nacimiento;
    private String sexo;
    private String usuario;
    private String contraseña;
    private String correo;

    public Usuario() {
    }

    public Usuario(String nombre, String apelido, Date fecha_nacimiento, String sexo, String usuario, String contraseña, String correo) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apelido=" + apelido + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + '}';
    }

}
