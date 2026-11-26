package pe.edu.vallegrande.contracts;

import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PlantillaSchema {

    public static final String PLANTILLA = "plantilla";

    public static final List<String> TABLES = List.of(PLANTILLA);

    public static final Map<String, List<String>> COLUMNS = Map.of(
            PLANTILLA, List.of("Customer Age", "Customer Gender", "Country", "State", "Product Category",
                    "Sub Category", "Quantity", "Unit Cost", "Unit Price", "Cost", "Revenue", "Profitability")
    );

    public static final Map<String, List<String>> KEYS = Map.of(
            PLANTILLA, List.of("Product Category")
    );

    public static final Map<String, Set<String>> OPTIONAL_COLUMNS = Map.of(
            PLANTILLA, Set.of("Date", "Year", "Month")
    );


    public static final List<String> ATTENDANCE_STATES = List.of("P", "T", "F", "J");

    public static final int MAX_COLUMNS_PER_TABLE = 200_000;

    public static final long MAX_BYTES_PER_COLUMNS = 20L * 1024 * 1024;

    public static final int MAX_CELLS_LENGTH = 200;

    public static final String RULES_VERSION = "2.0.0";

    private PlantillaSchema() {

    }

    public static List<String> columns(String table) {
        List<String> columns = COLUMNS.get(table);
        if (columns == null) {
            throw new IllegalArgumentException("Tabla desconocida" + table);
        }
        return columns;
    }

    public static boolean optionals(String table, String columns) {
        return OPTIONAL_COLUMNS.getOrDefault(table, Set.of()).contains(columns);
    }


}
