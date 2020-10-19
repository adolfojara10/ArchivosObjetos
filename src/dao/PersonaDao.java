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
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Adolfo
 */
public class PersonaDao implements PersonaIdao{

    private FileOutputStream archivo;
    private ObjectOutputStream archivoEscritura;
    private FileInputStream archivo2;
    private ObjectInputStream archivoLectura;

    public PersonaDao() {
        try{
            archivo = new FileOutputStream("C:\\Users\\Adolfo\\Desktop\\Programación Aplicada\\ArchivosDeObjetos\\personas.obj");
            archivoEscritura = new ObjectOutputStream(archivo);
            
            archivo2 = new FileInputStream("C:\\Users\\Adolfo\\Desktop\\Programación Aplicada\\ArchivosDeObjetos\\personas.obj");
            archivoLectura = new ObjectInputStream(archivo2);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void create(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona read(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
