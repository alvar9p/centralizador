package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.Disease.*;
import cl.ipp.centralizador.service.EnfermedadService;
import cl.ipp.centralizador.service.EtapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping("/api/enfermedades")
public class EnfermedadController {

    // private final String CONTROLLER_PATH = "/api/enfermedades";

    @Autowired
    private EnfermedadService enfermedadService;

    @Autowired
    private EtapaService etapaService;

    @GetMapping(path = "/")
    public String inicio(Model model){
        String mensaje = "Hola, estoy testeando esto...";
        model.addAttribute("cualquierValor", mensaje);

        return "index";
    }

    @GetMapping(path = "/listar")
    public ResponseEntity<Iterable<Enfermedad>> listarEnfermedades() {
        Iterable<Enfermedad> enfermedades = enfermedadService.listarEnfermedades();
        return new ResponseEntity<>(enfermedades, HttpStatus.OK);
    }

    @PostMapping(path = "/crear")
    public ResponseEntity<Enfermedad> crearEnfermedad(@RequestBody Enfermedad request){
        return new ResponseEntity<>(enfermedadService.crearEnfermedad(request), HttpStatus.OK);
    }

    @PostMapping(path = "/crearEtapa")
    public ResponseEntity<Etapa> crearEtapa(@RequestBody Etapa request){
        return new ResponseEntity<>(etapaService.crearEtapa(request), HttpStatus.OK);
    }

    @PostMapping(path = "/crearConTodo")
    public ResponseEntity<Enfermedad>crearFullEnfemerdad(@RequestBody Enfermedad fullEnfermedad){
        return new ResponseEntity<>(enfermedadService.crearEnfermedad(fullEnfermedad), HttpStatus.OK);
    }
}
