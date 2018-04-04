/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author COPECO -13
 */
public class AdminPublicacion {

    private Lista listaPublicacion = new Lista();
    private File archivo = null;

    public AdminPublicacion(String path) {
        archivo = new File(path);
    }

    public Lista getListaPublicacion() {
        return listaPublicacion;
    }

    public void setListaPublicacion(Lista listaPublicacion) {
        this.listaPublicacion = listaPublicacion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //mutador extra
    public void setMensaje(Publicacion p) {
        listaPublicacion.agregarAlFinal(p);
    }

    public void cargarArchivo() {
        try {
            listaPublicacion = new Lista();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listaPublicacion.agregarAlFinal(temp);
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
            for (int i = 0; i < listaPublicacion.getTamanio(); i++) {
                bw.writeObject(listaPublicacion.getValor(i));
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
