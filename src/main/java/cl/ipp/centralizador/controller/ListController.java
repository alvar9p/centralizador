package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.Enfermedad;
import cl.ipp.centralizador.model.disease.Etapa;
import cl.ipp.centralizador.model.disease.Stage;
import cl.ipp.centralizador.model.disease.Symptom;
import cl.ipp.centralizador.service.EnfermedadService;
import cl.ipp.centralizador.service.EtapaService;
import cl.ipp.centralizador.service.StageService;
import cl.ipp.centralizador.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/list")
public class ListController {

    @Autowired
    private SymptomService symptomService;

    @Autowired
    private StageService stageService;

    // *************************** SINTOMAS ***************************

    @GetMapping("/symptoms")
    public String listarTodosLosSintomas(Model model){
        Iterable<Symptom> symptoms = symptomService.listSymptoms();
        model.addAttribute("symptoms", symptoms);
        return "pages/listSymptoms";
    }

    // *************************** Etapas ***************************

    @GetMapping(path = "/stages")
    public String listAllStages(Model model){
        Iterable<Stage> stages = stageService.listStages();
        model.addAttribute("stages", stages);
        return "pages/listStages";
    }

}
