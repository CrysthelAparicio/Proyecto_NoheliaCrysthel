/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author euced
 */
public class AdminActas {

    private File archivo = null;
    private JTextArea acta;
    private String temporal;
    private File archivo1 = new File("./AdminActas.txt");

    public AdminActas(String path, JTextArea acta) {
        archivo = new File(path);
        this.acta = acta;
    }

    public File getArchivo() {
        return archivo;
    }

    public String getTemporal() {
        return temporal;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        Scanner sc = null;
        acta.setText(" ");
        String todo = "";
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String nombre;
                    nombre = sc.next();
                    todo = todo.concat(nombre + " \n");
                }
                acta.setText(todo);
                temporal = todo;
            } catch (Exception e) {
            }
            sc.close();

        } else {
        }
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo1, true);
            bw = new BufferedWriter(fw);
            
            
        } catch (Exception e) {
        }
    }

}
