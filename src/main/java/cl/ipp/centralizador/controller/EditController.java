package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.Symptom;
import cl.ipp.centralizador.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/edit")
public class EditController {

    @Autowired
    private SymptomService symptomService;

    @GetMapping(path = "/symptom/{idSymptom}")
    public String editSymptom(Symptom symptom, Model model){
        symptom = symptomService.findSymptomById(symptom);
        model.addAttribute("symptom", symptom);
        return "pages/modifySymptom";
    }


}
