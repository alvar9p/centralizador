package cl.ipp.centralizador.model.person;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String fechaNacimiento;

}
