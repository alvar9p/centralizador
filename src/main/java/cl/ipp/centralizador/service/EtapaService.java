package cl.ipp.centralizador.service;

import cl.ipp.centralizador.model.Disease.Etapa;
import cl.ipp.centralizador.repository.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtapaService {

    @Autowired
    EtapaRepository etapaRepository;

    public EtapaService(EtapaRepository etapaRepository) {
        this.etapaRepository = etapaRepository;
    }

    public Etapa crearEtapa(Etapa etapa){
        return etapaRepository.save(etapa);
    }

    public Iterable<Etapa> listarEtapas() {
        return etapaRepository.findAll();
    }
}
