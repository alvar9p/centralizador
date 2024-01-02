package cl.ipp.centralizador.repository;

import cl.ipp.centralizador.model.Disease.Symptom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends CrudRepository<Symptom, Integer> {
}
