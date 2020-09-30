package zooAnimales;

import java.util.*;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	
	public String movimiento() {
		return "desplazarse";
		
	}
	
	
	public static String totalPorTipo() {
		String mensaje = "Mamiferos: "+ Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + 
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
		return mensaje;
	}
	
	
	public String toString() {
		if(zona != null){
			String mensaje = String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, this.zona.getNombre(), this.zona.getZoo().getNombre());
			return mensaje;
			
		} else {
			String mensaje = String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s", nombre, edad, habitat, genero);
			return mensaje;
		}
		
		
		
	}
	
	

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	

	
}
