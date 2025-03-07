/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serializardeserializaralumno;

/**
 *
 * @author alumno
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorFichero {

    private File ficheroBinario2 = null;

    public GestorFichero(File fich) {
        ficheroBinario2 = fich;
    }

    public void escribirAlumnos(ArrayList<Alumno> alumnos) {

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {

            fos = new FileOutputStream(ficheroBinario2);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            for (Alumno a : alumnos) {
                oos.writeObject(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());

        } finally {

            try {
                oos.flush();
                oos.close();
            } catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }

    public void leerAlumnos() {

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream(ficheroBinario2);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            while (true) {
                Alumno a = (Alumno) ois.readObject();
                System.out.println(a);
            }
        } catch (EOFException e) {
            // Excepcion controlada. Fin de fichero
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Error" + e.getMessage());
        } finally {

            try {
                ois.close();
            } catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
