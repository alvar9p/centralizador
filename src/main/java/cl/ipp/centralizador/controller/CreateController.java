package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.*;
import cl.ipp.centralizador.model.disease.enums.Clasification;
import cl.ipp.centralizador.model.disease.enums.StageID;
import cl.ipp.centralizador.model.disease.enums.Tipe;
import cl.ipp.centralizador.repository.SymptomRepository;
import cl.ipp.centralizador.service.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/create")
public class CreateController {

    @Autowired
    private SymptomService symptomService;

    @Autowired
    private SymptomRepository symptomRepository;

    @Autowired
    private StageService stageService;

    @Autowired
    private DiseaseService diseaseService;

    // *************************** SINTOMAS ***************************

    @GetMapping(path = "/symptom")
    public String addSymptom(Symptom symptom){
        return "pages/modifySymptom";
    }

    @PostMapping(path = "/saveSymptom")
    public String saveSymptom(Symptom symptom){
        symptomService.createSymptom(symptom);
        return "redirect:/list/symptoms";
    }

    // *************************** ENFERMEDADES ***************************

    @GetMapping(path = "/getCaresAndConsiderations/{id}")
    @ResponseBody
    public SymptomResponse obtenerCuidadosYConsideraciones(@PathVariable Integer id) {
        Symptom symptom = symptomRepository.findById(id).orElse(null);

        if (symptom != null) {
            return new SymptomResponse(symptom.getCares(), symptom.getConsiderations());
        } else {
            return new SymptomResponse("No se encontró el síntoma.", "");
        }
    }

    @GetMapping(path = "/disease")
    public String addDisease(Disease disease, Model model){
        model.addAttribute("clasifications", Clasification.values());
        model.addAttribute("stages", StageID.values());
        model.addAttribute("tipes", Tipe.values());

        List<Symptom> symptoms = (List<Symptom>) symptomService.listSymptoms();
        model.addAttribute("symptoms", symptoms);

        return "pages/modifyDisease";
    }

    @PostMapping(path = "/saveStage")
    public String saveStage(Stage stage){
        stageService.createStage(stage);
        return "redirect:/list/symptoms";
    }

    @PostMapping(path = "/saveDisease")
    public String saveDisease(Disease disease){
        // Se guarda la enfermedad primero
        diseaseService.createDisease(disease);

        for (Stage stage: disease.getDiseaseStage()){
            stage.setDisease(disease);
            stageService.createStage(stage);
        }

        return "redirect:/dashboard";
    }

    @Data
    @AllArgsConstructor
    private static class SymptomResponse {
        private String cares;
        private String considerations;
    }

}
