package cl.ipp.centralizador.model.person;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente extends Persona{

        private Integer id;
        //private Enfermedad enfermedad;
        private int idEnfermedad;
        private int idEtapa;
        private String nombre;
        private int edad;
        private String genero;
        private String region;
        private String comuna;
        private Date fechaNotificacion;
        private Date fechaAlta;
        private String datosContacto;
        private String datosContactoTerceraPersona;

}
