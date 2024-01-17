package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.disease.Disease;
import cl.ipp.centralizador.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    public DiseaseService(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    public Disease createDisease(Disease disease){
        return diseaseRepository.save(disease);
    }

    public Iterable<Disease> listDiseases(){
        return diseaseRepository.findAll();
    }
}
