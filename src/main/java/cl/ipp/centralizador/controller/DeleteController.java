package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.Disease.Enfermedad;
import cl.ipp.centralizador.model.Disease.Symptom;
import cl.ipp.centralizador.service.EnfermedadService;
import cl.ipp.centralizador.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/delete")
public class DeleteController {

    @Autowired
    private SymptomService symptomService;

    @Autowired
    private EnfermedadService enfermedadService;

    @GetMapping(path = "/symptom/{idSymptom}")
    public String removeSymptom(Symptom symptom){
        symptomService.deleteSymptom(symptom);
        return "redirect:/list/symptoms";
    }
}
