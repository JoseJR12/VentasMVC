/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.venta.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.venta.SysDataAccess;
import pe.edu.upeu.venta.modelo.Venta;

/**
 *
 * @author Student
 */
@Repository
public class VentaDaoImpl extends SysDataAccess<Integer, Venta> implements VentaDaoI {

    @SuppressWarnings("unchecked")
    
    @Override
    public List<Venta> listarEntidad() {
        return getListAll();
    }

    @Override
    public Venta buscarEntidadId(int id) {
        return getById(id);
    }

    @Override
    public void guardarEntidad(Venta venta) {
        savev(venta);
    }

    @Override
    public void eliminarEntidad(int id) {
        delete(id);
    }

    @Override
    public void modificarEntidad(Venta venta) {
        update(venta);
    }
    
}
