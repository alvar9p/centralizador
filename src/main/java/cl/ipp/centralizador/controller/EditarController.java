package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.Disease.Enfermedad;
import cl.ipp.centralizador.service.EnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/editar")
public class EditarController {

    @Autowired
    private EnfermedadService enfermedadService;

    @DeleteMapping(path = "/{idEnf}")
    private String editarEnfermedad(Enfermedad enfermedad){
        // Método aún no se crea - está de relleno
        // https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/21453364#overview
        return "/";
    }
}
