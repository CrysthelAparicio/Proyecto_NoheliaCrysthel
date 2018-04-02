/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public void escribirArchivo() throws IOException, Exception {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < listaUsuarios.getTamanio(); i++) {
                Usuario u = (Usuario) listaUsuarios.getValor(i);
                if (u instanceof UsuarioComun) {
                    u = (UsuarioComun)u;
                    bw.write(u.getNombre() +" "+ u.getApelido()+";");
                    bw.write(u.getFecha_nacimiento()+";");
                    bw.write(u.getSexo()+";");
                    bw.write(u.getUsuario()+";");
                    bw.write( u.getContraseña()+";");
                    bw.write(u.getCorreo()+";");
                    bw.write(((UsuarioComun) u).getDireccion()+";");
                    for (int j = 0; j < ((UsuarioComun)u).getListaAmigos().getTamanio(); j++) {
                         bw.write(((UsuarioComun)((UsuarioComun)u).getListaAmigos().getValor(j)).getUsuario() + ",");
                         bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioComun)u).getListaCandidatos().getTamanio() ; j++) {
                        bw.write(((UsuarioCandidato)((UsuarioComun)u).getListaCandidatos().getValor(j)).getUsuario() + ",");
                        bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioComun)u).getRecibidos().getTamanio() ; j++) {
                        bw.write(((Mensaje)((UsuarioComun)u).getRecibidos().getValor(j)).getEmisor()+ ",");
                        bw.write(((Mensaje)((UsuarioComun)u).getRecibidos().getValor(j)).getDescripcion()+ ",");
                        bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioComun)u).getEnviados().getTamanio() ; j++) {
                        bw.write(((Mensaje)((UsuarioComun)u).getEnviados().getValor(j)).getReceptor()+ ",");
                        bw.write(((Mensaje)((UsuarioComun)u).getEnviados().getValor(j)).getDescripcion()+ ",");
                        bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioComun)u).getEnviados().getTamanio() ; j++) {
                        bw.write(((Mensaje)((UsuarioComun)u).getRecibidos().getValor(j)).getReceptor()+ ",");
                        bw.write(((Mensaje)((UsuarioComun)u).getRecibidos().getValor(j)).getDescripcion()+ ",");
                        bw.write(";");
                    }
                    bw.write("\n");
                    bw.flush();
                } else if (u instanceof UsuarioCandidato) {
                    u = (UsuarioCandidato)u;
                    bw.write(u.getNombre() +" "+ u.getApelido()+";");
                    bw.write(" " +  u.getFecha_nacimiento());
                    bw.write(" " + u.getSexo()+";");
                    bw.write(" " + u.getUsuario()+";");
                    bw.write(" " +  u.getContraseña()+";");
                    bw.write(" " + u.getCorreo()+";");
                    bw.write("\n");
                    for (int j = 0; j <((UsuarioCandidato)u).getListaCertificaciones().getTamanio() ; j++) {
                        bw.write(((Certificacion)((UsuarioCandidato)u).getListaCertificaciones().getValor(j)).getNombre() +",");
                        bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioCandidato)u).getListaPublicaciones().getTamanio() ; j++) {
                        bw.write(((Publicacion)((UsuarioCandidato)u).getListaPublicaciones().getValor(j)).getTexto() +",");
                        bw.write(";");
                    }
                    for (int j = 0; j <((UsuarioCandidato)u).getListaSeguidores().getTamanio() ; j++) {
                        bw.write(((UsuarioComun)((UsuarioCandidato)u).getListaSeguidores().getValor(j)).getUsuario()+",");
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
                    int c, e;
                    String n;
                    ArrayList<Hobbie> temp = new ArrayList();
                    c = sc.nextInt();
                    n = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (sc.hasNext()) {
                        temp.add(new Hobbie(s2.nextInt(), s2.next()));

                    }
                    e = sc.nextInt();
                    listaPersonas.add(new Persona(n, c, e));
                    listaPersonas.get(listaPersonas.size() - 1).setHobbies(temp);
                }
            } catch (Exception e) {
            }
        }

    }

}
