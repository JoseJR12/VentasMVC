/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.venta.dao;

import java.util.List;
import pe.edu.upeu.venta.modelo.Venta;

/**
 *
 * @author Student
 */
public interface VentaDaoI {
    public List<Venta> listarEntidad();
    public Venta buscarEntidadId(int id);
    public void guardarEntidad(Venta venta);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Venta venta);    
}
