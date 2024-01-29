package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.disease.Symptom;
import cl.ipp.centralizador.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SymptomService {

    @Autowired
    private SymptomRepository symptomRepository;

    public SymptomService(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    @Transactional
    public Symptom createSymptom(Symptom symptom){
        return symptomRepository.save(symptom);
    }

    @Transactional(readOnly = true)
    public Iterable<Symptom> listSymptoms(){
        return symptomRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Symptom findSymptomById(Symptom symptom){
        return symptomRepository.findById(symptom.getIdSymptom()).orElse(null);
    }

    @Transactional
    public void deleteSymptom(Symptom symptom){
        symptomRepository.deleteById(symptom.getIdSymptom());
    }
}
