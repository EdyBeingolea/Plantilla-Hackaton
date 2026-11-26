package pe.edu.vallegrande.contracts;

public enum QualityRule {

    CAMPO_REQUERIDO("COMPLETITUD", "Falta un valor obligatorio");

    private final String dimension;

    private final String descripcion;

    QualityRule(String dimension, String descripcion) {
        this.dimension = dimension;
        this.descripcion = descripcion;
    }

    public String dimension() {
        return dimension;
    }

    public String descripcion() {
        return descripcion;
    }
}
