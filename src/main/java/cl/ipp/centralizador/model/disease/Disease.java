package cl.ipp.centralizador.model.disease;

import cl.ipp.centralizador.model.disease.enums.Clasification;
import cl.ipp.centralizador.model.disease.enums.Tipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "Disease")
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enf")
    private Integer idDisease;

    @Column(name = "codigo_enf")
    private String internalCode;

    @Column(name = "nombre_enf")
    private String diseaseName;

    @Column(name = "clasificacion_enf")
    private Clasification diseaseClasification;

    @Column(name = "tipo_enf")
    private Tipe tipeOfDisease;

    @Column(name = "duracion_enf")
    private Integer diseaseDuration;

    @OneToMany(mappedBy = "disease", cascade = CascadeType.ALL)
    private List<Stage> diseaseStage = new ArrayList<>();

    // Enfermedad sin Etapas
    public Disease(String internalCode, String diseaseName, Clasification diseaseClasification, Tipe tipeOfDisease, Integer diseaseDuration) {
        this.internalCode = internalCode;
        this.diseaseName = diseaseName;
        this.diseaseClasification = diseaseClasification;
        this.tipeOfDisease = tipeOfDisease;
        this.diseaseDuration = diseaseDuration;
    }

    // Enfermedad con Etapas
    public Disease(String internalCode, String diseaseName, Clasification diseaseClasification, Tipe tipeOfDisease, Integer diseaseDuration, List<Stage> diseaseStage) {
        this.internalCode = internalCode;
        this.diseaseName = diseaseName;
        this.diseaseClasification = diseaseClasification;
        this.tipeOfDisease = tipeOfDisease;
        this.diseaseDuration = diseaseDuration;
        this.diseaseStage = diseaseStage;
    }
}