package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.Disease;
import cl.ipp.centralizador.model.disease.Stage;
import cl.ipp.centralizador.model.disease.Symptom;
import cl.ipp.centralizador.service.DiseaseService;
import cl.ipp.centralizador.service.StageService;
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
    private StageService stageService;

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping(path = "/symptom/{idSymptom}")
    public String removeSymptom(Symptom symptom){
        symptomService.deleteSymptom(symptom);
        return "redirect:/list/symptoms";
    }

    @GetMapping(path = "/stage/{idStage}")
    public String removeStage(Stage stage){
        stageService.deleteById(stage);
        return "redirect:/list/stages";
    }

    @GetMapping(path = "/disease/{idDisease}")
    public String removeDisease(Disease disease){
        diseaseService.deleteById(disease);
        return "redirect:/list/diseases";
    }


}
