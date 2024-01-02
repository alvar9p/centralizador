package cl.ipp.centralizador.model.Disease.enums;

import lombok.Getter;

public enum Tipo {
    Viral("Enfermedad del tipo viral"),
    Bacteriana("Enfermedad del tipo bacteriana"),
    Otro("Otros agentes o sustancias químicas"),
    ProblemaDeSalud("Problema de salud");

    @Getter
    private final String label;

    Tipo(String label) {
        this.label = label;
    }
}
