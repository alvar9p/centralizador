package cl.ipp.centralizador.model.disease.enums;

import lombok.Getter;

public enum Clasification {
    INMEDIATA("Notificación inmediata"),
    DIARIA("Notificación diaria"),
    CENTINELA("Notificación en centros centinelas");

    @Getter
    private final String label;

    Clasification(String label) {
        this.label = label;
    }
}
