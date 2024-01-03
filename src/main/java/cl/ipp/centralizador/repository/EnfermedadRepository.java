package cl.ipp.centralizador.repository;

import cl.ipp.centralizador.model.disease.Enfermedad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermedadRepository extends CrudRepository<Enfermedad, Integer> {


}
