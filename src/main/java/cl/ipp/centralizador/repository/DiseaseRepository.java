package cl.ipp.centralizador.repository;

import cl.ipp.centralizador.model.disease.Disease;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends CrudRepository<Disease, Integer> {
}
