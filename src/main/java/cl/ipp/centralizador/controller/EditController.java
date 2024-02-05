package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.Disease;
import cl.ipp.centralizador.model.disease.Stage;
import cl.ipp.centralizador.model.disease.Symptom;
import cl.ipp.centralizador.service.DiseaseService;
import cl.ipp.centralizador.service.StageService;
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

    @Autowired
    private StageService stageService;

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping(path = "/symptom/{idSymptom}")
    public String editSymptom(Symptom symptom, Model model){
        symptom = symptomService.findSymptomById(symptom);
        model.addAttribute("symptom", symptom);
        return "pages/modifySymptom";
    }

    @GetMapping(path = "/stage/{idStage}")
    public String editStage(Stage stage, Model model){
        stage = stageService.findStageById(stage);
        model.addAttribute("stage", stage);
        return "pages/modifyStage";
    }

    @GetMapping(path = "/disease/{idDisease}")
    public String editDisease(Disease disease, Model model){
        disease = diseaseService.findDiseaseById(disease);
        model.addAttribute("disease", disease);
        return "pages/modifyDisease";
    }


}
