package cl.ipp.centralizador.model.disease;

import cl.ipp.centralizador.model.disease.enums.Clasificacion;
import cl.ipp.centralizador.model.disease.enums.Tipo;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "Enfermedad")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enf")
    private Integer idEnf;

    @Column(name = "codigo_enf")
    private String codigoEnf;

    @Column(name = "nombre_enf")
    private String nombreEnfermedad;

    @Column(name = "clasificacion_enf")
    private Clasificacion clasificacionEnfermedad;

    @Column(name = "tipo_enf")
    private Tipo tipoEnfermedad;

    @Column(name = "duracion_enf")
    private Integer duracionEnfermedad;

    @OneToMany(mappedBy = "enfermedad", cascade = CascadeType.ALL)
    private List<Etapa> etapasEnf = new ArrayList<>();

    // Enfermedad sin Etapas
    public Enfermedad(String codigoEnf, String nombreEnfermedad, Clasificacion clasificacionEnfermedad, Tipo tipoEnfermedad, Integer duracionEnfermedad) {
        this.codigoEnf = codigoEnf;
        this.nombreEnfermedad = nombreEnfermedad;
        this.clasificacionEnfermedad = clasificacionEnfermedad;
        this.tipoEnfermedad = tipoEnfermedad;
        this.duracionEnfermedad = duracionEnfermedad;
    }

    // Enfermedad con Etapas
    public Enfermedad(String codigoEnf, String nombreEnfermedad, Clasificacion clasificacionEnfermedad,
                      Tipo tipoEnfermedad, Integer duracionEnfermedad, List<Etapa> etapasEnf) {
        this.codigoEnf = codigoEnf;
        this.nombreEnfermedad = nombreEnfermedad;
        this.clasificacionEnfermedad = clasificacionEnfermedad;
        this.tipoEnfermedad = tipoEnfermedad;
        this.duracionEnfermedad = duracionEnfermedad;
        this.etapasEnf = etapasEnf;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "idEnf=" + idEnf +
                ", codigoEnf='" + codigoEnf + '\'' +
                ", nombreEnfermedad='" + nombreEnfermedad + '\'' +
                ", clasificacionEnfermedad=" + clasificacionEnfermedad +
                ", tipoEnfermedad=" + tipoEnfermedad +
                ", duracionEnfermedad=" + duracionEnfermedad +
                '}';
    }
}