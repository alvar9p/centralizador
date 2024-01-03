package cl.ipp.centralizador.model.disease.enums;

import lombok.Getter;

public enum Clasificacion {
    INMEDIATA("Notificación inmediata"),
    DIARIA("Notificación diaria"),
    CENTINELA("Notificación en centros centinelas");

    @Getter
    private final String label;

    Clasificacion(String label) {
        this.label = label;
    }
}
