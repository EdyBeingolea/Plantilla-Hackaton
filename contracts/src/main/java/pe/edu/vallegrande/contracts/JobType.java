package pe.edu.vallegrande.contracts;

import java.util.List;

public enum JobType {

    PLANTILLA(
            "job-plantilla",
            "pe.edu.vallegrande.job.plantilla.PlantillaJob",
            "plantilla",
            List.of("paises", "cantidades")
    );

    public static final JobType DEFAULT = PLANTILLA;

    private final String modulo;

    private final String mainClass;

    private final String label;

    private final List<String> goldTables;

    JobType(String modulo, String mainClass, String label, List<String> goldTables) {
        this.modulo = modulo;
        this.mainClass = mainClass;
        this.label = label;
        this.goldTables = goldTables;
    }

    public String modulo(){
        return modulo;
    }

    public String jar(){
        return modulo + ".jar";
    }

    public String mainClass(){
        return mainClass;
    }

    public String label() {
        return label;
    }

    public List<String> goldTables(){
        return goldTables;
    }
}
