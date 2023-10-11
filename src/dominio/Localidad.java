package dominio;

public class Localidad{
	private String nombre;
	private String numerodeHabitantes;
	private int habitantes;

	public Localidad(String nombre, String numerodeHabitantes){
		this.nombre = nombre; 	
		this.numerodeHabitantes = numerodeHabitantes;
		this.habitantes = habitantes;
		
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setNumerodeHabitantes(String numerodeHabitantes){
		this.numerodeHabitantes = numerodeHabitantes;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getNumerodeHabitantes(){
		return numerodeHabitantes;
	}

	public int getHabitantes(){
		return habitantes;

	}

   public String toString() {
        return "Localidad: " + nombre + "Numero de habitantes: " + numerodeHabitantes + "Habitantes: " + habitantes;



}

}

