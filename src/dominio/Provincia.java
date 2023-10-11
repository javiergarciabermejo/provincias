package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Municipio> municipios;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Agregar un municipio a la provincia
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    // Obtener la lista de municipios de la provincia
    public List<Municipio> getMunicipios() {
        return municipios;
    }

    // Método para calcular el número total de habitantes de la provincia
    public int calcularTotalHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.calcularTotalHabitantes();
        }
        return totalHabitantes;
    }

    // Método para mostrar información de la provincia y sus municipios
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Provincia: ").append(nombre).append("\n");
        sb.append("Municipios:\n");
        for (Municipio municipio : municipios) {
            sb.append(municipio.toString()).append("\n");
        }
        sb.append("Número total de habitantes de la provincia: ").append(calcularTotalHabitantes()).append("\n");
        return sb.toString();
    }
}


