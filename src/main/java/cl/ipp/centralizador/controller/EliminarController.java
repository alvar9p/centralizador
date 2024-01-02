package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.Disease.Enfermedad;
import cl.ipp.centralizador.service.EnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/eliminar")
public class EliminarController {

    @Autowired
    private EnfermedadService enfermedadService;

    @GetMapping(path = "/{idEnf}")
    public String eliminarEnfermedad(Enfermedad enfermedad){
        // Tampoco lo he implementado aun
        return "/";
    }
}
