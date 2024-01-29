package cl.ipp.centralizador.model.disease;

import cl.ipp.centralizador.model.disease.enums.StageID;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "Etapa")
public class Etapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etapa")
    private Integer idEtapa;

    @ManyToOne
    @JoinColumn(name = "enfermedad_id_enf") // Nombre de la columna de la clave externa
    private Enfermedad enfermedad;

    @Column(name = "nombre_etapa")
    private StageID nombreEtapa;

    @Column(name = "nombre_identif")
    private String nombreIdentificador;

    @Column(name = "descripcion")
    private String descripcionEtapa;

    @Column(name = "duracion_etapa")
    private int duracionEtapa;

    public Etapa(StageID nombreEtapa, String descripcionEtapa, int duracionEtapa) {
        this.nombreEtapa = nombreEtapa;
        this.descripcionEtapa = descripcionEtapa;
        this.duracionEtapa = duracionEtapa;
    }

    public Etapa(StageID nombreEtapa, String nombreIdentificador, String descripcionEtapa, int duracionEtapa) {
        this.nombreEtapa = nombreEtapa;
        this.nombreIdentificador = nombreIdentificador;
        this.descripcionEtapa = descripcionEtapa;
        this.duracionEtapa = duracionEtapa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEtapa == null) ? 0 : idEtapa.hashCode());
        // Excluir la referencia cruzada a Sintoma en el cálculo del código hash
        // result = prime * result + ((sintoma == null) ? 0 : sintoma.hashCode());
        result = prime * result + ((nombreEtapa == null) ? 0 : nombreEtapa.hashCode());
        // ... otros campos
        return result;
    }
}