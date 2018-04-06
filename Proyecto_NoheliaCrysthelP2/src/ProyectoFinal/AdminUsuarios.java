/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author euced
 */
public class AdminUsuarios {

    private Lista listaUsuarios = new Lista();
    private File archivo = null;

    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public Lista getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(Lista listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setUsuario(Usuario u) {
        this.listaUsuarios.agregarAlFinal(u);
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /*
    public void escribirArchivo() throws IOException, Exception {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < listaUsuarios.getTamanio(); i++) {
                Usuario u = (Usuario) listaUsuarios.getValor(i);
                if (u instanceof UsuarioComun) {
                    u = (UsuarioComun) u;
                    bw.write(u.getNombre() + " " + u.getApelido() + ";");
                    bw.write(u.getFecha_nacimiento() + ";");
                    bw.write(u.getSexo() + ";");
                    bw.write(u.getUsuario() + ";");
                    bw.write(u.getContraseña() + ";");
                    bw.write(u.getCorreo() + ";");
                    bw.write(((UsuarioComun) u).getDireccion() + ";");
                    for (int j = 0; j < ((UsuarioComun) u).getListaAmigos().getTamanio(); j++) {
                        bw.write(((UsuarioComun) ((UsuarioComun) u).getListaAmigos().getValor(j)).getUsuario() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioComun) u).getListaCandidatos().getTamanio(); j++) {
                        bw.write(((UsuarioCandidato) ((UsuarioComun) u).getListaCandidatos().getValor(j)).getUsuario() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioComun) u).getRecibidos().getTamanio(); j++) {
                        bw.write(((Mensaje) ((UsuarioComun) u).getRecibidos().getValor(j)).getEmisor() + ",");
                        bw.write(((Mensaje) ((UsuarioComun) u).getRecibidos().getValor(j)).getDescripcion() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioComun) u).getEnviados().getTamanio(); j++) {
                        bw.write(((Mensaje) ((UsuarioComun) u).getEnviados().getValor(j)).getReceptor() + ",");
                        bw.write(((Mensaje) ((UsuarioComun) u).getEnviados().getValor(j)).getDescripcion() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioComun) u).getEnviados().getTamanio(); j++) {
                        bw.write(((Mensaje) ((UsuarioComun) u).getRecibidos().getValor(j)).getReceptor() + ",");
                        bw.write(((Mensaje) ((UsuarioComun) u).getRecibidos().getValor(j)).getDescripcion() + ",");
                        bw.write(";");
                    }
                    bw.write("\n");
                    bw.flush();
                } else if (u instanceof UsuarioCandidato) {
                    u = (UsuarioCandidato) u;
                    bw.write(u.getNombre() + " " + u.getApelido() + ";");
                    bw.write(" " + u.getFecha_nacimiento());
                    bw.write(" " + u.getSexo() + ";");
                    bw.write(" " + u.getUsuario() + ";");
                    bw.write(" " + u.getContraseña() + ";");
                    bw.write(" " + u.getCorreo() + ";");
                    bw.write("\n");
                    for (int j = 0; j < ((UsuarioCandidato) u).getListaCertificaciones().getTamanio(); j++) {
                        bw.write(((Certificacion) ((UsuarioCandidato) u).getListaCertificaciones().getValor(j)).getNombre() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioCandidato) u).getListaPublicaciones().getTamanio(); j++) {
                        bw.write(((Publicacion) ((UsuarioCandidato) u).getListaPublicaciones().getValor(j)).getTexto() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j < ((UsuarioCandidato) u).getListaSeguidores().getTamanio(); j++) {
                        bw.write(((UsuarioComun) ((UsuarioCandidato) u).getListaSeguidores().getValor(j)).getUsuario() + ",");
                        bw.write(";");
                    }
                    bw.flush();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new Lista();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {

                    String nombre;
                    String apelido;
                    Date fecha_nacimiento;
                    String sexo;
                    String usuario;
                    String contraseña;
                    String correo;

                    ArrayList<Usuario> temp = new ArrayList();
                   
                    nombre = sc.next();
                    apelido = sc.next();
                    sexo = sc.next();
                    usuario = sc.next();
                    contraseña = sc.next();
                    correo = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (sc.hasNext()) {
                        temp.add(new Usuario(s2.next(), s2.next(),s2.next(),s2.next(),s2.next(),s2.next(),s2.next()));

                    }
                    fecha_nacimiento=sc.next();
                    
                    listaUsuarios.add(new Usuario(nombre, apelido, fecha_nacimiento,sexo,usuario,contraseña,correo));
                    listaUsuarios.get(listaUsuarios.size() - 1).setUsuario(temp);
                }
            } catch (Exception e) {
            }
        }

    }
     */
    //mutador extra
    public void setUsuarios(Usuario u) {
        listaUsuarios.agregarAlFinal(u);
    }

    public void cargarArchivo() {
        try {
            listaUsuarios = new Lista();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    

                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listaUsuarios.agregarAlFinal(temp);
                    }
                } catch (EOFException e) {
                    //ENCONTRO EL FINAL DEL ARCHIVO
                }
                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (int i = 0; i < listaUsuarios.getTamanio(); i++) {
                bw.writeObject(listaUsuarios.getValor(i));
            }

            //////////
//            for (Usuario u : listaUsuarios) {
//                bw.writeObject(u);
//
//            }

            bw.flush();

        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
