/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.venta.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.venta.dao.VentaDaoI;

import pe.edu.upeu.venta.modelo.Venta;

/**
 *
 * @author Student
 */
@Service
@Transactional
public class VentaServicioImpl implements VentaServicioI{

    @Autowired
    public VentaDaoI dao;    
    
    @Override
    public List<Venta> listarEntidad() {
       return dao.listarEntidad();
    }

    @Override
    public Venta buscarEntidadId(int id) {
        return dao.buscarEntidadId(id);
    }

    @Override
    public void guardarEntidad(Venta venta) {
        dao.guardarEntidad(venta);
    }

    @Override
    public void eliminarEntidad(int id) {
        dao.eliminarEntidad(id);
    }

    @Override
    public void modificarEntidad(Venta venta) {
        dao.modificarEntidad(venta);
    }
    
}
