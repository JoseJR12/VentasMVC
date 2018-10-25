/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.venta.control;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.venta.modelo.Venta;
import pe.edu.upeu.venta.servicio.VentaServicioI;

/**
 *
 * @author Student
 */
@Controller
public class VentaControl {
    
    @Autowired
    private MessageSource messageSource;

    @Autowired
    VentaServicioI ventaServicioI;
    
    @RequestMapping(value = {"/mainventa" }, method = RequestMethod.GET)    
    public ModelAndView inicio(Locale locale, Map<String,Object> model){
        String welcome=messageSource.getMessage("welcome.message", new Object[]{"jose raul"}, locale);
        List<Venta> lista=ventaServicioI.listarEntidad();
        model.put("ListaVenta", lista);
        model.put("message", welcome);
        model.put("startMeeting", "09:10");

        return new ModelAndView("index");
    }
    @RequestMapping(value = {"/elim" }, method = RequestMethod.GET)
public ModelAndView eliminarPersona(HttpServletRequest r){
    int idEntidad=Integer.parseInt(r.getParameter("id"));
    ventaServicioI.eliminarEntidad(idEntidad);
    //${pageContext.request.contextPath}
    
return new ModelAndView(new RedirectView(r.getContextPath()+"/mainventa"));
}
@RequestMapping(value = {"/buscar"}, method = RequestMethod.POST)
public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
    String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
    String dato=r.getParameter("dato");
    List<Venta> lista=ventaServicioI.listarEntidad();
    model.put("ListaPersona", lista);
    model.put("message", welcome);
    model.put("startMeeting", "09:10");    
return new ModelAndView("persona/mainPersona");
}
    @RequestMapping(value = "/guardarVenta", method = RequestMethod.POST)
public ModelAndView guardarEntidad(@ModelAttribute("modeloVenta")Venta venta,
            BindingResult result){
        ventaServicioI.guardarEntidad(venta);
       
        //${pageContext.request.contextPath}
       
    return new ModelAndView(new RedirectView("/mainventa"));
}
    
}
