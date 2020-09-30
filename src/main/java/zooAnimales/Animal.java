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
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
	}
	
	
	public String movimiento() {
		return "desplazarse";
		
	}
	
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() + "Aves: " + Ave.cantidadAves() + "Repiles: " + Reptil.cantidadReptiles() + "Peces: " + Pez.cantidadPeces() + 
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	
	public String toString() {
		if(zona != null){
			String mensaje = String.format("Mi nombre es %s, tengo una edad de %s, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, this.zona.getNombre(), this.zona.getZoo().getNombre());
			return mensaje;
			
		}
		
		String mensaje = String.format("Mi nombre es %s, tengo una edad de %s, habito en %s y mi genero es %s", nombre, edad, habitat, genero, this.zona.getNombre());
		return mensaje;
		
		
	}

	
}
