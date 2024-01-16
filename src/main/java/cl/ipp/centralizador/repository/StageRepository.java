package cl.ipp.centralizador.repository;

import cl.ipp.centralizador.model.disease.Stage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends CrudRepository<Stage, Integer> {
}
