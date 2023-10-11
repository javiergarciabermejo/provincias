package dominio;

import java.util.ArrayList;
import java.util.List;


public class Municipio {
    private String nombre;
    private List<Localidad> localidades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    
    public List<Localidad> getLocalidades() {
        return localidades;
    }

    
    public int calcularTotalHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getHabitantes();
        }
        return totalHabitantes;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Municipio: ").append(nombre).append("\n");
        sb.append("Localidades:\n");
        for (Localidad localidad : localidades) {
            sb.append(localidad.toString()).append("\n");
        }
        sb.append("Número total de habitantes: ").append(calcularTotalHabitantes()).append("\n");
        return sb.toString();
    }
}

