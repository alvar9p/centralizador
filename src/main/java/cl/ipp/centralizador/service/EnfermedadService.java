package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.Disease.Enfermedad;
import cl.ipp.centralizador.repository.EnfermedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnfermedadService {

    @Autowired
    private EnfermedadRepository enfermedadRepository;

    public EnfermedadService(EnfermedadRepository enfermedadRepository) {
        this.enfermedadRepository = enfermedadRepository;
    }

    public Enfermedad crearEnfermedad(Enfermedad enfermedad){
        return enfermedadRepository.save(enfermedad);
    }

    public Enfermedad enfermerdadConEtapa(Enfermedad enfermedad){
        return enfermedadRepository.save(enfermedad);
    }

    public Iterable<Enfermedad> listarEnfermedades(){
        return enfermedadRepository.findAll();
    }

    public long totalEnfermedades(){
        return enfermedadRepository.count();
    }



}
