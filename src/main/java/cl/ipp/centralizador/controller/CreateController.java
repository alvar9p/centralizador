package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.Disease.Enfermedad;
import cl.ipp.centralizador.model.Disease.Etapa;
import cl.ipp.centralizador.model.Disease.Symptom;
import cl.ipp.centralizador.model.Disease.enums.Clasificacion;
import cl.ipp.centralizador.model.Disease.enums.EtapaID;
import cl.ipp.centralizador.model.Disease.enums.Tipo;
import cl.ipp.centralizador.service.EnfermedadService;
import cl.ipp.centralizador.service.EtapaService;
import cl.ipp.centralizador.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "/create")
public class CreateController {

    // private final String CONTROLLER_PATH = "/create";

    @Autowired
    private EnfermedadService enfermedadService;

    @Autowired
    private EtapaService etapaService;

    @Autowired
    private SymptomService symptomService;

    @GetMapping(path = "/agregarEnfermedad")
    public String agregarEnfermedad(Enfermedad enfermedad, Etapa etapa, Model model){
        model.addAttribute("clasificaciones", Clasificacion.values());
        model.addAttribute("etapas", EtapaID.values());
        model.addAttribute("tipos", Tipo.values());
        return "modificarEnfermedad";
    }

    @PostMapping(path = "/guardarEnfermedad")
    public String guardarEnfermedad(Enfermedad enfermedad){

        // Primero, guarda la enfermedad
        enfermedadService.crearEnfermedad(enfermedad);

        // Luego, asigna la enfermedad a cada etapa y guárdalas
        /*for (Etapa etapa : enfermedad.getEtapasEnf()) {
            etapa.setEnfermedad(enfermedad);
            etapaService.crearEtapa(etapa);
        }*/

        for (Etapa etapa : enfermedad.getEtapasEnf()) {
            etapa.setEnfermedad(enfermedad);
            etapaService.crearEtapa(etapa);

        }

        return "redirect:/index";
    }

    // *************************** SINTOMAS ***************************

    @GetMapping(path = "/symptom")
    public String addSymptom(Symptom symptom){

        /*Symptom symptoms = new Symptom("Nombre del Síntoma",
                Arrays.asList("Cuidado 1", "Cuidado 2", "Cuidado 3"),
                Arrays.asList("Consideración 1", "Consideración 2", "Consideración 3"));

        symptomService.createSymptom(symptoms);*/

        return "pages/modifySymptom";
    }

    @PostMapping(path = "/saveSymptom")
    public String saveSymptom(Symptom symptom){
        symptomService.createSymptom(symptom);
        return "redirect:/list/symptoms";
    }

}
