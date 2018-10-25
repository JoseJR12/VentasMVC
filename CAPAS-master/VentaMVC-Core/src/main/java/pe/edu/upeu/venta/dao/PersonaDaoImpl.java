/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.venta.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.venta.SysDataAccess;
import pe.edu.upeu.venta.modelo.Persona;

/**
 *
 * Hernan Carbajal
 */
@Repository
public class PersonaDaoImpl extends SysDataAccess<Integer, Persona> implements PersonaDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Persona> listarEntidad(){ return getListAll();}    
    
    
    public List<Persona> listarEntidadDato(String dato){
        return (List<Persona>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from Persona p WHERE p.nombre LIKE ? ")
                .setString(0, "%"+dato+"%")
                .list();                
                }
    @Override
    public Persona buscarEntidadId(int id){ return getById(id);}
    
    @Override
    public void guardarEntidad(Persona persona){savev(persona);}
    @Override
    public void eliminarEntidad(int id){delete(id);}
    @Override
    public void modificarEntidad(Persona persona){update(persona);}

}
