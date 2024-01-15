package cl.ipp.centralizador.model.disease;

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

    @Column(name = "cares")
    private String cares;

    @Column(name = "considerations")
    private String considerations;

    public Symptom(String symptomName, String cares, String considerations) {
        this.symptomName = symptomName;
        this.cares = cares;
        this.considerations = considerations;
    }
}
