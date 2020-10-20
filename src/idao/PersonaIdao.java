/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.util.List;
import modelo.Persona;

/**
 *
 * @author Adolfo
 */
public interface PersonaIdao {
    
    public void create(Persona p);
    
    public Persona read(String cedula);
    
    public void update(Persona p);
    
    public void delete(int id);
    
    public List<Persona> findAll();
    
}
