package cl.ipp.centralizador.repository;

import cl.ipp.centralizador.model.Disease.Etapa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaRepository extends CrudRepository<Etapa, Integer> {
}
