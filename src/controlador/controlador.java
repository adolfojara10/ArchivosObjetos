/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.PersonaDao;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Adolfo
 */
public class controlador {

    private Persona persona;

    private PersonaDao personaDAO;

    public controlador(PersonaDao personaDAO) {
        this.personaDAO = personaDAO;
    }

    public void create(int id, String cedula, String nombre, String apellido) {
        persona = new Persona(id, cedula, nombre, apellido);

        personaDAO.create(persona);

    }

    public Persona read(String cedula) {
        persona = personaDAO.read(cedula);

        return persona;

    }

    public boolean update(int id, String cedula, String nombre, String apellido) {
        if (this.read(cedula) != null) {
            persona = new Persona(id, cedula, nombre, apellido);
            personaDAO.update(persona);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int id) {
        personaDAO.delete(id);
        return true;
    }

    public List<Persona> listadoPersonas() {
        return personaDAO.findAll();
    }

    public int numeroID() {
        return personaDAO.generarID();
    }
}
