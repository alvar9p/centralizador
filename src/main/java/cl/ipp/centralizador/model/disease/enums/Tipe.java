package cl.ipp.centralizador.model.disease.enums;

import lombok.Getter;

public enum Tipe {
    Viral("Enfermedad del tipo viral"),
    Bacteriana("Enfermedad del tipo bacteriana"),
    Otro("Otros agentes o sustancias químicas"),
    ProblemaDeSalud("Problema de salud");

    @Getter
    private final String label;

    Tipe(String label) {
        this.label = label;
    }
}
