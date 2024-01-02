package cl.ipp.centralizador.model.Disease;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "Sintoma")
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSymptom;

    @Column(name = "sintoma")
    private String symptomName;

    @ElementCollection
    @CollectionTable(name = "care", joinColumns = @JoinColumn(name = "symptom_id"))
    @Column(name = "care")
    private List<String> cares;

    @ElementCollection
    @CollectionTable(name = "consideration", joinColumns = @JoinColumn(name = "symptom_id"))
    @Column(name = "consideration")
    private List<String> considerations;

    public Symptom(String symptomName, List<String> cares, List<String> considerations) {
        this.symptomName = symptomName;
        this.cares = cares;
        this.considerations = considerations;
    }
}
