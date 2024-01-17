package cl.ipp.centralizador.model.disease;

import cl.ipp.centralizador.model.disease.enums.StageID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "Stage")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stage")
    private Integer idStage;

    @ManyToOne
    @JoinColumn(name = "disease_id_enf") // Nombre de la columna de la clave externa
    private Disease disease;

    @Column(name = "stage_name")
    private StageID stageID;

    @Column(name = "stage_identifier")
    private String stageIdentifier;

    @Column(name = "stage_desc")
    private String stageDesc;

    @Column(name = "duration")
    private int duration;

    @Column(name = "symptom")
    private String symptomName;

    @Column(name = "care")
    private String symptomCare;

    @Column(name = "consideration")
    private String symptomConsideration;

    public Stage(String stageIdentifier, String stageDesc, int duration) {
        this.stageIdentifier = stageIdentifier;
        this.stageDesc = stageDesc;
        this.duration = duration;
    }

    public Stage(StageID stageID, String stageIdentifier, String stageDesc, int duration) {
        this.stageID = stageID;
        this.stageIdentifier = stageIdentifier;
        this.stageDesc = stageDesc;
        this.duration = duration;
    }



/*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEtapa == null) ? 0 : idEtapa.hashCode());
        // Excluir la referencia cruzada a Sintoma en el cálculo del código hash
        // result = prime * result + ((sintoma == null) ? 0 : sintoma.hashCode());
        result = prime * result + ((nombreEtapa == null) ? 0 : nombreEtapa.hashCode());
        // ... otros campos
        return result;
    }*/
}