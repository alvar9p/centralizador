package cl.ipp.centralizador.model.person;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario extends Persona{

    private String id;
    private String especialidad;

    public Funcionario(String nombre, String apellidoPaterno, String apellidoMaterno, String sexo, String fechaNacimiento,  String id, String especialidad) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, fechaNacimiento);
        this.especialidad = especialidad;
    }

}
