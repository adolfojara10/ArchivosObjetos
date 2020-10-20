/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import idao.PersonaIdao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Adolfo
 */
public class PersonaDao implements PersonaIdao {

    private FileOutputStream archivo;
    private ObjectOutputStream archivoEscritura;
    private FileInputStream archivo2;
    private ObjectInputStream archivoLectura;
    private List<Persona> listaPersonas;

    public PersonaDao() {
        try {
            archivo = new FileOutputStream("C:\\Users\\Adolfo\\Desktop\\Programación Aplicada\\ArchivosDeObjetos\\personas.obj");
            archivoEscritura = new ObjectOutputStream(archivo);

            archivo2 = new FileInputStream("C:\\Users\\Adolfo\\Desktop\\Programación Aplicada\\ArchivosDeObjetos\\personas.obj");
            archivoLectura = new ObjectInputStream(archivo2);

            listaPersonas = new ArrayList();
            listaPersonas = (List<Persona>) archivoLectura.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error conexion dao");
        }
    }

    @Override
    public void create(Persona p) {
        try {
            listaPersonas.add(p);
            archivoEscritura.writeObject(listaPersonas);
        } catch (Exception e) {
            System.out.println("Error escritura create");
        }
    }

    @Override
    public Persona read(String cedula) {
        try {
            for (Persona persona : listaPersonas) {
                if (persona.getCedula().equals(cedula)) {
                    return persona;
                }
            }

            return null;

        } catch (Exception e) {
            System.out.println("Error lectura");
        }
        return null;
    }

    @Override
    public void update(Persona p) {
        try {
            for (Persona persona : listaPersonas) {
                if (persona.getId() == p.getId()) {
                    int posicion = listaPersonas.indexOf(persona);
                    listaPersonas.set(posicion, p);
                }
            }
            archivoEscritura.writeObject(listaPersonas);
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(int id) {
        try {
            for (Persona persona : listaPersonas) {
                if (persona.getId() == id) {
                    listaPersonas.remove(persona);
                }
            }

            archivoEscritura.writeObject(listaPersonas);
        } catch (Exception e) {

        }

    }

    @Override
    public List<Persona> findAll() {
        return listaPersonas;
    }

    public int generarID() {
        if (listaPersonas.size() > 0) {
            return listaPersonas.get(listaPersonas.size() - 1).getId() + 1;
        }
        return 1;

    }
}
