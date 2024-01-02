package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.Disease.Symptom;
import cl.ipp.centralizador.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SymptomService {

    @Autowired
    private SymptomRepository symptomRepository;

    public SymptomService(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    public Iterable<Symptom> listSymptoms(){
        return symptomRepository.findAll();
    }

    public Symptom createSymptom(Symptom symptom){
        return symptomRepository.save(symptom);
    }
}
