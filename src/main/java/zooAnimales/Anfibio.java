package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Anfibio extends Animal{
	private List<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	
	


	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona,
			String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}

	public static int cantidadAnfibios() {
		return ranas+salamandras;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, zona,
			"rojo", true);
		listado.add(rana);
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, zona,
				"negro y amarillo", false);
			listado.add(salamandra);
			salamandras++;
	}
	
	
	
	
	
	

	public List<Anfibio> getListado() {
		return listado;
	}

	public void setListado(List<Anfibio> listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	

	
}
