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
    private Integer idEnf;

    @Column(name = "codigo_enf")
    private String codigoEnf;

    @Column(name = "nombre_enf")
    private String nombreEnfermedad;

    @Column(name = "clasificacion_enf")
    private Clasification clasificationEnfermedad;

    @Column(name = "tipo_enf")
    private Tipe tipeEnfermedad;

    @Column(name = "duracion_enf")
    private Integer duracionEnfermedad;

    @OneToMany(mappedBy = "enfermedad", cascade = CascadeType.ALL)
    private List<Etapa> etapasEnf = new ArrayList<>();

    // Enfermedad sin Etapas
    public Disease(String codigoEnf, String nombreEnfermedad, Clasification clasificationEnfermedad, Tipe tipeEnfermedad, Integer duracionEnfermedad) {
        this.codigoEnf = codigoEnf;
        this.nombreEnfermedad = nombreEnfermedad;
        this.clasificationEnfermedad = clasificationEnfermedad;
        this.tipeEnfermedad = tipeEnfermedad;
        this.duracionEnfermedad = duracionEnfermedad;
    }

    // Enfermedad con Etapas
    public Disease(String codigoEnf, String nombreEnfermedad, Clasification clasificationEnfermedad,
                   Tipe tipeEnfermedad, Integer duracionEnfermedad, List<Etapa> etapasEnf) {
        this.codigoEnf = codigoEnf;
        this.nombreEnfermedad = nombreEnfermedad;
        this.clasificationEnfermedad = clasificationEnfermedad;
        this.tipeEnfermedad = tipeEnfermedad;
        this.duracionEnfermedad = duracionEnfermedad;
        this.etapasEnf = etapasEnf;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "idEnf=" + idEnf +
                ", codigoEnf='" + codigoEnf + '\'' +
                ", nombreEnfermedad='" + nombreEnfermedad + '\'' +
                ", clasificacionEnfermedad=" + clasificationEnfermedad +
                ", tipoEnfermedad=" + tipeEnfermedad +
                ", duracionEnfermedad=" + duracionEnfermedad +
                '}';
    }
}