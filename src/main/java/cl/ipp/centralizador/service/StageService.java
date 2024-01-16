package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.disease.Etapa;
import cl.ipp.centralizador.model.disease.Stage;
import cl.ipp.centralizador.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageService {

    @Autowired
    StageRepository stageRepository;

    public StageService(StageRepository stageRepository) {
        this.stageRepository = stageRepository;
    }

    public Stage createStage(Stage stage){
        return stageRepository.save(stage);
    }

    public Iterable<Stage> listStages() {
        return stageRepository.findAll();
    }
}

