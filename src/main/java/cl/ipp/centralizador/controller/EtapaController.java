package cl.ipp.centralizador.controller;

import cl.ipp.centralizador.model.disease.Etapa;
import cl.ipp.centralizador.service.EtapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/etapas")
public class EtapaController {

    @Autowired
    private EtapaService etapaService;

    @GetMapping(path = "/listar")
    public ResponseEntity<Iterable<Etapa>> listarEtapas() {
        Iterable<Etapa> enfermedades = etapaService.listarEtapas();
        return new ResponseEntity<>(enfermedades, HttpStatus.OK);
    }

    @PostMapping(path = "/crear")
    public ResponseEntity<Etapa> crearEtapa(@RequestBody Etapa etapa){
        return new ResponseEntity<>(etapaService.crearEtapa(etapa), HttpStatus.OK);
    }
}
